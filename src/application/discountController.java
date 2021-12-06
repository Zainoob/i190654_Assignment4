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

public class discountController {

	@FXML
	private Label value;	
	@FXML
	private TextField p1;	
	@FXML
	private TextField d1;	
	
	@FXML
	public void getdiscount(ActionEvent event){
		
		float priceval=Float.parseFloat(p1.getText());
		float discountval=Float.parseFloat(d1.getText());
		discountval=discountval/100;
		float pp=discountval*priceval;
		float dispriceval=priceval - pp;
		value.setText(String.valueOf(dispriceval));
	
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
