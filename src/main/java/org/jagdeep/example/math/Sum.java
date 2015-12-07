package org.jagdeep.example.math;

public class Sum {

	private int firstNumber;
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
	
	public int getSum() {
		return sum;
	}
}
