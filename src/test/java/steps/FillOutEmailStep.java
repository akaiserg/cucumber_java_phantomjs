package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by akaiser on 05-08-2016.
 */
public class FillOutEmailStep {

    WebDriver driver;

    public FillOutEmailStep(){

        driver= Hooks.driver;

    }

    @When("^:  I fill out  the field  email$")
    public void i_fill_out_the_field_email() throws Throwable {

        this.driver.findElement(By.name("email")).sendKeys("theemail@email.com");

    }

}
