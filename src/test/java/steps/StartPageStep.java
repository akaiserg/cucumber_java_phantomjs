package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

/**
 * Created by akaiser on 05-08-2016.
 */
public class StartPageStep {

    WebDriver driver;

    public StartPageStep(){

        driver=Hooks.driver;

    }

    @Given("^: I'm on  the site http://parsleyjs\\.org/doc/examples/simple\\.html$")
    public void i_m_on_the_site_http_parsleyjs_org_doc_examples_simple_html() throws Throwable {

        driver.navigate().to("http://parsleyjs.org/doc/examples/simple.html");

    }
}
