package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

import org.openqa.selenium.server.SeleniumServer;


public class Task5Test extends SeleneseTestCase {
	
	static SeleniumServer server = null;

	@Before
	public void setUp() throws Exception {
		try {
			if(server == null) {
			   server = new SeleniumServer();
			   server.start();
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
			setUp("http://www.rose-hulman.edu/offices-services/registrar/registration-services/schedule-lookup.aspx", "*chrome");
			}

	@Test
	public void testTask5() throws Exception {
		selenium.open("/");
		selenium.click("link=JavaScript alert box");
		assertEquals("Hi, I'm a JavaScript alert box!", selenium.getAlert());
		selenium.type("num1", "99");
		selenium.type("num2", "198");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
