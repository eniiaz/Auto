package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.JuridicEntityPage;
import pages.SupplySyncHomePage;
import pages.SupplySyncLoginPage;
import utils.Driver;

public class Second {

    @Test
    public void entityTest() throws InterruptedException {
        Driver.getDriver().get("https://supplysync.us");
        SupplySyncLoginPage supplySyncLoginPage = new SupplySyncLoginPage();
        supplySyncLoginPage.usernameInput.sendKeys("codewise@gmail.com");
        supplySyncLoginPage.passwordInput.sendKeys("123456");
        supplySyncLoginPage.loginBtn.click();

        SupplySyncHomePage supplySyncHomePage = new SupplySyncHomePage();
        supplySyncHomePage.juridicEntity.click();
        JuridicEntityPage juridicEntityPage = new JuridicEntityPage();
        Thread.sleep(1000);
        juridicEntityPage.createEntityBtn.click();
        Thread.sleep(1000);
        juridicEntityPage.formCompanyDropdown.click();
        juridicEntityPage.companyOptions.get(0).click();
        juridicEntityPage.formBranchDropdown.click();
        Thread.sleep(500);
        juridicEntityPage.branchOptions.get(2).click();
        juridicEntityPage.entityNameInput.sendKeys("Apple Incorporated");
        juridicEntityPage.createEntityButtonForm.click();


    }
}
