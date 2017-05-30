package MyCalculatorMVC;

import java.awt.event.ActionListener;

import MyCalculatorMVC.MyCalculatorController.CalculateListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyCalculatorView extends Application {
	public static void main(String[] args){
		Application.launch(args);
	}
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	Button bAdd = new Button("Add");

	public void start(Stage primaryStage) {



		GridPane gp = new GridPane();
		HBox h1 = new HBox();
		HBox h2 = new HBox();

		//		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);

		Scene scene = new Scene(gp, 380, 75);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

		gp.add(new Label("Number 1: ") ,0,0);
		tfNumber1.setMaxWidth(50);
		gp.add(tfNumber1, 1, 0);

		gp.add(new Label("Number 2: ") ,2,0);
		tfNumber2.setMaxWidth(50);
		gp.add(tfNumber2,3, 0);

		gp.add(new Label("Result: ") ,4,0);
		tfResult.setMaxWidth(50);
		gp.add(tfResult,5, 0);


		bAdd.setMinWidth(50);
		//		bAdd.setOnAction(e -> AddValue());
		gp.add(bAdd, 1 ,2);

		Button bSubtract = new Button("Subtract");
		bSubtract.setMinWidth(50);
		//bSubtract.setOnAction(e -> SubtractValue());
		gp.add(bSubtract, 2 ,2);

		Button bMultiply = new Button("Multiply");
		bMultiply.setMinWidth(50);
		//bMultiply.setOnAction(e -> MultiplyValue());
		gp.add(bMultiply, 3 ,2);

		Button bDivide = new Button("Divide");
		bDivide.setMinWidth(50);
		//bDivide.setOnAction(e -> DivideValue());
		gp.add(bDivide, 4 ,2);

		Button bClear = new Button("Clear");
		bClear.setMinWidth(50);
		//bClear.setOnAction(e -> clearForm());
		gp.add(bClear, 5 ,2);
	}


	public int getFirstNumber(){

		return Integer.parseInt(tfNumber1.getText());

	}

	public int getSecondNumber(){

		return Integer.parseInt(tfNumber2.getText());

	}

	public int getCalcSolution(){

		return Integer.parseInt(tfResult.getText());

	}

	public void setSumSolution(int solution){

		tfResult.setText(Integer.toString(solution));
	}
	
	public void addCalculateListener(ActionEvent event) {
		bAdd.addEventHandler(event, MyCalculatorController.CalculateListener());
		
	}

}

