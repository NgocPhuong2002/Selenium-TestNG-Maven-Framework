package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import untils.BaseTest;
public class CheckoutTest extends BaseTest {
	 @Test
	    public void checkoutSuccess() {
	        // Login
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("standard_user", "secret_sauce");
	        InventoryPage inventoryPage = new InventoryPage(driver);

	        // Add product
	        String product = "Sauce Labs Bike Light";
	        inventoryPage.addToCartByName(product);
	        inventoryPage.goToCart();

	        // Checkout
	        CartPage cartPage = new CartPage(driver);
	        Assert.assertTrue(cartPage.isProductInCart(product));
	        cartPage.clickCheckout();

	        CheckoutPage checkoutPage = new CheckoutPage(driver);
	        checkoutPage.fillInfo("Sauce", "Demo", "10000");

	        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
	        overviewPage.clickFinish();

	        CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
	        Assert.assertTrue(completePage.getCompleteHeader().contains("Thank you for your order"));
	    }

}
