package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import untils.BaseTest;

public class CartTest extends BaseTest {
    @Test
    public void addToCartAndRemove() {
        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Add product
        String product = "Sauce Labs Backpack";
        inventoryPage.addToCartByName(product);
        inventoryPage.goToCart();

        // Verify in cart
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isProductInCart(product));

        // Remove product
        cartPage.removeProductFromCart(product);
        Assert.assertFalse(cartPage.isProductInCart(product));
    }
}