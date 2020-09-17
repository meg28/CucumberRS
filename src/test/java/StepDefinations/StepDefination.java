package StepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjectModel.AlertPOM;
import Utility.Base;


@RunWith(Cucumber.class)
public class StepDefination extends Base {
	AlertPOM alerttest = new AlertPOM(driver);


    @Given("^Chrome is initialized$")
    public void chrome_is_initialized() throws Throwable {
    	driver = initializedriver();
		log.info("Driver initialized-Start Alert");
		
		Thread.sleep(2000);
		log.info("Start Alert");
		 // this driver will go to listeners driver if this method /class fails

    	
	System.out.println("Givencheck");

    }
    
    @When("^Browser opens up, Alert is accepted and dismissed$")
    public void browser_opens_up_alert_is_accepted_and_dismissed() throws Throwable {
		
    	alerttest.getname().sendKeys(alertpa);

		alerttest.getalert().click();
		driver.switchTo().alert().accept();

		alerttest.getconfirm().click();
		driver.switchTo().alert().dismiss();
    	
    	System.out.println("whencheck");
    	
        
    }

    @And("^data is send to alert textbox$")
    public void data_is_send_to_alert_textbox() throws Throwable {
    	alerttest.getname().sendKeys(alertpa);
    	System.out.println("thencheck");
    	
       
    }

}