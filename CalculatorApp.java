/*
 * @author: Craig Sullivan
 * 07/04/2017
 * CalculatorApp.java
 */

import java.util.Scanner;

public class CalculatorApp{

	public static void main(String args[]){

		//declare variables
		int num1, num2;
		int sum;
		int diff;

		//declare objects
		Scanner keyboard;
		Calculator myCalc;

		//create objects
		keyboard = new Scanner(System.in);
		myCalc = new Calculator();

		//input
		System.out.println("Enter first number>>");
		num1 = keyboard.nextInt();
		System.out.println("Enter second number>>");
		num2 = keyboard.nextInt();

		//process i.e. set inputs, do computations, return answers
		myCalc.setNum1(num1);
		myCalc.setNum2(num2);
		myCalc.computeSum();
		myCalc.computeDiff();
		sum = myCalc.getSum();
		diff = myCalc.getDiff();

		//output
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The difference of " + num1 + " and " + num2 + " is " +diff);
	}
}
