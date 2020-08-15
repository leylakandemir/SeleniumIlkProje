package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        //Java projemize chrome driver i tanittik
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //webdriver nesnesi olusturarak chrome driveri kullanilabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");


        //Driverimizda acik olan pencereyi kapatir.
        //webDriver.close();

        //Acik olan driveri tum sayfalariyla beraber kapatir.
        //webDriver.quit();


    }
}
