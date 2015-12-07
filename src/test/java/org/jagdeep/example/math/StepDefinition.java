package org.jagdeep.example.math;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepDefinition {
	private Sum sum;

	@Given("^I have entered first number as \"([^\"]*)\" and second number as \"([^\"]*)\"$")
	public void i_have_entered_first_number_as_and_second_number_as(int a, int b) {
		sum = new Sum();
		sum.setFirstNumber(a);
		sum.setSecondNumber(b);
	}

	@When("^I press \"([^\"]*)\" button$")
	public void i_press_sum_button(String math) {
		if ("sum".equals(math)) {
			sum.addTwoNumbers();
		}
	}

	@Then("^I should get sum of two numbers as \"([^\"]*)\"$")
	public void i_should_get_sum_of_two_numbers_as(int result) {
		int actualResult = sum.getSum();
		assertThat(actualResult, is(result));
	}

}
