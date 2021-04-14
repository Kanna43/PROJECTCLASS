package org.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.xml.sax.Locator;

public class Sample2 extends Sample1{

private String name;
@BeforeClass
private void beforeclass() {
	getDriver();
	loadUrl("https://adactinhotelapp.com/");
}
@Parameters({"username","password"})
@Test
private void tc0(String s,String s1) {
     WebElement txtuser = driver.findElement(By.id("username")) ;
     txtuser.sendKeys(s);
     WebElement txtpass = driver.findElement(By.id("password"));
     txtpass.sendKeys(s1);
     WebElement btnlogin = driver.findElement(By.id("login"));
     btnlogin.click();
    }
@Parameters({"location","Hotel","roomtype","room_nos","adult","child"})
@Test
private void tc1(String s2,String hotel,String roomtype,String room_nos,String adult,String child) {
     WebElement dDnloc = driver.findElement(By.id("location"));
     dDnloc.sendKeys(s2);
     WebElement dDnhotel = driver.findElement(By.id("hotels"));
     dDnhotel.sendKeys(hotel);
     WebElement dDnroomtype = driver.findElement(By.id("room_type"));
     dDnroomtype.sendKeys(roomtype);
     WebElement dDnroom_nos = driver.findElement(By.id("room_nos"));
     dDnroom_nos.sendKeys(room_nos);
     WebElement dDnadult = driver.findElement(By.id("adult_room"));
     dDnadult.sendKeys(adult);
     WebElement dDnchild = driver.findElement(By.id("child_room"));
     dDnchild.sendKeys(child);
     WebElement btnsearch = driver.findElement(By.id("Submit"));
     btnsearch.click();
}

@Test
private void tc2() {
	WebElement btnradio = driver.findElement(By.id("radiobutton_0"));
	btnradio.click();
    WebElement btncontinue = driver.findElement(By.id("continue"));
    btncontinue.click();
}

@Parameters({"Fname","Lname","BillingAddress","CCnum","CCtype","CCExpMonth","CCExpYear","CVVNum"})
@Test
private void tc3(String Fname,String Lname,String BillingAddress,String CCnum,String CCtype,String CCExpMonth,String CCExpYear,String CVVNnum) {
	WebElement txtFname = driver.findElement(By.id("first_name"));
	txtFname.sendKeys(Fname);
	WebElement txtSname = driver.findElement(By.id("last_name"));
	txtSname.sendKeys(Lname);
	WebElement txtadd = driver.findElement(By.id("address"));
	txtadd.sendKeys("BillingAddress");
	WebElement Cardnum = driver.findElement(By.id("cc_num"));
	Cardnum.sendKeys(CCnum);
	WebElement dDnCCtype = driver.findElement(By.id("cc_type"));
	dDnCCtype.sendKeys(CCtype);
	WebElement dDnCCExpMonth = driver.findElement(By.id("cc_exp_month"));
	dDnCCExpMonth.sendKeys(CCExpMonth);
	WebElement dDnCCExpYear = driver.findElement(By.id("cc_exp_year"));
	dDnCCExpYear.sendKeys(CCExpYear);
	WebElement txtCVVNum = driver.findElement(By.id("cc_cvv"));
	txtCVVNum.sendKeys(CVVNnum);
	WebElement btnbook = driver.findElement(By.id("book_now"));
	btnbook.click();
}
@Test
private void ulogout() {
WebElement btnlogout = driver.findElement(By.xpath("//a[text()='Logout']"));
btnlogout.click();
}

@AfterMethod
private void after(Method m) throws IOException {
	screenshot(m.getName());
}
	
}

