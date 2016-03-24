## Java-TestNg-Selenium Load Test Branch

This code is provided on an "AS-IS” basis without warranty of any kind, either express or implied, including without limitation any implied warranties of condition, uninterrupted use, merchantability, fitness for a particular purpose, or non-infringement. Your tests and testing environments may require you to modify this framework. Issues regarding this framework should be submitted through GitHub. For questions regarding Sauce Labs integration, please see the Sauce Labs documentation at https://wiki.saucelabs.com/. This framework is not maintained by Sauce Labs Support.

### Load Test Details

* Sauce Connect Setup
    * Version 4.3.14 on Kubuntu 15.10  - Linux 4.2.0-34-generic #39-Ubuntu SMP Thu Mar 10 22:13:01 UTC 2016 x86_64 x86_64 x86_64 GNU/Linux
    * 4 Core Intel CPU Hyperthreaded with 16GB Ram
    * SC command relay is in use
    * Command line: 
        ```ulimit -n 65536```
        ```bin/sc -vv --wait-tunnel-shutdown -l sc_log.txt -d pid.txt```
    * Sauce User: mehmetg-high-conc (VM limit 350)
* Test Setup
    * TestNg / MVN
    * 480 Tests total
    * 300 Concurrent threads at a time. It will run in increments of 300
* Test Content
    * Load https://www.amazon.com
    * Load https://www.bbc.co.uk
    * Load https://saucelabs.com/test/guinea-pig
    * Input text into a field
    * Click button
    * Read text
    * Compare input to read-back.
    
* Data Files
    * SC Log: sc_log.txt
    * Test Error Log (Client side): errors.txt (has url links to job errors)
    * History of open connections for SC: open_connections.txt (ts, # connections)
    * History of memory/cpu usage: memory_usage.txt
* Steps
    * Start SC 
    * Start logging and monitoring scripts
    * Start tests
* Observations
    * SC memory usage starts at 2.3 MB 
    * SC memory usage grew to ~3GB over the next 30 mins.
    * Number of SC open connections grow to ~8000
    * Tests in session time out: Almost all 298 out of 300 and 2 fail
    * Number of SC open connections drop to to ~3500 (Assuming relay connections)
    * Maven execution stops on the idle connections waiting for a timeout.
    * After 30 minutes of waiting aborted test by shutting down maven and than SC.
    * Logs can be found under the folder **test300concurrent**

### Environment Setup

1. Global Dependencies
    * [Install Maven](https://maven.apache.org/install.html)
    * Or Install Maven with [Homebrew](http://brew.sh/)
    ```
    $ brew install maven
    ```
2. Sauce Credentials
    * In the terminal export your Sauce Labs Credentials as environmental variables:
    ```
    $ export SAUCE_USERNAME=<your Sauce Labs username>
	$ export SAUCE_ACCESS_KEY=<your Sauce Labs access key>
    ```
3. Project Dependencies
	* Check that Packages are available
	```
	$ cd Java-TestNg-Selenium
	$ mvn test-compile
	```
	* You may also want to run the command below to check for outdated dependencies. Please be sure to verify and review updates before editing your pom.xml file. The updated packages may or may not be compatible with your code.
	```
	$ mvn versions:display-dependency-updates
	```
### Running Tests

Tests in Parallel:
	```
	$ mvn test
	```

[Sauce Labs Dashboard](https://saucelabs.com/beta/dashboard/)

### Advice/Troubleshooting
1. It may be useful to use a Java IDE such as IntelliJ or Eclipse to help troubleshoot potential issues. 
2. There may be additional latency when using a remote webdriver to run tests on Sauce Labs. Timeouts or Waits may need to be increased.
    * [Selenium tips regarding explicit waits](https://wiki.saucelabs.com/display/DOCS/Best+Practice%3A+Use+Explicit+Waits)

### Resources
##### [Sauce Labs Documentation](https://wiki.saucelabs.com/)

##### [SeleniumHQ Documentation](http://www.seleniumhq.org/docs/)

##### [TestNg Documentation](http://testng.org/javadocs/index.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### Stack Overflow:
* [Related Stack Overflow Threads](http://stackoverflow.com/questions/27355003/advise-on-hierarchy-for-element-locators-in-selenium-webdriver)
