package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by akaiser on 05-08-2016.
 */
public class FillOutNameStep {

    WebDriver driver;

    public FillOutNameStep(){

        driver= Hooks.driver;

    }

    @When("^: I fill out  the field  name$")
    public void i_fill_out_the_field_name() throws Throwable {

        this.driver.findElement(By.name("fullname")).sendKeys(" Test  name");

    }

}
