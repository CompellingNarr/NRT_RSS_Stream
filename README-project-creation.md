## Bootstrapping the NRT_RSS_Stream project

These are step-by-step instructions on how this project was generated,
and covers:

  1. Create project on local workstation using Maven

  2. Create a local git repository

  3. Create a remote git repository on github.com

  4. Create a local repository on another workstation from the remote
     github repository

1. Create SSH key for your local workstation, and associate it with your
  account on github.

    https://help.github.com/articles/generating-an-ssh-key

      Create new ssh key pair if not already created.

    https://github.com/settings/ssh

      Associate your public key with github account

2. create maven project from the command line

````
  cd ~/Desktop/Projects
  mvn archetype:generate                                 \
    -DgroupId=com.cn.nrt_feed                            \
    -DartifactId=cn_rss_poller                           \
    -DarchetypeArtifactId=maven-archetype-quickstart

    version: 0.0.20150604.2030
  cd cn_rss_poller
```
  [Refactor -- change "App.java" to "CnRssPoller.java"        ]
  [         -- change "AppTest.java" to "CnRssPollerTest.java"]

3. create local git repo from the command line

```
  git init
  git add pom.xml
  git add src/main/java/com/cn/nrt_feed/CnRssPoller.java
  git add src/test/java/com/cn/nrt_feed/CnRssPollerTest.java
  git commit
```

4. CL - push local git repo to Github remote

  SSH key from the local Linux machine must be installed on github.
  Refer to:
    https://help.github.com/articles/generating-ssh-keys/
  and
    https://github.com/settings/sshgit

```
  git remote add origin git@github.com:RobertBWeidlich/NRT_RSS_Stream.git
  git push -u origin master
```

5. Create local git repo on another Linux workstation from the Github remote

  Create and install SSH key on the workstation (see step #3)

```
  git clone https://github.com/RobertBWeidlich/NRT_RSS_Stream.git
    OR
  git clone github.com:RobertBWeidlich/NRT_RSS_Stream.git

```

##
## todo - fix the redundant sections 5.
##

6. NetBeans 8.1

  Using the Linux command line:

```
    cd ~/Desktop/Projects
    mv cn_rss_poller cn_rss_poller_orig
    mkdir gh_nb
    cd gh_nb

    git clone https://github.com/RobertBWeidlich/NRT_RSS_Stream.git
      OR
    git clone github.com:RobertBWeidlich/NRT_RSS_Stream.git

    cd ~/Desktop/Projects/gh_nb/NRT_RSS_Stream
```

#6. NetBeans 8.1
#
#  Using the Linux command line:
#
#```
#    cd ~/Desktop/Projects/gh_nb
#    git clone git@github.com:RobertBWeidlich/NRT_RSS_Stream.git
#```

  Start Netbeans

    File -> Open Project -> Desktop/Projects/gh_nb/NRT_RSS_Stream
    -> Open Project

    OR ???

    Projects Window --right-click--> New Project ->
      Project with Existing POM ->
      Next ->
      Finish -> drill down into ~/Desktop/Projects/gh_nb ->
      Open Project


7. Eclipse

8. IntelliJ

9. Windows?

10. Mac?

11. Command Line (move from README.md)

# TODO

 1. Convert all Readme file names to README.md and README-xxx.md

 2. Convert all Readme files to Markdown

 3. Revisit Naming convention

```
    Github Name:              github.com/RobertBWeidlich/NRT_RSS_Stream
    Maven project.groupId:    com.cn.nrt_feed
    Maven project.artifactId: cn_rss_poller
    Maven project.name:       cn_rss_poller
    Application FQN:          com.cn.nrt_feed.CnRssPoller
```


