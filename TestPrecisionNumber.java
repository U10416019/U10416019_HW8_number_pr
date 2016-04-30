//U10416019鄭文琪

import java.util.Scanner;

public class TestPrecisionNumber{
	public static void main(String[] args){
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		
		//let the user enter the first number
		System.out.print("Please enter the first number : ");
		String number1 = input.next();
		//let the user enter the second number
		System.out.print("Please enter the second number : ");
		String number2 = input.next();
		
		
		//create a variable precisionNumber to call the PrecisionNumber class and input the value
		PrecisionNumber precisionNumber = new PrecisionNumber(number1, number2);
		
		
		//let the user choose the method of calculate
		System.out.print("Please enter the number which you want to calculate (1 for add, 2 for subtract, 3 for multiply, 4 for divide) :");
		int calculate = input.nextInt();
		//if the number is not in the range, then let the user enter the number again
		while(calculate < 1 || calculate > 4){
			System.out.println("The number you enter is not in the range.");
			System.out.print("Please enter the number which you want to calculate (1 for add, 2 for subtract, 3 for multiply, 4 for divide) :");
			calculate = input.nextInt();
		}
		
		
		//let the user enter the scale
		System.out.print("Please enter the scale you want if the number is indivisible : ");
		int scale = input.nextInt();
		//if the number is not greater than zero, then let the user enter the number agagin
		while(scale < 0){
			System.out.println("The number you enter is not greater than zero.");
			System.out.print("Please enter the scale you want if the number is indivisible : ");
			scale = input.nextInt();
		}
		
		
		//call the method in the PrecisionNumber class which is a method to calculate the numbers
		precisionNumber.Calculate(calculate, scale);
	}
}