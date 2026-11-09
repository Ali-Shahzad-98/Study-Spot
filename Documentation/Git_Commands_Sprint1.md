# Git commands for Sprint 1 (run in Android Studio Terminal)
git init
git add .gitignore README.md
git commit -m "chore: initial commit with README and gitignore (US1)"
git branch -M main
git remote add origin https://github.com/<you>/studyspot.git
git push -u origin main

git checkout -b feature/splash-nav
git add . && git commit -m "feat: splash screen and NavHost (US3, US4)"
git checkout main && git merge feature/splash-nav

git checkout -b feature/spot-list-detail
git add . && git commit -m "feat: spot list, detail screen with id argument (US5, US6)"
git checkout main && git merge feature/spot-list-detail

git add . && git commit -m "test: SpotRepository unit tests"
git tag sprint-1
git push origin main --tags
