package org.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public  class Sample1 {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kannan.p\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrlAndMaximize(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void title() {
		driver.getTitle();
	}

	public static void text(WebElement element) {
		element.getText();
	}
	public static void selectvaluebyindex(WebElement element,String data) {
        new Select(element).selectByVisibleText(data);
	}
	public static void selectvaluebyindex(WebElement element, int index) {
        new Select(element).selectByIndex(index);
	}
	public static void btnclick(WebElement element) {
		element.click();
	}
	public static void quitbrowser() {
		driver.quit();
	}
	public static void sendkeys(WebElement element,String name) {
		element.sendKeys(name);
	}
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourse = screenshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\kannan.p\\eclipse-workspace\\Sampletest\\target"+name+".png");
		FileUtils.copyFile(sourse, destination);
	
}
}
