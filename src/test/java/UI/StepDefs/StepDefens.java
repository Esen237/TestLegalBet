package UI.StepDefs;

import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefens extends BaseSteps{

    @Given("user is on {string}")
    public void user_is_on(String string) {
        Driver.getDriver().navigate().to(string);
    }
    @Then("user should see {string}")
    public void user_should_see(String string) {
       Assertions.assertEquals(string,mainPagePOM.getMainTitle());
    }
    @Then("user open menu Букмекеры")
    public void user_open_menu_букмекеры() {
        mainPagePOM.moveOnBMButton();
    }
    @When("user click on Все легальные букмекеры button")
    public void user_click_on_все_легальные_букмекеры_button() {
       mainPagePOM.clickOnBMButton();
    }
    @When("user should find {string}")
    public void user_should_find(String string) {
        Assertions.assertEquals(string,bmPagePOM.getTextOfPage());
    }
    @Then("user choose last one with given bonus and compare reviews")
    public void userChooseLastOneWithGivenBonusAndCompareReviews() {
        System.out.println(bmPagePOM.getNameOfBM());
        String reviews = bmPagePOM.getReviews();
        System.out.println(reviews);
        bmPagePOM.clickOnBM();
        bookMakerPage.compareReviews(reviews);
    }

}
