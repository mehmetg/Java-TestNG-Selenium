package com.yourcompany.Tests;


import com.yourcompany.Pages.GuineaPigPage;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by mehmetgerceker on 12/7/15.
 */

public class SampleSauceTextInputTest extends SampleSauceTestBase {

    //HashMap<String, ArrayList<Double>> execTimes;

    /**
     * Runs a simple test verifying if the email input is functional.
     *
     * @throws InvalidElementStateException
     */
    //@org.testng.annotations.Test(dataProvider = "hardCodedBrowsers")
    public void verifyEmailInputTest(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String emailInputText = "abc@gmail.com";
        WebDriver driver = createDriver(browser, version, os, method.getName());
        // Navigate to the page
        driver.get("https://saucelabs.com/test/guinea-pig");

        // get page object
        GuineaPigPage page = GuineaPigPage.getPage(driver);

        /*
         enterEmailText page is an exposed "service",
             which interacts with the email input field element by sending text to it.
        */
        page.enterEmailText(emailInputText);

        /*
         Assertions should be part of test and not part of Page object.
         Each test should be verifying one piece of functionality (atomic testing)
        */
        assertEquals(page.getEmailText(), emailInputText);

    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest1(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.msn.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.msn.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest2(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest3(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest4(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest5(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }

        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest6(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest7(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest8(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();

        WebDriver driver = createDriver(browser, version, os, method.getName());
        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        }
        try {
            driver.get("https://www.amazon.com");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.amazon.com\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://www.bbc.co.uk");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://www.bbc.co.uk\");");
            e.printStackTrace();
        }

        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("driver.get(\"https://saucelabs.com/test/guinea-pig\");");
            e.printStackTrace();
        }
        WebElement comments = null;
        try {
            comments = driver.findElement(By.id("comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments = driver.findElement(By.id(\"comments\"));");
            e.printStackTrace();
        }


        try {
            comments.sendKeys(commentInputText);
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("comments.sendKeys(commentInputText);");
            e.printStackTrace();
        }

        WebElement button = null;
        try {
            button = driver.findElement(By.id("submit"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button = driver.findElement(By.id(\"submit\"));");
            e.printStackTrace();
        }


        try {
            button.click();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("button.click();");
            e.printStackTrace();
        }

        WebElement submittedComments = null;
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedComments = driver.findElement(By.id(\"your_comments\"));");
            e.printStackTrace();
        }

        String submittedCommentsText = "";
        try {
            submittedCommentsText = submittedComments.getText();
        } catch (Exception e) {
            String sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            System.err.println("submittedCommentsText = submittedComments.getText();");
            e.printStackTrace();
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }



    /*
    @BeforeClass
    public void logSetup(){
        this.execTimes = new HashMap<>();
    }

    @AfterClass
    public void logTearDown(){
        for (Map.Entry<String, ArrayList<Double>> me: this.execTimes.entrySet()){
            String key = me.getKey();
            ArrayList<Double> data = me.getValue();
            Statistics stats = new Statistics(data);
            System.out.println("start " + key + " data and statistics");
            System.out.println(key + "-> Data: "  + data.toString());
            System.out.println(key + "-> Mean: "  + Double.toString(stats.getMean()));
            System.out.println(key + "-> StdDev: "  + Double.toString(stats.getStdDev()));
            System.out.println(key + "-> Variance: "  + Double.toString(stats.getVariance()));
            System.out.println(key + "-> Median: "  + Double.toString(stats.getMedian()));
            System.out.println("end " + key + " data and statistics");

        }
    }
    */
}
