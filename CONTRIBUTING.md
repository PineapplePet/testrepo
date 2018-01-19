# How to start contributing!
First thing first, the master branch is protected. This means that you are
unable to push directly to the master branch. Why? It is because we want to
force you to code review and to utilize the Jenkins-CI, also because
**Martin don't trust you** (I also distrust you, however I distrust everyone, so don't feel
flattered <3).
This is why we use branches.
## Branching
To begin a new task or issue you need to notify the team that the issue or
task is being worked upon. You need to have the latest revision of the source
code before branching. Create a branch named after the issue or task. Push the
branch to the origin to make it easily visible to the other team members what
every one is working on. Code until you are finished with the task. Don't be
afraid to make commits to the branch in the shared repository, it is a good
thing!
## Tests
Before you start coding on a issue or a task create a **failing** test that
checks if the functionality of the code to be implemented. Then you easily
know when a feature is ready for refactoring and a pull request. 
This is called test driven development (TDD) and is the base of agile
development. No new feature will be admitted to the shared repository without
a test case that tests the functionality of said feature.
## Pull-request
Create a pull-request by visiting the Github page and navigate to the branch
you want to create a pull request on. Then a button should be visible that
states if it is pressed you will review the changes and create a pull request
to the main branch (or any other, your choice). You will then need to write a
summary of what has been introduced in this patch and what/which issues/tasks
are done if this pull request is accepted into the master branch. 
### Commit messages
A commit message shall consist of:
* A small and concise headline.
* A summary of what the pull request adds to the project.
* A list of closed issues/tasks.
* A signature of the developers.

An example of a great commit message:
```
Refactoring of the super secret file

The supre secret file has been a mess since the start and we have together
refactored the file so it now has the same functionality while improving the
readability of the code.

We also added a missing testcase of the super secret file to the unittests.
The new testcase tests the secret capabillities of the super secret file. 

closes #365

Signed-off-by: mattemagikern &lt;mattemagikern@gmail.com&gt; MartinJohansson &lt;MartinJohansson@gmail.com&gt;
```

## Code review
Code reviewing is shown to increase the work flow of software teams and the
overall quality of a software project. The reviewing of each others commits is
a necessity to keep up the code quality and to learn from each others.

A patch almost **NEVER** gets in without some revisions after a review so
don't take it personal. It is a huge difference between people and things. 
### Review questions
When reviewing another persons code ask your self these questions:

**----------- Code Quality -----------** 


* Does the code work? Does it perform its intended function, the logic is correct, etc?
* Are invalid parameter values handled where needed?
* Can any function attributes be used?
* Are variables/functions named intuitively?
* Is the code modular enough?
* Is debugging code/prints removed?
* Is there sufficient code documentation?
* Does it follow the code patterns?

**------------- Understanding ---------------**


* Is the code easily understood?
* Can the code be better refactored?


**------------- Tests -------------------**


* Are CI builds passing? If no, why?
* Is code covered by functional or unit tests?

When writing critique:
1. Be nice, describe what is good with the request. What can be changed and
   how to to make the change.
2. If you are uncertain of something: **ASK!** It is important that everything
   is easily understood and that everyone can help contribute to all code. If
   there is only one team member who understands the code it should be made
   understandable or the commit shouldn't be in the master branch.
3. Don't be afraid to start a discussion of design choices. 
# Summary
**How to make a change** 
1. have the latest revision of the source code.
2. Notify the team of your intentions(comment on the issue or change the state
   of the task to in progress). 
3. create a branch by issuing: `git checkout -b "<branch_name>"`.
4. Make a small commit and push the branch to the shared repository by
   issuing: `git push origin <branch_name>`.
5. Continue until the issue or task is done.
6. Create a Pull-request on the Github page after the last commit is done.

* **A review asking for a remake is never a bad thing** 
* **Review as thouroghly as possible**
* **Give constructive feedback**
* **Profit** 
