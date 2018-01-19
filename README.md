# PVG-Team-Awesome
Repository for the best pvg team!

Welcome Team!

This project will be a little different to what you've might experienced
before. You will be a lot of people working together on a small project, this
will result in merge conflicts and other versioning control related problems. 

Also we will introduce you to how to efficiently use git on large scale
projects and how to use the full potential of Github. All our work will be up
on Github, the kanbanboard and code reviews will be performed using the Github
code reviewing tool. We will also use Travis-CI as our continuous integration
tool, this will be your best friend!

**Disclamer:** we won't be able to help you with git related problems unless
you use the terminal. If you choose to use a GUI client your on your own!
## Download & Setup the project
Enter the following command in the terminal:
``bash
git clone https://github.com/Mattemagikern/PVG-Team-Awesome.git
``
This will start downloading the project to your computer. 
# How to make a pull-request?
Because you are all selected as collaborators you can follow the normal
work-flow with git: git add, git commit, git push...
Although your changes won't be accepted into the master branch unless you get
your changes approved by two of your fellow students and on top of that a
flag from Travis-CI saying all the test was successfully run! Cumbersome
perhaps but this is to ensure the teams success and to minimize the time
patching past mistakes. 


# Måns Git-Guide!

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
