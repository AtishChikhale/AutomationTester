package com.functionaltest;

import com.uiTest.ScreenRecorderUtil;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

  public static void main(String[] args) throws Exception {
    ScreenRecorderUtil.startRecord("main");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.dealsdray.com/");
    driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
    driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
    driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".css-sukebr > button")).click();
    driver.findElement(By.cssSelector(".submenu > div > a > button")).click();
    driver
      .findElement(
        By.cssSelector("div[class='MuiBox-root css-0'] button[type='button']")
      )
      .click();
    WebElement element = driver.findElement(
      By.cssSelector(
        "[class=\"MuiFormControl-root MuiTextField-root css-i44wyl\"]  > div > input[type=\"file\"]"
      )
    );
    element.sendKeys(
      "C:\\Users\\Atish Chikhale\\eclipse-workspace\\DEALSDRAY_AUTOMATION\\testdata\\demo-data.xlsx"
    );
    driver
      .findElement(
        By.cssSelector(
          "div[class='MuiBox-root css-1xi4464'] button[type='button']"
        )
      )
      .click();
    File screenshotFile =
      ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile, new File(".//Screenshot/screnshot.png"));
    driver.close();

    ScreenRecorderUtil.stopRecord();
  }
}
