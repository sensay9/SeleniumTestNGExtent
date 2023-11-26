package pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String hamburger_menu_xpath = "//input[@type='checkbox']";
    public static String online_products_xpath = "//li[normalize-space()='Online Products']";

    public static void click_hamburger_menu(){
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static  void click_online_products(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath(online_products_xpath)).click();
    }
}
