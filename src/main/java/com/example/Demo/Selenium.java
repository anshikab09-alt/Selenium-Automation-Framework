package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Title of the Page
        System.out.println("Page title is: " + driver.getTitle());
        // Print the current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        //close the browser
        driver.close();
        driver.quit();


    
    }
}