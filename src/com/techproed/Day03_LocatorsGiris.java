package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelementimizi buluyoruz.
        WebElement signInLinki = driver.findElement(By.id("sign-in"));
signInLinki.click();
WebElement emailKutusu= driver.findElement(By.id("session_email"));
emailKutusu.sendKeys("testtechproed@gmail.com");
WebElement password= driver.findElement(By.id("session_password"));
password.sendKeys("Test1234!");
WebElement signIn = driver.findElement(By.name("commit"));
signIn.click();
String baslik = driver.getTitle();
if(baslik.equals("Address Book")){
    System.out.println("Giris Basarili");
}else{
    System.out.println("Giris Basarisiz");
}





    }
}
