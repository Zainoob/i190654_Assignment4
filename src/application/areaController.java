package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class areaController {

	@FXML
	private Label ft;
	@FXML
	private Label km;
	@FXML
	private Label cm;
	@FXML
	private Label he;
	@FXML
	private Label mi;
	@FXML
	private Label in;
	@FXML
	private Label mm;
	@FXML
	private TextField metres;	
	
	
	@FXML
	public void convert(ActionEvent event){
		
		float metre=Float.parseFloat(metres.getText());
		float f1=(float) (metre*10.7639);
		float k1=(float) (metre/1000000);
		float c1=(float) (metre*10000);
		float h1=(float) (metre*10000);
		float m1=(float) (metre*2589988);
		float i1=(float) (metre*1550);
		float m2=(float) (metre*1000000);
		
		ft.setText(String.valueOf(f1)+" Square Feet");
		km.setText(String.valueOf(k1)+" Square Kilometers");
		cm.setText(String.valueOf(c1)+" Square Centimeters");
		he.setText(String.valueOf(h1)+" Hectares");
		mi.setText(String.valueOf(m1)+" Square Miles");
		in.setText(String.valueOf(i1)+" Square Inches");
		mm.setText(String.valueOf(m2)+" Square Milimeters");
	
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
