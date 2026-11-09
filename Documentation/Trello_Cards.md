# Trello board: "StudySpot – MAD Sprints"
Lists: Product Backlog | Sprint 1 | In Progress | In Review | Done | Sprint Review
Labels: Feature (green) · Security (red) · Documentation (blue) · Bug (orange)

## Sprint 1 cards (put in "Sprint 1")
- US1 Set up Git repo, .gitignore, README, branching [2]  (Documentation)
  - [ ] Repo created on GitHub  - [ ] .gitignore excludes secrets  - [ ] README pushed  - [ ] first commit
- US2 Create Trello board with backlog and estimates [2]  (Documentation)
  - [ ] lists  - [ ] labels  - [ ] all stories added
- US3 Splash screen [1]  (Feature)
  - [ ] shows app name  - [ ] moves to Home after 1.5s  - [ ] back button doesn't return to splash
- US4 Navigation between screens [2]  (Feature)
  - [ ] NavHost with 4 routes  - [ ] back navigation works
- US5 List of study spots on Home [3]  (Feature)
  - [ ] LazyColumn of cards  - [ ] shows name, location, noise level
- US6 Detail screen with id passed from list [3]  (Feature, Security)
  - [ ] id passed as route argument  - [ ] unknown id shows error text, no crash
- US7 Portrait/landscape works [2]  (Feature)
  - [ ] rotate emulator, no crash, state kept

## Product Backlog (later sprints)
- Sprint 2: Room database for favourites [5]; Favourites screen [3]; favourite toggle on detail [2]
- Sprint 3: Retrofit + Overpass API HTTPS [5]; cache spots in Room for offline [3]; loading/error states [2]
- Sprint 4: Location permission with rationale [3]; sort by distance [3]; camera photo of spot [3]
- Sprint 5: Landscape/tablet layouts [3]; unit/UI tests [3]; security + GDPR review [2]; screen recordings + slides [3]
