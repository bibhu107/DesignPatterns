from datetime import datetime, timedelta
from github import Github

# Access the Github API with personal access token
github_personal_token = input("Enter github personal token: ")
try:
    g = Github(github_personal_token)
except:
    print("Error: Unable to access Github API")

# Search for repositories with Java language and stars > 2000
query = "language:java stars:>2000"
results = g.search_repositories(query)

# Print the list of good first issues in each repository, sorted by creation date and filtered by age
for repo in results:
    issues = repo.get_issues(labels=["good first issue"])
    issues = sorted(issues, key=lambda issue: issue.created_at)
    six_months_ago = datetime.now() - timedelta(days=180)
    new_issues = [issue for issue in issues if issue.created_at > six_months_ago]
    for issue in new_issues:
        print(f"{repo.name}: {issue.title} - {issue.html_url}")
