package MyCalculatorMVC;

import CalculatorMVC.CalculatorController;
import CalculatorMVC.CalculatorModel;
import CalculatorMVC.CalculatorView;

public class MyCalculatorMVC {
	public static void main(String[] args) {

		MyCalculatorView theView = new MyCalculatorView();

		MyCalculatorModel theModel = new MyCalculatorModel();


		MyCalculatorController theController = new MyCalculatorController(theView,theModel);

		//theView.set(true);

	}
}
