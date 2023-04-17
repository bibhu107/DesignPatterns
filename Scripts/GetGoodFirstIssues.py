from github import Github

# Access the Github API with personal access token
try:
    g = Github("<personal_access_token>")
except:
    print("Error: Unable to access Github API")

# Search for repositories with Java language and stars > 2000
query = "language:java stars:>2000"
results = g.search_repositories(query)

# Print the list of good first issues in each repository
for repo in results:
    issues = repo.get_issues(labels=["good first issue"])
    for issue in issues:
        print(f"{repo.name}: {issue.title} - {issue.html_url}")
