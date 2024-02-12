package org.yulran.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SeleniumParsing {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://pl.shein.com/RecommendSelection/All-Sale-sc-017210185.html?adp=&categoryJump=true&ici=pl_tab03navbar03&src_identifier=fc%3DSale%60sc%3DSale%60tc%3D0%60oc%3D0%60ps%3Dtab03navbar03%60jc%3DitemPicking_017210185&src_module=topcat&src_tab_page_id=page_home1707752989488");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div[3]/nav/div[2]/div/a[2]"));
        System.out.println(btn.getText());
       Thread.sleep(5000);
        driver.quit();

    }

}