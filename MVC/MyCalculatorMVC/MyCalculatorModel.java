package MyCalculatorMVC;

public class MyCalculatorModel {
	//The Model handles the calculations of the calculator
	
	int result = 0;
	
	//Method that will do addition
	public void sum(int firstNumber, int secondNumber){
		result = firstNumber + secondNumber;
	}
	//get the sum 
	public int getSum(){
		return result;
	}
}
