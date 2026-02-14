package main;
import math.*;
public class MainProgram {

	public static void main(String[] args) {
				Arithmetic calculation = new Arithmetic();
				
				//addition
				System.out.println("The sum is " + calculation.addition(5, 7));
				
				//subtraction
				int diff = calculation.subtract(10, 1);
				System.out.println("The difference is " + diff); 
		}
	}
