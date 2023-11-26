package pages;
import Tests.SeleniumTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentTest;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;
import static Tests.SeleniumTest.*;
public class ProductsPage {

    public static String formalShoes_xpath = "//h2[normalize-space()='Formal Shoes']";

    public static String sportShoes_xpath = "//h2[normalize-space()='Sports Shoes']";

    public static  String sneakerShoes_xpath = "//h2[normalize-space()='Sneakers']";

    public static  String formalShoes_dropdown_xpath = "//i[@class='fa fa-angle-double-down formalshoedropdown']";

    public static  String sportShoes_dropdown_xpath = "//i[@class='fa fa-angle-double-down sportsshoedropdown']";

    public static  String sneakerShoes_dropdown_xpath = "//i[@class='fa fa-angle-double-down sneakershoedropdown']";

    public static String formalShoes_firstShoeName_xpath = "//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]";

    public static String sportShoes_firstShoeName_xpath = "//body[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]";

    public static void formalShoes_verifyTitle(){
        String expectedTitle_FS = "Formal Shoes";
        String actualTitle_FS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle_FS,actualTitle_FS);
    }

    public static void sportShoes_verifyTitle(){
        String expectedTitle_SS = "Sports Shoes";
        String actualTitle_SS = driver.findElement(By.xpath(sportShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle_SS,actualTitle_SS);
    }

    public static void sneakerShoes_verifyTitle(){
        String expectedTitle_SnS = "Sneakers";
        String actualTitle_SnS = driver.findElement(By.xpath(sneakerShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle_SnS,actualTitle_SnS);
    }

    public static void formalShoes_dropdown_click(){
        driver.findElement(By.xpath(formalShoes_dropdown_xpath)).click();
    }

    public static void sportShoes_dropdown_click(){
        driver.findElement(By.xpath(sportShoes_dropdown_xpath)).click();
    }

    public static void sneakerShoes_dropdown_click(){
        driver.findElement(By.xpath(sneakerShoes_dropdown_xpath)).click();
    }

    public static void formalShoes_firstShoeName_getTitle(){
        String expectedFirstShoeName_formal = "Classic Cheltenham";
        String actualFirstShoeName_formal =driver.findElement(By.xpath(formalShoes_firstShoeName_xpath)).getText();
        Assert.assertEquals((expectedFirstShoeName_formal),actualFirstShoeName_formal.trim());
        if (expectedFirstShoeName_formal.equals(actualFirstShoeName_formal)){
            test.log(Status.PASS,"Test Passed for First Shoe name under Formal Shoe Table");
        }else {
            test.log(Status.FAIL, "Test Failed for First Shoe name under Formal Shoe Table");
        }
    }

    public static void sportShoes_firstShoeName_getTitle(){
        String expectedFirstShoeName_sport = "Ultimate";
        String actualFirstShoeName_sport =driver.findElement(By.xpath(sportShoes_firstShoeName_xpath)).getText();
        Assert.assertEquals((expectedFirstShoeName_sport),actualFirstShoeName_sport.trim());
        if (expectedFirstShoeName_sport.equals(actualFirstShoeName_sport)) {
            test.log(Status.PASS, "Test Passed for First Shoe name under Sports Shoe Table");
        }else {
            test.log(Status.FAIL, "Test Failed for First Shoe name under Sports Shoe Table");
        }
    }


}
