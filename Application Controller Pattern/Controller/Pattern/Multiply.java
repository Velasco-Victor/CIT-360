package Application.Controller.Pattern;

import java.util.HashMap;

public class Multiply implements appHandler{
	@Override
	public void handler(HashMap<String, Object> data) {
		int result = ((int) data.get("numberOne")) * ((int) data.get("numberTwo"));
		System.out.println("You Chose Multiplication");
		System.out.println( (int) data.get("numberOne") + " * " + (int) data.get("numberTwo") + " = " +  "[" + result + "]");
		
	}	
}
