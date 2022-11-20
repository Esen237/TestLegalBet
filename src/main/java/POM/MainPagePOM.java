package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPagePOM extends BasePOM {

    @FindBy(xpath = "//a[@class=\"icon icon-rating arrowed submenu-link\"]")
    public WebElement bookMakerButton;

    @FindBy(xpath = "//a[@href=\"/bukmekerskye-kontory/sets/legalnye-v-rossii/\"]")
    public WebElement legalBMButton;

    @FindBy(xpath = "//h1[@class=\"heading heading-1 index-heading\"]")
    public WebElement mainTitle;


    public String getMainTitle() {
        return helperMethods.getText(mainTitle);
    }

    public MainPagePOM moveOnBMButton() {
        helperActions.moveToElement(bookMakerButton);
        return this;
    }

    public MainPagePOM clickOnBMButton() {
        helperMethods.click(legalBMButton);
        return this;
    }


}
