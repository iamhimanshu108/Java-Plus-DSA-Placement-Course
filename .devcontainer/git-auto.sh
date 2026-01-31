#!/bin/bash

# Auto git pull, commit, push script
echo "Running auto git sync..."

# Pull latest changes
git pull

# Check if there are changes
if git diff --quiet && git diff --staged --quiet; then
    echo "No changes to commit."
else
    echo "Changes detected, committing..."
    git add .
    git commit -m "Auto commit $(date '+%Y-%m-%d %H:%M:%S')"
    git push
    echo "Committed and pushed."
fi

echo "Auto git sync complete."