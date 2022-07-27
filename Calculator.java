/*2) Create a new class called Calculator with the following methods:

1. A static method called powerInt(int num1,int num2)

This method should return num1 to the power num2.

2. A static method called powerDouble(double num1,int num2).

This method should return num1 to the power num2.

3. Invoke both the methods and test the functionalities.

Hint: Use Math.pow(double,double) to calculate the power.*/

import java.util.Scanner;

public class Calculator {

	
	static int powerInt(int num1, int num2)
	{
		 int c=1;

		 for(int i=1;i<=num2;i++) {
			 c=c*num1;
		 }
		 return c;
		 
	
	}
	
	static double powerDouble(double num1, int num2)
	{
		 double c=1;
		 for(int i=1;i<=num2;i++) {
			 c=c*num1;
		 }
		 return c;
		 
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Value 1 " + powerInt(4,5));
		System.out.println("Value 2 " + powerDouble(1.2,2));

	}

}
