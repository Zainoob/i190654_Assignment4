package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class calculatorController {
	@FXML
	private Label result;
	
	private float number1=0;
	
	private float number2=0;
	
	private String operator="";
	
	private boolean start=true;
	
	private CalFunctions calculate=new CalFunctions();
	
	@FXML
	public void number(ActionEvent event){
		if(start){
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+ value);
	}
	
	@FXML
	public void operator(ActionEvent event) {
		String value=((Button)event.getSource()).getText();
		if(!value.equals("=")){
			if(!operator.isEmpty())
				return;
			
			operator = value;
			number1=Float.parseFloat(result.getText());			
			result.setText("");
		}else{
			if(operator.isEmpty())
				return;
			
			number2=Float.parseFloat(result.getText());
			float output=calculate.calculateBinaryNumber(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator="";
		}
	}
	public void UnaryOperator(ActionEvent event) {
	
		String value=((Button)event.getSource()).getText();
		if(!operator.isEmpty())
			return;
		
		operator = value;
		number1=Float.parseFloat(result.getText());	
		result.setText("");
		
		float output=calculate.calculateUnaryNumber(number1,operator);
		result.setText(String.valueOf(output));
		operator="";
	}
	
	public void clear(ActionEvent event){
		operator="";
		start=true;
		result.setText("");
	}
	public void gohome(ActionEvent event) throws IOException
	{
		Parent HomeView = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene HomeScene=  new Scene(HomeView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(HomeScene);
		window.setTitle("Utilities");
		window.show();
	}
}
