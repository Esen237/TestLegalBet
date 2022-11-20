package helper;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelperActions {

    public HelperActions moveToElement(WebElement element){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.perform();
        return this;
    }

}
