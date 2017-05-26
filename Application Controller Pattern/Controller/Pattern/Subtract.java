package Application.Controller.Pattern;

import java.util.HashMap;

public class Subtract implements appHandler{
	@Override
	public void handler(HashMap<String, Object> data) {
		int result = ((int) data.get("numberOne")) - ((int) data.get("numberTwo"));
		System.out.println("You Chose Subtraction");
		System.out.println( (int) data.get("numberOne") + " - " + (int) data.get("numberTwo") + " = " +  "[" + result + "]");
		
	}	

}
