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

}