//U110416019鄭文琪

import java.math.*;

public class PrecisionNumber{
	//create some data fields
	BigDecimal number1;
	BigDecimal number2;
	
	//create a constructor to get the value of the number
	PrecisionNumber(String number1, String number2){
		//change the type of the input number
		this.number1 = new BigDecimal(number1);
		this.number2 = new BigDecimal(number2);
	}
	
	//create a method to calculate the numbers
	public void Calculate(int calculate, int scale){
		if(calculate == 1){
			System.out.println("The answer is : " + String.valueOf(number1.add(number2)));
		}
		else if(calculate == 2){
			System.out.println("The answer is : " + String.valueOf(number1.subtract(number2)));
		}
		else if(calculate == 3){
			System.out.println("The answer is : " + String.valueOf(number1.multiply(number2)));
		}
		else if(calculate == 4){
			//if the number is indivisible then get the scale which the user want
			System.out.println("The answer is : " + String.valueOf(number1.divide(number2, scale, BigDecimal.ROUND_HALF_UP)));
		}
	}
}