package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BMPagePOM extends BasePOM {

    @FindBy(xpath = "(//span[@class=\"count\"])[1]")
    private WebElement reviewsOfBM;
    @FindBy(xpath = "//div[@class=\"page-description floating-text\"]//h2")
    private WebElement getText;
    By allTableElements = By.xpath("//tr[@class=\"js-link\"]");

    public String getTextOfPage() {
        return helperMethods.getText(getText);
    }

    public List<WebElement> getAll10000List() {
        List<WebElement> webElementList = helperTable.getAllElements(allTableElements);
        List<WebElement> webElements10000 = new ArrayList<>();
        for (WebElement es : webElementList) {
            if (es.getText().trim().contains("10 000 ₽")) {
                webElements10000.add(es);
            }
        }
        return webElements10000;
    }

    public List<List<WebElement>> getListOfList() {
        List<List<WebElement>> webColum = new ArrayList<>();
        for (WebElement a : getAll10000List()) {
            List<WebElement> col = a.findElements(By.xpath(".//td"));
            webColum.add(col);
        }
        return webColum;
    }

    public String getNameOfBM() {
        return helperTable.getLastElem(getAll10000List()).getAttribute("data-href");
    }

    public String getReviews() {
        return getListOfList().get(getListOfList().size() - 1).get(2).getText();
    }

    public BMPagePOM clickOnBM() {
        helperMethods.click(helperTable.getLastElem(getAll10000List()));
        return this;
    }
}
