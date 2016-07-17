# Todo for project NRT_RSS_Stream

Last edited Sun Jul 17 15:05:30 EDT 2016 by rbw

## NRS-001 - Documentation - Reorganize:

README.md - Basic Introduction, how to get started

README-project-creation.md - How the project was built from scratch.

README-dev-environments - How to handle different development environments

Handle all of the following:

1. Operating Systems:
    - Linux
        * Centos
        * Ubuntu
    - Windows
    - MacOS
2. Multiple IDEs:
    - IntelliJ
    - NetBeans
    - Eclipse

3. Git

4. Maven

5. JUnit

6. Log4j

### Note the following is example Markdown formatting:

1. Lists in a list item:
    - Indented four spaces.
        * indented eight spaces.
    - Four spaces again.
2.  Multiple paragraphs in a list items:
    It's best to indent the paragraphs four spaces
    You can get away with three, but it can get
    confusing when you nest other things.
    Stick to four.

    We indented the first line an extra space to align
    it with these paragraphs. In real use, we might do
    that to the entire list so that all items line up.

    This paragraph is still part of the list item, but it looks messy to humans. So it's a good idea to wrap your nested paragraphs manually, as we did with the first two.

3. Blockquotes in a list item:

    > Skip a line and
    > indent the >'s four spaces.

4. Preformatted text in a list item:

        Skip a line and indent eight spaces.
        That's four spaces for the list
        and four to trigger the code block.

### End of example Markdown formattingi

## NRS-002 - Fix log4j on Linux

log4j seems to work for Windows but not for Linux.  What about Mac?

## NRS-003 - Maven profiles:
In pom.xml, set up different Maven profiles for Linux, Windows,
and Mac

Subdirectories for data files and log files - will be different for each
environment (Linux, Windows, MacOS)

7. Maven Profiles For Mac, Windows, and Linux.
    Each environment may have differnet subdirectories for config and
    data files.

