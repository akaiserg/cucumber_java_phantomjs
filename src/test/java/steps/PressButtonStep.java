package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by akaiser on 05-08-2016.
 */
public class PressButtonStep {

    WebDriver driver;

    public PressButtonStep(){

        driver= Hooks.driver;

    }

    @When("^: I press the button  Validate$")
    public void i_press_the_button_Validate() throws Throwable {

        this.driver.findElement(By.className("btn-default")).click();

    }
}
