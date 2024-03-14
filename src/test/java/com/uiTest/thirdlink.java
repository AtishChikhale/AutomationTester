package com.uiTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirdlink {
public static void main(String[] args) throws Exception {

	ScreenRecorderUtil.startRecord("main");

	Date currDate = new Date();
	String screenshotsfilename = currDate.toString().replace(" ", "-").replace(":", "-");
//	System.out.print(screenshotsfilename);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.getcalley.com/calley-pro-features/");
	
//	Desktop 
	driver.manage().window().setSize(new Dimension(1920, 1080));
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile, new File(".//Desktop//1920×1080//"+screenshotsfilename+".png"));
	

	driver.manage().window().setSize(new Dimension(1366, 768));
	File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile1, new File(".//Desktop//1366×768//"+screenshotsfilename+".png"));

	driver.manage().window().setSize(new Dimension(1536, 864));
	File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile2, new File(".//Desktop//1536×864//"+screenshotsfilename+".png"));

//	Mobile Resolutions
	
	driver.manage().window().setSize(new Dimension(360, 640));
	File screenshotFileM1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFileM1, new File(".//Mobile//360×640//"+screenshotsfilename+".png"));
	
	
	driver.manage().window().setSize(new Dimension(414, 896));
	File screenshotFileM2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFileM2, new File(".//Mobile//414×896//"+screenshotsfilename+".png"));
	
	driver.manage().window().setSize(new Dimension(375, 667));
	File screenshotFileM3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFileM3, new File(".//Mobile//375×667//"+screenshotsfilename+".png"));
	
	driver.close();
	
	ScreenRecorderUtil.stopRecord();
}
}
