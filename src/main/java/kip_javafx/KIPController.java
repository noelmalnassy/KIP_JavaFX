package kip_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class KIPController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginClick() {
        System.out.println("Belépés gomb megnyomva!");
    }

}
