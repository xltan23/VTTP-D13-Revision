# Reference

## Maven Command

1. mvnw

2. mvnw compile
 
3. mvnw spring-boot:run

4. mvnw clean package spring-boot:run

5. mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000"

6. mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000 --dataDir=c:\data

7. mvnw clean testS

## Git Command

1. git init (initialise a local repo, doesn't link to remote yet)

2. <Create git remote repo> 

3. git remote add origin https://github.com/<user>/<reponame>.git

4. git add * (adding new/updated files to local repo)

5. git status (to check files that are going to commit into local repo)

6. git commit -m "<commit message>" (commit new/updated files to local repo)

7. git push -u origin master (create a master branch in github and push code into that branch)

8. <DO NOT DEVELOP IN MASTER BRANCH until final/latest baseline>

9. git checkout -b develop master (clone copy from master to develop branch locally)

10. git push -u origin develop (push from local develop branch to github develop branch)

11. git checkout develop (to switch between branches)

12. git branch -a (show all local branches and remote branch references)

13. git branch (show all local branches)

14. <ALWAYS DEVELOP IN DEVELOP BRANCH>

15. git add *

16. git commit -m "<commit changes>"

17. git push -u origin develop (push code on local develop branch to github develop branch)

18. git checkout master

19. git merge develop (after changes in develop branch are complete without errors, merge changes from develop branch)

20. git push -u origin master (in master branch to push merged changes from develop branch to github master branch)

## Develop to Heroku

1. Create/use an existing heroku account

2. On your project root, you NEED a system.properties file

3. Put the following line in system.properties file: java.runtime.version=18

4. git add *

5. git commit -m "<updates>"

6. git push -u origin master

7. heroku login

8. heroku apps:create

9. git remote -v (all remote branches, you should see reference URL to heroku)

10. git push -u heroku master (push to heroku master branch)