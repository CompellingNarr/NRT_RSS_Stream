# Bootstrapping the NRT_RSS_Stream project

This documents covers the following:

  -- Creation of project using Maven

  -- Creation of local git repo

  -- Creation of remote git repo on github.com

  -- How to clone project to other local git repos

  -- How to work on project using Unix command line (CL) tools, as well as IDEs


##1. Create project on local workstation using Maven

````
  cd ~/Desktop/Projects/staging
  mvn archetype:generate                                 \
    -DgroupId=com.cn.nrt_feed                            \
    -DartifactId=cn_rss_poller                           \
    -DarchetypeArtifactId=maven-archetype-quickstart

    version: 0.0.20150604.2030
  cd cn_rss_poller
```
Refactor
  -- change "App.java" to "CnRssPoller.java" 
  -- change "AppTest.java" to "CnRssPollerTest.java"

##2. Create a local git repo from the command line

```
  git init
  git add pom.xml
  git add src/main/java/com/cn/nrt_feed/CnRssPoller.java
  git add src/test/java/com/cn/nrt_feed/CnRssPollerTest.java
  git commit
```

##3. Create a remote git repo on github.com

Create SSH key for your local workstation, and associate it with your
account on github.

  Create new ssh key pair if not already created.

    https://help.github.com/articles/generating-an-ssh-key

  Associate your public key with github account

    https://github.com/settings/ssh


Push local git repo to Github remote

```
  git remote add origin git@github.com:RobertBWeidlich/NRT_RSS_Stream.git
  git push -u origin master
```

##4. Create local git repo on another Linux workstation from the Github remote

Create SSH key for your local workstation, and associate it with your
account on github. (See step #3 above)

```
  git clone https://github.com/RobertBWeidlich/NRT_RSS_Stream.git
    OR
  git clone github.com:RobertBWeidlich/NRT_RSS_Stream.git
```

Note: try one of the above; if you can not push to remote git repo,
try the other


##6. NetBeans 8.1

  Using the Linux command line:

```
    cd ~/Desktop/Projects
    mkdir gh_nb
    cd gh_nb

    git clone https://github.com/RobertBWeidlich/NRT_RSS_Stream.git
      OR
    git clone github.com:RobertBWeidlich/NRT_RSS_Stream.git

    cd ~/Desktop/Projects/gh_nb/NRT_RSS_Stream
```

  Start Netbeans

```
  File -> Open Project ->
  Desktop/Projects/gh_nb/NRT_RSS_Stream ->
  Open Project
```

Alternatively..

```
    Projects Window --right-click--> New Project ->
      Project with Existing POM ->
      Next ->
      Finish -> drill down into ~/Desktop/Projects/gh_nb ->
      Open Project
```


##7. Eclipse

##8. IntelliJ

##9. Windows

Install GitHub Windows tools, and then use them to run "bash" and then
run "Git Shell" to install project from github.com.

##10. Mac

Install Home Brew (brew) or Mac Ports (port), and install Maven.
Then use command line instructions to install project from github.com

##11. Command Line (move from README.md)

##TODO

 1. Revisit naming convention

```
    Github Name:              github.com/RobertBWeidlich/NRT_RSS_Stream
    Maven project.groupId:    com.cn.nrt_feed
    Maven project.artifactId: cn_rss_poller
    Maven project.name:       cn_rss_poller
    Application FQN:          com.cn.nrt_feed.CnRssPoller
```

