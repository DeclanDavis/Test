Git Push, Pull, Commit

I've made changes in my vs code file. I am in the branch declan-dog.

To check what branch I am in:

**git status**
This will say the branch you are in and if your local version has non pushed changes

``
PS C:\Users\Administrator\examplefilepath\Test> git status
On branch declan-dog
Your branch is up to date with 'origin/declan-dog'.

On branch declan-dog
Your branch is up to date with 'origin/declan-dog'.

Your branch is up to date with 'origin/declan-dog'.


Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   test.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        gitNotes.md

no changes added to commit (use "git add" and/or "git commit -a")
``

**git branch**
This will list all the branches and your branch will be in green

``
PS C:\Users\Administrator\examplefilepath\Test> git branch
* declan-dog
  main
``


**git add test.java** 
git add moves your changes to the staging area. Do this step before being able to commit. 

(
    git add <file>
    git add --all
)

**git commit -m"Message to appear on commit"**
This will commit your changes to be sent to gitHub.

``
PS C:\Users\Administrator\examplefilepath\Test> git commit -m"added a gitNotes.md file"
[declan-dog 7a024c1] added a gitNotes.md file
 2 files changed, 5 insertions(+)
 create mode 100644 gitNotes.md
``

**git push**
This is to send the commited changes to gitHub.

``
PS C:\Users\Administrator\examplefilepath\Test> git push
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (4/4), 448 bytes | 448.00 KiB/s, done.
Total 4 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/DeclanDavis/Test.git
   2aa4486..7a024c1  declan-dog -> declan-dog
``