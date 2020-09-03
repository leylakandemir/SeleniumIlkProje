package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement emailKutusu= driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement passwordKutusu = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordKutusu.sendKeys("Test1234!");
        WebElement signIn = driver.findElement(By.xpath("//input[@type='submit']"));
        signIn.click();
        WebElement welcome = driver.findElement(By.tagName("h1"));
        System.out.println(welcome.getText());
        WebElement welcome1 = driver.findElement(By.xpath("//h1"));
        System.out.println(welcome1.getText());
    }
}
