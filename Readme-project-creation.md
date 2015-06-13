Bootstrapping the NRT_RSS_Stream project
========================================

These are step-by-step notes on how this project was
created on a Linux workstation using Maven, a local Git
repository was created, then a remote Git repository
was created on github.com.

1. create maven project from the command line

  cd ~/Desktop/Projects
  mvn archetype:generate                                 \
    -DgroupId=com.cn.nrt_feed                            \
    -DartifactId=cn_rss_poller                           \
    -DarchetypeArtifactId=maven-archetype-quickstart

    version: 0.0.20150604.2030

  cd cn_rss_poller
  [Refactor -- change "App.java" to "CnRssPoller.java"        ]
  [         -- change "AppTest.java" to "CnRssPollerTest.java"]

2. create local git repo from the command line

  git init
  git add pom.xml
  git add src/main/java/com/cn/nrt_feed/CnRssPoller.java
  git add src/test/java/com/cn/nrt_feed/CnRssPollerTest.java
  git commit

3. CL - push local git repo to Github remote

  SSH key from the local Linux machine must be installed on github.
  Refer to:
    https://help.github.com/articles/generating-ssh-keys/
  and
    https://github.com/settings/ssh

  git remote add origin git@github.com:RobertBWeidlich/NRT_RSS_Stream.git
  git push -u origin master

4. NetBeans 8.0.2

5. Eclipse

6. IntelliJ

