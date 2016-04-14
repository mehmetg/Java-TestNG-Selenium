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

import static java.lang.System.nanoTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by mehmetgerceker on 12/7/15.
 */

public class SampleSauceTextInputTest extends SampleSauceTestBase {

    /**
     * Runs a simple test verifying if the comment input is functional.
     *
     * @throws InvalidElementStateException
     */
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest1(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();
        String sessionId = null;
        WebDriver driver = null;
        long time = 0;
        double secs = 0;
        time = nanoTime();
        try {
            driver = createDriver(browser, version, os, method.getName());
            secs = (nanoTime() - time) / 1000000;
            System.out.format("createDriver(browser, version, os, method.getName()); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("createDriver(browser, version, os, method.getName()); failed in %f\n", secs);
            e.printStackTrace();
            assertTrue(false);
        }


        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        } else {
            sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
        }

        time = nanoTime();
        try {
            driver.get("https://www.msn.com");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.msn.com\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.msn.com\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://www.bbc.co.uk");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.bbc.co.uk\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.bbc.co.uk\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }


        WebElement comments = null;
        time = nanoTime();
        try {
            comments = driver.findElement(By.id("comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments = driver.findElement(By.id(\"comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments = driver.findElement(By.id(\"comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            comments.sendKeys(commentInputText);
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments.sendKeys(commentInputText); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments.sendKeys(commentInputText); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement button = null;
        time = nanoTime();
        try {
            button = driver.findElement(By.id("submit"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button = driver.findElement(By.id(\"submit\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button = driver.findElement(By.id(\"submit\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            button.click();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button.click(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button.click(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement submittedComments = null;
        time = nanoTime();
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedComments = driver.findElement(By.id(\"your_comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedComments = driver.findElement(By.id(\"your_comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        String submittedCommentsText = "";
        time = nanoTime();
        try {
            submittedCommentsText = submittedComments.getText();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedCommentsText = submittedComments.getText(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedCommentsText = submittedComments.getText(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest2(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();
        String sessionId = null;
        WebDriver driver = null;
        long time = 0;
        double secs = 0;
        time = nanoTime();
        try {
            driver = createDriver(browser, version, os, method.getName());
            secs = (nanoTime() - time) / 1000000;
            System.out.format("createDriver(browser, version, os, method.getName()); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("createDriver(browser, version, os, method.getName()); failed in %f\n", secs);
            e.printStackTrace();
            assertTrue(false);
        }


        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        } else {
            sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
        }

        time = nanoTime();
        try {
            driver.get("https://www.msn.com");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.msn.com\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.msn.com\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://www.bbc.co.uk");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.bbc.co.uk\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.bbc.co.uk\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }


        WebElement comments = null;
        time = nanoTime();
        try {
            comments = driver.findElement(By.id("comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments = driver.findElement(By.id(\"comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments = driver.findElement(By.id(\"comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            comments.sendKeys(commentInputText);
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments.sendKeys(commentInputText); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments.sendKeys(commentInputText); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement button = null;
        time = nanoTime();
        try {
            button = driver.findElement(By.id("submit"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button = driver.findElement(By.id(\"submit\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button = driver.findElement(By.id(\"submit\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            button.click();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button.click(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button.click(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement submittedComments = null;
        time = nanoTime();
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedComments = driver.findElement(By.id(\"your_comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedComments = driver.findElement(By.id(\"your_comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        String submittedCommentsText = "";
        time = nanoTime();
        try {
            submittedCommentsText = submittedComments.getText();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedCommentsText = submittedComments.getText(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedCommentsText = submittedComments.getText(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest3(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();
        String sessionId = null;
        WebDriver driver = null;
        long time = 0;
        double secs = 0;
        time = nanoTime();
        try {
            driver = createDriver(browser, version, os, method.getName());
            secs = (nanoTime() - time) / 1000000;
            System.out.format("createDriver(browser, version, os, method.getName()); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("createDriver(browser, version, os, method.getName()); failed in %f\n", secs);
            e.printStackTrace();
            assertTrue(false);
        }


        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        } else {
            sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
        }

        time = nanoTime();
        try {
            driver.get("https://www.msn.com");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.msn.com\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.msn.com\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://www.bbc.co.uk");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.bbc.co.uk\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.bbc.co.uk\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }


        WebElement comments = null;
        time = nanoTime();
        try {
            comments = driver.findElement(By.id("comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments = driver.findElement(By.id(\"comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments = driver.findElement(By.id(\"comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            comments.sendKeys(commentInputText);
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments.sendKeys(commentInputText); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments.sendKeys(commentInputText); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement button = null;
        time = nanoTime();
        try {
            button = driver.findElement(By.id("submit"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button = driver.findElement(By.id(\"submit\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button = driver.findElement(By.id(\"submit\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            button.click();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button.click(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button.click(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement submittedComments = null;
        time = nanoTime();
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedComments = driver.findElement(By.id(\"your_comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedComments = driver.findElement(By.id(\"your_comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        String submittedCommentsText = "";
        time = nanoTime();
        try {
            submittedCommentsText = submittedComments.getText();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedCommentsText = submittedComments.getText(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedCommentsText = submittedComments.getText(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest4(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();
        String sessionId = null;
        WebDriver driver = null;
        long time = 0;
        double secs = 0;
        time = nanoTime();
        try {
            driver = createDriver(browser, version, os, method.getName());
            secs = (nanoTime() - time) / 1000000;
            System.out.format("createDriver(browser, version, os, method.getName()); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("createDriver(browser, version, os, method.getName()); failed in %f\n", secs);
            e.printStackTrace();
            assertTrue(false);
        }


        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        } else {
            sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
        }

        time = nanoTime();
        try {
            driver.get("https://www.msn.com");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.msn.com\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.msn.com\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://www.bbc.co.uk");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.bbc.co.uk\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.bbc.co.uk\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }


        WebElement comments = null;
        time = nanoTime();
        try {
            comments = driver.findElement(By.id("comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments = driver.findElement(By.id(\"comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments = driver.findElement(By.id(\"comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            comments.sendKeys(commentInputText);
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments.sendKeys(commentInputText); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments.sendKeys(commentInputText); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement button = null;
        time = nanoTime();
        try {
            button = driver.findElement(By.id("submit"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button = driver.findElement(By.id(\"submit\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button = driver.findElement(By.id(\"submit\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            button.click();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button.click(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button.click(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement submittedComments = null;
        time = nanoTime();
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedComments = driver.findElement(By.id(\"your_comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedComments = driver.findElement(By.id(\"your_comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        String submittedCommentsText = "";
        time = nanoTime();
        try {
            submittedCommentsText = submittedComments.getText();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedCommentsText = submittedComments.getText(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedCommentsText = submittedComments.getText(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
    @org.testng.annotations.Test(dataProvider = "hardCodedBrowsers", invocationCount = 1)
    public void verifyCommentInputTest5(String browser, String version, String os, Method method)
            throws MalformedURLException, InvalidElementStateException, UnexpectedException {
        String commentInputText = UUID.randomUUID().toString();
        String sessionId = null;
        WebDriver driver = null;
        long time = 0;
        double secs = 0;
        time = nanoTime();
        try {
            driver = createDriver(browser, version, os, method.getName());
            secs = (nanoTime() - time) / 1000000;
            System.out.format("createDriver(browser, version, os, method.getName()); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("createDriver(browser, version, os, method.getName()); failed in %f\n", secs);
            e.printStackTrace();
            assertTrue(false);
        }


        if (driver == null) {
            System.err.println("Driver is null!");
            assertTrue(false);
        } else {
            sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
        }

        time = nanoTime();
        try {
            driver.get("https://www.msn.com");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.msn.com\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.msn.com\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://www.bbc.co.uk");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://www.bbc.co.uk\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://www.bbc.co.uk\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            driver.get("https://saucelabs.com/test/guinea-pig");
            secs = (nanoTime() - time) / 1000000;
            System.out.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("driver.get(\"https://saucelabs.com/test/guinea-pig\"); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }


        WebElement comments = null;
        time = nanoTime();
        try {
            comments = driver.findElement(By.id("comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments = driver.findElement(By.id(\"comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments = driver.findElement(By.id(\"comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            comments.sendKeys(commentInputText);
            secs = (nanoTime() - time) / 1000000;
            System.out.format("comments.sendKeys(commentInputText); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("comments.sendKeys(commentInputText); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement button = null;
        time = nanoTime();
        try {
            button = driver.findElement(By.id("submit"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button = driver.findElement(By.id(\"submit\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button = driver.findElement(By.id(\"submit\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        time = nanoTime();
        try {
            button.click();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("button.click(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("button.click(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        WebElement submittedComments = null;
        time = nanoTime();
        try {
            submittedComments = driver.findElement(By.id("your_comments"));
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedComments = driver.findElement(By.id(\"your_comments\")); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedComments = driver.findElement(By.id(\"your_comments\")); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        String submittedCommentsText = "";
        time = nanoTime();
        try {
            submittedCommentsText = submittedComments.getText();
            secs = (nanoTime() - time) / 1000000;
            System.out.format("submittedCommentsText = submittedComments.getText(); executed in %f\n", secs);
        } catch (Exception e) {
            secs = (nanoTime() - time) / 1000000;
            System.err.format("submittedCommentsText = submittedComments.getText(); failed in %f\n", secs);
            System.err.println("Session ID: " + sessionId);
            System.err.println("Session link: https://saucelabs.com/beta/tests/" + sessionId);
            e.printStackTrace();
            assertTrue(false);
        }

        assertTrue(submittedCommentsText.endsWith(commentInputText));
    }
}
