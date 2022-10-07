package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ravik\\eclipse-JAVA\\AdactinCucumber1\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepdefinition", monochrome = true, dryRun = false, strict = true, 
plugin = {"html:Reports/HtmlReport", "pretty", "json:Reports/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html" })
public class RunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravik\\eclipse-JAVA\\AdactinCucumber1\\Chrome1809\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void browserclose() {
		driver.close();
	}
}
