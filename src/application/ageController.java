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

public class ageController {
	@FXML
	private Label age;

	@FXML
	private TextField d1;
	@FXML
	private TextField m1;
	@FXML
	private TextField y1;
	@FXML
	private TextField d2;
	@FXML
	private TextField m2;
	@FXML
	private TextField y2;

	@FXML
	public void getBage(ActionEvent event) {

		int bd = (int) Float.parseFloat(d1.getText());
		int bm = (int) Float.parseFloat(m1.getText());
		int by = (int) Float.parseFloat(y1.getText());
		int cd = (int) Float.parseFloat(d2.getText());
		int cm = (int) Float.parseFloat(m2.getText());
		int cy = (int) Float.parseFloat(y2.getText());

		int d, m, y;
		int mon[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		y = cy - by;
		if (cm < bm) {
			y--;
			m = 12 - (bm - cm);
		} else {
			m = cm - bm;
		}
		if (cd < bd) {
			m--;
			d = mon[cm - 1] - (bd - cd);
		} else {
			d = cd - bd;
		}

		age.setText("You are " +String.valueOf(y) + " years " + String.valueOf(m) + " months " + String.valueOf(d) + " days old!");

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
