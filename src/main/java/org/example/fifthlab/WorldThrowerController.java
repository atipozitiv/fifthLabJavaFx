package org.example.fifthlab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WorldThrowerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}