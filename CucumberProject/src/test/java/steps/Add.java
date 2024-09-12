package steps;

import io.cucumber.java.en.*;
import org.example.*;
import static org.junit.jupiter.api.Assertions.*;

public class Add {
    CalculatorBasic cb = new CalculatorBasic();
    CalculatorAdvanced ca = new CalculatorAdvanced();

    public int a, b, choice;

    // step definition code
    @Given("a calculator")
    public void a_calculator() {
        System.out.println("I have a calculator");
    }


    @When("I enter my first number as \\{a}")
    public void iEnterMyFirstNumberAsA() {
    }


    @And("I enter my second number as \\{b}")
    public void iEnterMySecondNumberAsB() {
    }
}
