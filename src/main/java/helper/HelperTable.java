package helper;

import Utils.Driver;
import com.google.common.collect.Iterables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperTable {

    public List<WebElement> getAllElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public WebElement getLastElem(List<WebElement> webList) {
        return Iterables.getLast(webList);
    }


}
