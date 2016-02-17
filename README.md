# NRT_RSS_Stream
Periodically poll a list of RSS feeds, then provide an infrastructure
to process in near real time using Kafka and Storm.

test:
~~~
[cloudera@quickstart ~]$ date
Sun Feb 14 16:41:53 PST 2016
[cloudera@quickstart ~]$ 
~~~

## Command Line

### To compile with Maven:
```
cd ~/Desktop/Projects/gh/NRT_RSS_Stream
mvn clean install
```

### To run from Command Line:
Note: check name of jar file in ./target -- timestamp may be updated.
```
cd .../NRT_RSS_Stream
java -cp ./target/cn_rss_poller-0.0.20160215.1900-SNAPSHOT.jar com.cn.nrt_feed.CnRssPoller
```

### To run with Maven:
```
TBD - see idaas pom.xml on how to run "mvn exec:exec"
```

