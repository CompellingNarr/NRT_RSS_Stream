## Bootstrapping the NRT_RSS_Stream project

These are step-by-step notes on how this project was created on a Linux
workstation using Maven, a local Git repository was created, then a
remote Git repository was created on github.com.

Additional instructions are included to create other remote git repositories.

1. create maven project from the command line

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

2. create local git repo from the command line

```
  git init
  git add pom.xml
  git add src/main/java/com/cn/nrt_feed/CnRssPoller.java
  git add src/test/java/com/cn/nrt_feed/CnRssPollerTest.java
  git commit
```

3. CL - push local git repo to Github remote

  SSH key from the local Linux machine must be installed on github.
  Refer to:
    https://help.github.com/articles/generating-ssh-keys/
  and
    https://github.com/settings/sshgit

```
  git remote add origin git@github.com:RobertBWeidlich/NRT_RSS_Stream.git
  git push -u origin master
```

4. Create local git repo on another Linux workstation from the Github remote

  Create and install SSH key on the workstation (see step #3)

```
  git clone git@github.com:RobertBWeidlich/NRT_RSS_Stream.git

```
5. NetBeans 8.0.2

  Using the Linux command line:

```
    cd ~/Desktop/Projects
    mv cn_rss_poller cn_rss_poller_orig
    #mkdir cn_rss_poller_nb
    #cd cn_rss_poller_nb
    git clone github.com:RobertBWeidlich/NRT_RSS_Stream
    cd ~/Desktop/Projects/
```

5. NetBeans 8.1

  Using the Linux command line:

```
    cd ~/Desktop/Projects/gh_nb
    git clone git@github.com:RobertBWeidlich/NRT_RSS_Stream.git
```

  Start Netbeans

    Projects Window --right-click--> New Project ->
      Project with Existing POM ->
      Next ->
      Finish -> drill down into ~/Desktop/Projects/gh_nb ->
      Open Project


6. Eclipse

7. IntelliJ

8. Windows?

9. Mac?

  Install ports or brew (Home Brew), then install maven

10. Command Line (move from README.md)

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


