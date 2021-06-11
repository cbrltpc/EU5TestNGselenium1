package com.cybertek.tests.day4_Basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement SearchWrite = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        SearchWrite.sendKeys("selenium");

        driver.findElement(By.id("nav-search-submit-button")).click();

       String Result = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")).getText();

        System.out.println("Result = " + Result);

        if(Result.equals("1-48 of 185 results for")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();

    }
}
