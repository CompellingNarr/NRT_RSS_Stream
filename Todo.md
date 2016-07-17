# Todo for project NRT_RSS_Stream

Last edited Sun Jul 17 15:05:30 EDT 2016 by rbw

## NRS-001 - Documentation - Reorganize:

  README.md - Basic Introduction, how to get started

  README-project-creation.md - Basic Bootstrapping

  README-dev-environments - How to handle different development environments

  Handle all of the following:

* Operation Systems
** Linux
** Windows
** MacOS

* Multiple IDEs
** IntelliJ
** NetBeans
** Eclipse

* Git

* Maven

* JUnit

* Log4j

## NRS-002 - Fix log4j on Linux

log4j seems to work for Windows but not for Linux.  What about Mac?

## NRS-003 - pom.xml - set up different profiles for Linux, Windows, and Mac

Subdirectories for data files and log files - will be different for each
environment (Linux, Windows, MacOS)
