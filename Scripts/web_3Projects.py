from github import Github
import requests
import argparse

# Parse command-line arguments
parser = argparse.ArgumentParser()
parser.add_argument('--language', type=str, default='Solidity',
                    help='Filter repositories by language (default: Solidity)')
args = parser.parse_args()

# Access the Github API with anonymous access
g = Github()

# Search for repositories with the specified topic and language
query = f"topic:web3 language:{args.language}"
results = g.search_repositories(query)

# Print the list of repositories
for repo in results:
    print(f"{repo.name}: {repo.description} - {repo.html_url}")
