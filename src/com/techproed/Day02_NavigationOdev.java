package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day02_NavigationOdev {
    //1.ilk once google.com a gidin
    //2.youtube a gidin
    //3.google a geri gidin
    //4.youtube a geri gidin
    //5.driver i yenileyin
    //6.driver i kapatin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("https://google.com");
driver.navigate().to("https://youtube.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.quit();
    }
}