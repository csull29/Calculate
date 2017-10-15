/*
 * @author: Craig Sullivan
 * @date: 07/04!/2017
 * @file: Calculator.java
 */

public class Calculator {

	//data members
	private int num1, num2;
	private int sum;
  	private int diff;

	//constructor
	public Calculator(){
		num1 = 0;
		num2 = 0;
	}

	//set method(s)
	public void setNum1(int num1){
		this.num1 = num1;
	}
	public void setNum2(int num2){
		this.num2 = num2;
	}

	//compute method(s)
	public void computeSum(){
		sum = num1 + num2;
	}
	public void computeDiff(){
		diff = num1 - num2;
	}

	//get method(s)
	public int getSum(){
		return sum;
	}
	public int getDiff(){
		return diff;
	}
}
