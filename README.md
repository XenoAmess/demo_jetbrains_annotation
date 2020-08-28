# demo_jetbrains_annotation
This repo is created for demo jetbrains annotation.
For more details, it is for testing:
1. whether we NEED @NotNUll and @Nullable in runtime.
2. whether user who use the lib which contains jetbrains annotations be "infected" by these classes.
3. can the user's codes running correctly with the library codes, but without the annotations in runtime.

maven repo in subfolder "library" means the library.
maven repo in subfolder "user" means the user codes.

you can see more building details at github actions scripts in this repo.
you can see more result details at github actions running result.(surefire plugin)
