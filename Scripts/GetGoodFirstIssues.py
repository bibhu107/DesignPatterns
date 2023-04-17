# To run this script you must have GithubPersonalToken
#Sample running command python myscript.py --period 30 --stars 5000

import argparse
from datetime import datetime, timedelta
from github import Github

# Parse command-line arguments
parser = argparse.ArgumentParser()
parser.add_argument('--period', type=int, default=180,
                    help='Filter issues by age in days (default: 180)')
parser.add_argument('--stars', type=int, default=2000,
                    help='Filter repositories by stars (default: 2000)')
args = parser.parse_args()

# Access the Github API with personal access token
github_personal_token = input("Enter github personal token: ")
try:
    g = Github(github_personal_token)
except:
    print("Error: Unable to access Github API")

# Search for repositories with Java language and stars > args.stars
query = f"language:java stars:>{args.stars}"
results = g.search_repositories(query)

# Print the list of good first issues in each repository, sorted by creation date and filtered by age
for repo in results:
    # Get issues with label 'good first issue' and sort them by creation date
    issues = repo.get_issues(labels=["good first issue"])
    issues = sorted(issues, key=lambda issue: issue.created_at)
    
    # Filter issues created no older than 'args.period' days ago
    period_ago = datetime.now() - timedelta(days=args.period)
    new_issues = [issue for issue in issues if issue.created_at > period_ago]
    
    # Print repository name, issue title, and link to the issue
    for issue in new_issues:
        print(f"Repository: {repo.name}")
        print(f"Issue title: {issue.title}")
        print(f"Issue link: {issue.html_url}")
        print()  # Print a blank line between issues for readability
