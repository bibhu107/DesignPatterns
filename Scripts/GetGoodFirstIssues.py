# If you are a new to open source and want to try easy issues first then this script can be useful
# To run this script you must have GithubPersonalToken
# Sample running command 
#  python3 GetGoodFirstIssues.py --period 10 --stars 2000 --language java

import argparse
from datetime import datetime, timedelta
from getpass import getpass
from github import Github

# Parse command-line arguments
parser = argparse.ArgumentParser()
parser.add_argument('--period', type=int, default=180,
                    help='Filter issues by age in days (default: 180)')
parser.add_argument('--stars', type=int, default=2000,
                    help='Filter repositories by stars (default: 2000)')
parser.add_argument('--language', type=str, default='java',
                    help='Filter repositories by programming language (default: java)')
args = parser.parse_args()

# Access the Github API with personal access token
github_personal_token = getpass("Enter github personal token: ")
try:
    g = Github(github_personal_token)
except:
    print("Error: Unable to access Github API")

# Search for repositories with the specified language and stars > args.stars
query = f"language:{args.language} stars:>{args.stars}"
results = g.search_repositories(query)

# Print the list of good first issues in each repository, sorted by creation date and filtered by age
# Filter issues that are not assigned or marked as stale for more than 14 days
for repo in results:
    issues = repo.get_issues(labels=["good first issue"])
    issues = sorted(issues, key=lambda issue: issue.created_at)
    period_ago = datetime.now() - timedelta(days=args.period)
    new_issues = [issue for issue in issues if issue.created_at > period_ago and (not issue.assignee or (issue.stale and issue.updated_at < period_ago - timedelta(days=14)))] # modify this line
    for issue in new_issues:
        print(f"{repo.name}: {issue.title} - {issue.html_url}")
