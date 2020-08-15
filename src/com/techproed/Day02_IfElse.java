package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        String sayfaBasligi = driver.getTitle(); //car
        if (sayfaBasligi.contains("Car")){
            System.out.println("Car kelimesi geciyor"+sayfaBasligi);
        }else{
            System.out.println("Car kelimesi gecmiiiiiiyooooor"+"\n"+sayfaBasligi);
        }
driver.quit();

    }
}
