package POM;

import Utils.Driver;
import helper.HelperActions;
import helper.HelperMethods;
import helper.HelperTable;
import org.openqa.selenium.support.PageFactory;

public class BasePOM {

    HelperTable helperTable = new HelperTable();
    HelperMethods helperMethods = new HelperMethods();
    HelperActions helperActions = new HelperActions();

    public BasePOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
