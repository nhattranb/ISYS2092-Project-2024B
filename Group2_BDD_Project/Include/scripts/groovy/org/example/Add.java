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
        System.out.println("I enter my first number as a");
        a = 5;
    }


    @And("I enter my second number as \\{b}")
    public void iEnterMySecondNumberAsB() {
        System.out.println("I enter my second number as b");
        b = 10;
    }

    @And("I enter my choice as \\{choice}")
    public void iEnterMyChoiceAsChoice() {
        System.out.println("I enter my choice as choice");
        choice = 1;
    }
}
