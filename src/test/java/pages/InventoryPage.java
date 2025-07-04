package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class InventoryPage {  
	//bang ke tat ca hang hoa
	WebDriver driver;

    @FindBy(className = "inventory_item")
    List<WebElement> products;

    @FindBy(css = ".shopping_cart_link")
    WebElement cartIcon;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCartByName(String productName) {
        for (WebElement product : products) {
            if (product.getText().contains(productName)) {
                product.findElement(By.cssSelector("button")).click();
                break;
            }
        }
    }

    public void removeFromCartByName(String productName) {
        for (WebElement product : products) {
            if (product.getText().contains(productName)) {
                product.findElement(By.cssSelector("button")).click();
                break;
            }
        }
    }

    public void goToCart() {
        cartIcon.click();
    }

    public void logout() {
        menuBtn.click();
        logoutLink.click();
    }

}
