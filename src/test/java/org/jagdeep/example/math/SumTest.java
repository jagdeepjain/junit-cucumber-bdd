package org.jagdeep.example.math;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/sum/sum.feature",
				    "src/test/resources/features/sum/sum_of_multiple_numbers.feature"}
		)
public class SumTest {

}
