# testrepo
Testing!

* **git add <file(s)>** - stages the selected files, directories, bin files
  for commit.

* **git commit** - throws you inside a text editor of choice and lets you
  write what changes you've made and what issue it closes. **Don't** forget to
  sign off your commits to let the others see who made the change! 

* **git staus** - shows you what has been changed since the last commit in the
  working tree. It will show you unstaged files, untracked files and files
  stages for commit. 

* **git diff <sha-1 code>** - shows you all changes made since the commit
  specified by the sha-1 code. It defaults to the latest commit. 

* **git log** - shows you the git history. 

* **git push** - pushes the files staged for commit to the upstream repository
  or the main repository to a pull request. 

* **git pull** - gets the latest revision from the upstream repository and
  merges it with your current files. 

* **git stash** - stashes the untraced or uncommitted files in your directory
  to so it later can be applied on top of a new commit.

* **git stash pop** - applies the most resent stash to your current working
  directory and throws away stashed items from the stash. 

* **git stash apply** - same as above but doesn't throw away the changes. 
