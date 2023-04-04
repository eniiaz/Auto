package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SupplySyncHomePage {

    public SupplySyncHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Juridic Entity']")
    public WebElement juridicEntity;

    @FindBy(xpath = "//span[.='Companies']")
    public WebElement companies;
}
