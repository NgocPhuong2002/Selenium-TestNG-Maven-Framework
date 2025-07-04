package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
    public String getErrorMessage() {
        return driver.findElement(By.cssSelector("[data-test='error']")).getText();
    }

  
}