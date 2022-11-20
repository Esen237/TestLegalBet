package POM;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookMakerPage extends BasePOM {

    @FindBy(xpath = "(//span[@class=\"count\"])[1]")
    private WebElement reviewsOfBM;


    public BookMakerPage compareReviews(String reviews) {
        Assertions.assertEquals(reviews, helperMethods.getText(reviewsOfBM));
        return this;
    }

}
