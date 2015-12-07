package org.jagdeep.example.math;

import java.util.List;

public class Sum {

	private int firstNumber;
	private List<Integer> numbers;
	
	private int secondNumber;
	private int sum;
	
	public void setFirstNumber(int number) {
		this.firstNumber = number;
	}
	
	public void setSecondNumber(int number) {
		this.secondNumber = number;
	}
	
	public void addTwoNumbers() {
		this.sum = this.firstNumber + this.secondNumber;
	}
	
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public void addNumbers() {
		for (Integer number : numbers) {
            this.sum += number;
        }
		System.out.println("Sum of give numbers: " + this.sum);
	}
	
	public int getSum() {
		return this.sum;
	}
}
