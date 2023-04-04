package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class JuridicEntityPage {

    public JuridicEntityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Create Legal Entity']/button")
    public WebElement createEntityBtn;

    @FindBy(xpath = "//div[@id='menu-branchId']//ul/li")
    public List<WebElement> branchOptions;

    @FindBy(id = "mui-component-select-companyId")
    public WebElement formCompanyDropdown;

    @FindBy(id = "mui-component-select-branchId")
    public WebElement formBranchDropdown;

    @FindBy(xpath = "//div[@id='menu-companyId']//ul/li")
    public List<WebElement> companyOptions;

    @FindBy(name = "juridicalCompanyName")
    public WebElement entityNameInput;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createEntityButtonForm;

}
