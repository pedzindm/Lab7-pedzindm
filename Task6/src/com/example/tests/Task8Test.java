package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

import org.openqa.selenium.server.SeleniumServer;


public class Task8Test extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/offices-services/registrar/registration-services/schedule-lookup.aspx");
		selenium.start();
	}

	@Test
	public void testTask7() throws Exception {
		selenium.open("/offices-services/registrar/registration-services/schedule-lookup.aspx");
		selenium.click("css=h2 > a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id1", "pedzindm");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
