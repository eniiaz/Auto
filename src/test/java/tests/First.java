package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

import java.time.Duration;

public class First {

    public static void main(String[] args) throws InterruptedException {

        //span[.='Companies']


        Driver.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Driver.getDriver().get("https://supplysync.us");

        WebElement username = Driver.getDriver().findElement(By.id("input"));
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button"));

        username.sendKeys("codewise@gmail.com");
        password.sendKeys("123456");
        loginBtn.click();

        Thread.sleep(2000);

        String url = Driver.getDriver().getCurrentUrl();
        System.out.println(url);

        WebElement entity = Driver.getDriver().findElement(By.xpath("//span[.='Juridic Entity']"));
        entity.click();

        Thread.sleep(2000);
        Actions actions  = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 800).perform();
    }

}
