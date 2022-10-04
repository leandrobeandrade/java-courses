package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}

	// Não retorna uma exceção mas valores ou null
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);	
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
}
