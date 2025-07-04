package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	 WebDriver driver;

	    @FindBy(className = "complete-header")
	    WebElement completeHeader;

	    public CheckoutCompletePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public String getCompleteHeader() {
	        return completeHeader.getText();
	    }

}
