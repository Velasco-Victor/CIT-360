package Application.Controller.Pattern;
import java.util.*;

public class ApplicationControllerPattern {

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);

		appController controlling = new appController();

		System.out.println("Please enter two Intigers");

		int numberOne = a.nextInt();
		int numberTwo = a.nextInt();

		HashMap toHandler = new HashMap();

		toHandler.put("numberOne", numberOne);
		toHandler.put("numberTwo", numberTwo);

		System.out.println("Please enter a number to select arithmetic you wish to perform");
		System.out.println("[1 = +]  [2 = -] [3 = *] [4 = /]");

		int arithmetic = a.nextInt();

		if(arithmetic == 1){

			controlling.mapCommand("Addition", new Addition());
			controlling.handleRequest("Addition", toHandler);
		} 
		else if(arithmetic == 2){
			controlling.mapCommand("Subtraction", new Subtract());
			controlling.handleRequest("Subtraction", toHandler);
		}
		else if(arithmetic == 3){
			controlling.mapCommand("Multiply", new Multiply());
			controlling.handleRequest("Multiply", toHandler);
		}else{
			controlling.mapCommand("Division", new Division());
			controlling.handleRequest("Division", toHandler);
		}

	}
}
