package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        //Ekrani kaplamaya yarar.
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        //navigate to, get komutu ile ayni islemi yapiyor
        webDriver.navigate().to("http://amazon.com");
        //navigate().back() bir onceki sayfaya gidiyor
        webDriver.navigate().back();
        //navigate().forward() bir sonraki sayfaya gider
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.close();
        webDriver.quit();
    }
}
