package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart(String productName) {
        return driver.findElements(By.xpath("//div[@class='inventory_item_name' and text()='" + productName + "']")).size() > 0;
    }

    public void removeProductFromCart(String productName) {
        driver.findElement(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='cart_item']//button")).click();
    }

    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }
}