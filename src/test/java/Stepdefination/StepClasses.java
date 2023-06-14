package Stepdefination;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Given;

public class StepClasses {

    @Given("my first test")
    public void my_first_test() {
        System.out.println("My first Test");
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
}
