package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	@FXML
	private Button btTest;

	@FXML
	public void onBtTestAction() {
		System.out.println("Clique!!");
		Alerts.showAlert("T�tulo", "Header", "Ol�!", AlertType.INFORMATION);
	}

}
