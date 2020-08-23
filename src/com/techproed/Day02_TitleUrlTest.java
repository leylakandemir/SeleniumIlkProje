package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    //youtube a git
    //title iceriyor mu
    //driveri kapat
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https:\\youtube.com");
        String title= webDriver.getTitle();
        if(title.contains("video")){
            System.out.println("Iceriyor");
        }else{
            System.out.println("Maalesef yok");
        }
    webDriver.quit();
    }
}
