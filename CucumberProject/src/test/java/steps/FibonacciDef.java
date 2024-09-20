package steps;

import io.cucumber.java.en.*;
import org.example.*;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciDef {
    CalculatorBasic cb = new CalculatorBasic();
    CalculatorAdvanced ca = new CalculatorAdvanced();

    public int a, b, choice;

    // step definition code
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        System.out.println("I have a calculator");
    }

    @When("I enter my first number as \\\\{a}")
    public void iEnterMyFirstNumberAsA() {
        System.out.println("I enter my first number as a");
        a = 5;
    }

    @And("I enter my second number as \\\\{b}")
    public void iEnterMySecondNumberAsB() {
        System.out.println("I enter my second number as b");
        b = 10;
    }

    @And("I enter my choice as {int}")
    public void iEnterMyChoiceAs(int arg0) {
        choice = 1;
    }

    @Then("I should get the Fibonacci of the two numbers")
    public void i_should_get_the_fibonacci_of_the_two_numbers() {
        System.out.println("I should get the Fibonacci of the two numbers");
        assertEquals(55, ca.Fibonacci(a, b));
    }
}
