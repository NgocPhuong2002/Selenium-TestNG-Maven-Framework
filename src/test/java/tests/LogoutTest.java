package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import untils.BaseTest;

public class LogoutTest extends BaseTest {
	  @Test
	    public void logoutSuccess() {
	        // Login
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("standard_user", "secret_sauce");

	        InventoryPage inventoryPage = new InventoryPage(driver);
	        inventoryPage.logout();

	        // Kiểm tra đã về lại trang login
	        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"));
	        Assert.assertTrue(driver.getPageSource().contains("Accepted usernames are"));
	    }

}
