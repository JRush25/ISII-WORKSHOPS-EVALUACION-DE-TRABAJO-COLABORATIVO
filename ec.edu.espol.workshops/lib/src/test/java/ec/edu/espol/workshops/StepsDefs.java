package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class StepsDefs {
    public double actualAnswer;
    public double actualAnswer1;
    public double actualAnswer2;
    public Customer c = new Customer(); 

    @Given("customer does not have a valid license")
    public void customer_female() {
        c.setAge(20);
        c.setValidLicense(false);
    }

     @When("calculate the premium")
     public void i_calculate_the_premium() {
     if (c.validatePolicies(c.getAge(), c.isValidLicense())){
    	 actualAnswer = 1;
     }else {
    	 actualAnswer = 0;
     }
     }

     @Then("show customer does not comply policies")
     public void i_should_be_shown() {
    	 
         assertEquals(0, actualAnswer);
     } 

     @Given("customer is under 18")
     public void customer_is_under_18() {
         c.setAge(5);
         c.setGender('M');
         c.setMaritalStatus(false);
     }

      @When("calculate the premium")
      public void calculate_premium() {
      actualAnswer1 = CarInsurance.calculatePremiumTotal(c.getAge(),c.getGender(),c.isMaritalStatus());
      }

      @Then("show -1")
      public void should_be_shown() {
          assertEquals(-1, actualAnswer1);
      }

      @Given("customer is over 80")
      public void customer_is_over_80() {
          c.setAge(90);
          c.setValidLicense(true);
      }

       @When("we calculate the premium")
       public void we_calculate_the_premium() {
    	   if (c.validatePolicies(c.getAge(), c.isValidLicense())){
    	    	 actualAnswer2 = 1;
    	     }else {
    	    	 actualAnswer2 = 0;
    	     }
       }

       @Then("show customer does not comply policies")
       public void should_show() {
           assertEquals(0, actualAnswer2, 0);
       }  
}