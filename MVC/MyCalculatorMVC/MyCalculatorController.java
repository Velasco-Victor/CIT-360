package MyCalculatorMVC;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class MyCalculatorController {

	private MyCalculatorView theView;
	private MyCalculatorModel theModel;
	
	public MyCalculatorController(MyCalculatorView theView, MyCalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class

		this.theView.addCalculateListener(new ActionEvent());
	}
	class CalculateListener implements EventHandler{

		@Override
		public void handle(Event event) {
			int firstNumber, secondNumber = 0;
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			try{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.sum(firstNumber, secondNumber);

				theView.setSumSolution(theModel.getSum());
			}
			catch(NumberFormatException ex){

			}
			
		}
		
	}
}
