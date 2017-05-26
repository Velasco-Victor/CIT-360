package Application.Controller.Pattern;
import java.util.HashMap;

public class Addition implements appHandler {
	@Override
	public void handler(HashMap<String, Object> data) {
		int sum = ((int) data.get("numberOne")) + ((int) data.get("numberTwo"));
		System.out.println("You Chose Addition");
		System.out.println( (int) data.get("numberOne") + " + " + (int) data.get("numberTwo") + " = " +  "[" + sum + "]");
		
	}	
}
