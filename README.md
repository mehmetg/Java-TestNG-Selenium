## Java-TestNg-Selenium Load Test Branch

This code is provided on an "AS-IS” basis without warranty of any kind, either express or implied, including without limitation any implied warranties of condition, uninterrupted use, merchantability, fitness for a particular purpose, or non-infringement. Your tests and testing environments may require you to modify this framework. Issues regarding this framework should be submitted through GitHub. For questions regarding Sauce Labs integration, please see the Sauce Labs documentation at https://wiki.saucelabs.com/. This framework is not maintained by Sauce Labs Support.

### Load Test Details

* Sauce Connect Setup
    * Version 4.3.14 on Linux ip-172-30-1-208 3.13.0-74-generic #118-Ubuntu SMP Thu Dec 17 22:52:10 UTC 2015 x86_64 x86_64 x86_64 GNU/Linux
    * AWS [m4.xlarge](https://aws.amazon.com/ec2/instance-types/) instance **IP: 54.193.86.199**
    * SC command relay is in use. 
    * Command line: (Launch and clean up scripts under [./scripts](https://github.com/mehmetg/Java-TestNG-Selenium/tree/load-test/scripts)
        
	```ulimit -n 65536```
        ```bin/sc -vv --wait-tunnel-shutdown -l sc_log.txt -d pid.txt```
    * Sauce User: mehmetg-high-conc (VM limit 500)
    * SC and tests run on the same host
* Test Setup
    * TestNg / MVN
    * 350 Tests total
    * 350 Concurrent threads at a time. It will run in increments of 350
    * SC is planned to run on a separate instance and monitored by ifstat. (Host ?)
    	* Setup: (as root) -- These need to be only done one per setup.
    		* ```./start_sc.sh```
    		* ```ifstat -t -i vethb > networkusage.txt```
* Test Content
    * Load https://www.amazon.com
    * Load https://www.bbc.co.uk
    * Load https://saucelabs.com/test/guinea-pig
    * Input text into a field
    * Click button
    * Read text
    * Compare input to read-back.
    
* Data Files
    * SC Log: sc_log_<ts>.txt
    * Test stderr (Client side): errors_<ts>.txt (has url links to job errors and time to error)
    * Test stdout (Client side): srd_<ts>.txt (has command completion times)
    * History of open connections for SC: open_connections_<ts>.txt (ts, # connections)
    * History of open files for SC: open_files_<ts>.txt (ts, list of open file descriptors)
    * History of memory/cpu usage: memory_usage_<ts>.txt
* Steps
    * Set network conditions scripts can be found under [./scripts](https://github.com/mehmetg/Java-TestNG-Selenium/tree/load-test/scripts)
    * Start SC start script found under [./scripts](https://github.com/mehmetg/Java-TestNG-Selenium/tree/load-test/scripts)
    * Start logging and monitoring scripts
    * Start tests
    	*  runtest_cr.sh for command relay test (uses SC relay on localhost)
    	*  runtest_nr.sh for no command relay test (direct connection to ondemand.saucelabs.com:80)
    	*  Test scripts can be edited for repeated runs... set to 100 at the moment.
* Notes
    * Expect actual concurrency to be ~150-250 with the current settings.
    * More test client hosts are needed to exceed the above listed number.

* Observations:
    * TBD
   
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
