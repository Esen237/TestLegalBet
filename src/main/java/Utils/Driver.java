package Utils;

import org.openqa.selenium.WebDriver;

public class Driver {


    private Driver() {
        // Singleton pattern.
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                default:
                    driver = GoogleChrome.loadChromeDriver();
                    break;

            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
