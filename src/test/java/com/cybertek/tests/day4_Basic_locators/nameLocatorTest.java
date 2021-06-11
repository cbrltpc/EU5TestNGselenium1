package com.cybertek.tests.day4_Basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("Mike Smith");

        WebElement EmailInput = driver.findElement(By.name("email"));

        fullNameInput.sendKeys("AA123456789");

        WebElement SignupButton =driver.findElement(By.name("wooden_spoon"));

        SignupButton.click();


    }

}
