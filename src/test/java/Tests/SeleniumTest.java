package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class SeleniumTest {

    public static WebDriver driver;

    static ExtentReports report;
    public static ExtentTest test;

    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void Setup() {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark =new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
        HomePage.click_online_products();

    }

    @Test
    void ValidateTitles_OnlineProducts(){
        test = extent.createTest("Validate Shoe Titles on Products page","This validates that the different shoe types are available on the Online Products page");
        ProductsPage.formalShoes_verifyTitle();
        ProductsPage.sportShoes_verifyTitle();
        ProductsPage.sneakerShoes_verifyTitle();
    }

    @Test
    void validateFirstFormalShoes(){
        test = extent.createTest("Validate First Shoe on Formal Shoe table","This validates the first shoe on the Formal Shoe Table");

        ProductsPage.formalShoes_dropdown_click();
        ProductsPage.formalShoes_firstShoeName_getTitle();
    }

    @Test
    void validateFirstSportShoes(){
        test = extent.createTest("Validate First Shoe on Sports Shoe table","This validates the first shoe on the Sports Shoe Table");

        ProductsPage.sportShoes_dropdown_click();
        ProductsPage.sportShoes_firstShoeName_getTitle();
    }

    @AfterSuite
    public static void cleanup(){
        extent.flush();
        driver.close();
    }


}
