package application;

import java.io.IOException;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainPageController {

	@FXML
	private AnchorPane rootPane;
	
	@FXML
	public void DiscountClicked(ActionEvent event) throws IOException
	{
		Parent CalenderView = FXMLLoader.load(getClass().getResource("discount.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Discount");
		window.show();
		
	}
	public void AgeClicked(ActionEvent event) throws IOException
	{
		Parent CalenderView = FXMLLoader.load(getClass().getResource("age.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Age");
		window.show();
		
	}
	public void CurrencyClicked(ActionEvent event) throws IOException
	{
		Parent CalenderView = FXMLLoader.load(getClass().getResource("currency.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Currency");
		window.show();
	}
	public void BMIClicked(ActionEvent event) throws IOException
	{
		Parent CalenderView = FXMLLoader.load(getClass().getResource("bmiconvertor.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("BMI");
		window.show();
	}
	public void AreaClicked(ActionEvent event) throws IOException
	{
		Parent CalenderView = FXMLLoader.load(getClass().getResource("area.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Area");
		window.show();
	}
	public void CalculatorClicked(ActionEvent event) throws IOException
	{
		Parent CalenderView = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		Scene CalenderScene=  new Scene(CalenderView);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(CalenderScene);
		window.setTitle("Calculator");
		window.show();
	}
}
