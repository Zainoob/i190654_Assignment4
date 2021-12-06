package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class currencyController{

	@FXML
	private Label d;
	@FXML
	private Label p;
	@FXML
	private Label l;
	@FXML
	private Label y;
	@FXML
	private Label w;
	@FXML
	private TextField p1;	
	
	
	@FXML
	public void getdiscount(ActionEvent event){
		
		float rupee=Float.parseFloat(p1.getText());
		float d1=(float) (rupee/176.97);
		float p1=(float) (rupee/234.60);
		float l1=(float) (rupee/12.88);
		float y1=(float) (rupee/1.56);
		float w1=(float) (rupee*6.67);
		
		d.setText(String.valueOf(d1)+" US Dollars");
		p.setText(String.valueOf(p1)+" British Pounds");
		l.setText(String.valueOf(l1)+" Turkish Lira");
		y.setText(String.valueOf(y1)+" Japanese Yen");
		w.setText(String.valueOf(w1)+" Korean Won");
	
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
