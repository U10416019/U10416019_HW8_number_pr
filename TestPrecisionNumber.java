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
		
		
	}
}