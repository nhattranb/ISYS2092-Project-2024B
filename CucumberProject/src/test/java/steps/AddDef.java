package steps;

import io.cucumber.java.en.*;
import org.example.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddDef {
    CalculatorBasic cb = new CalculatorBasic();
    CalculatorAdvanced ca = new CalculatorAdvanced();

    public int a, b, choice;

    // step definition code
    @Given("I am on the outside")
    public void i_am_on_the_outside() {
        System.out.println("I am on the outside");
    }


    @When("I enter my first number as \\{a}")
    public void iEnterMyFirstNumberAsA() {
        a = 10;
    }

    @And("I enter my second number as \\{b}")
    public void iEnterMySecondNumberAsB() {
        b = 11;
    }

    @And("I enter my choice as {int}")
    public void iEnterMyChoiceAs(int arg0) {
        choice = 1;
    }

    @Then("I should see the sum of \\{a} and \\{b} is \\{sum}")
    public void iShouldSeeTheSumOfAAndBIsSum() {
        assertEquals(21, cb.add(a, b));
    }

    @When("I enter my first number as {int}")
    public void iEnterMyFirstNumberAs(int arg0) {
        a = 5;
    }

    @And("I enter my second number as ailqkkajqlkal")
    public void iEnterMySecondNumberAsAilqkkajqlkal() {
        String b = "ailqkkajqlkal";
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String arg0) {
        System.out.println("Invalid input");
    }
}
