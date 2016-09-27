package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

/**
 * Created by akaiser on 05-08-2016.
 */
public class CloseBrowserStep {

    WebDriver driver;

    public CloseBrowserStep(){

        driver= Hooks.driver;

    }

    @Then("^: I close the browser$")
    public void i_close_the_browser() throws Throwable {

        this.driver.close();

    }
}
