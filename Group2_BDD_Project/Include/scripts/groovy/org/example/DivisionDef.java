package steps;

import io.cucumber.java.en.*;
import org.example.*;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionDef {
    CalculatorBasic cb = new CalculatorBasic();
    CalculatorAdvanced ca = new CalculatorAdvanced();

    public int a, b, choice;

    // step definition code
    @Given("I am on the outside")
    public void i_am_on_the_outside() {
        System.out.println("I am on the outside");
    }

    @When("I enter my first number as {int}")
    public void iEnterMyFirstNumberAs(int arg0) {
        a = 10;
    }
}
