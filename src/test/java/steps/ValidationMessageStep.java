package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by akaiser on 05-08-2016.
 */
public class ValidationMessageStep {

    WebDriver driver;

    public ValidationMessageStep(){

        driver= Hooks.driver;

    }

    @Then("^: I see the message \"(.*?)\"$")
    public void i_see_the_message(String arg1) throws Throwable {

        WebElement element=this.driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[1]/p"));
        Assert.assertEquals(element.getText(),arg1);

    }

}
