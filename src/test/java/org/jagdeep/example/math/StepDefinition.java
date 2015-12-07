package org.jagdeep.example.math;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

public class StepDefinition {
	private Sum sum;

	@Given("^I have entered first number as \"([^\"]*)\" and second number as \"([^\"]*)\"$")
	public void i_have_entered_first_number_as_and_second_number_as(int a, int b) {
		sum = new Sum();
		sum.setFirstNumber(a);
		sum.setSecondNumber(b);
	}

	@Given("^I have entered numbers$")
	public void i_have_entered_numbers(List<Integer> numbers) {
		sum = new Sum();
		sum.setNumbers(numbers);
	}
	
	@When("^I press \"([^\"]*)\" button$")
	public void i_press_sum_button(String math) {
		if ("add".equals(math)) {
			sum.addTwoNumbers();
		} else if ("add given numbers".equals(math)) {
			sum.addNumbers();
		}
	}

	@Then("^I should get sum of two numbers as \"([^\"]*)\"$")
	public void i_should_get_sum_of_two_numbers_as(int result) {
		int actualResult = sum.getSum();
		assertThat(actualResult, is(result));
	}
	
	@Then("^I should get sum of given numbers as \"([^\"]*)\"$")
	public void i_should_get_sum_of_given_numbers_as(int result) {
		int actualResult = sum.getSum();
		assertThat(actualResult, is(result));
	}

}
