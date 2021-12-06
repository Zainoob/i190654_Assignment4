package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class bmiconvertorController {

	@FXML
	private Label value;	
	@FXML
	private Label value2;	
	@FXML
	private TextField w1;	
	@FXML
	private TextField h1;	
	
	@FXML
	public void getbmi(ActionEvent event){
		
		float weightval=Float.parseFloat(w1.getText());
		float heightval=Float.parseFloat(h1.getText());
		heightval*=heightval;
		float bmival=weightval/heightval;
		value.setText(String.valueOf(bmival));
		if(bmival<18.5)
		{
			value2.setText("Underweight");
		}
		if(bmival>18.5 && bmival<24.5)
		{
			value2.setText("Normal");
		}
		if(bmival>24.5)
		{
			value2.setText("Overweight");
		}
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

