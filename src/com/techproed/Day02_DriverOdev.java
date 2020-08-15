package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    //driveri ekrani kaplayacak sekle getir
    //1.google a git
    //2. title i al yazdir
    //3.youtube a git
    //title ve url yi al
    //google a gel url al ekrana yaz
    //driver i kapat

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        String title = driver.getTitle();
        System.out.println(title);
        driver.get("http://youtube.com");
        String title2 =driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title2);
        System.out.println(url);
        driver.navigate().back();
        String url2 =driver.getCurrentUrl();
        System.out.println(url2);
        driver.quit();


    }

}
