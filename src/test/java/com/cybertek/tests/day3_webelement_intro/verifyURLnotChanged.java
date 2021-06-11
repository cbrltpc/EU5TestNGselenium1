package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main (String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedResult = driver.getCurrentUrl();
        WebElement retrivePasswordButton =driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();

        String actualResult = driver.getCurrentUrl();

        if(expectedResult.equals(actualResult)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }

}