package org.example.fifthlab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WorldThrowerController {
    public int turn = 0;

    public Button buttonThrower;
    @FXML
    private TextField firstText;
    @FXML
    private TextField secondText;

    @FXML
    protected void onThrowerButtonClick() {
        if (turn % 2 == 0) {
            secondText.setText(firstText.getText());
            firstText.setText("");
            buttonThrower.setText("↑");
        } else {
            firstText.setText(secondText.getText());
            secondText.setText("");
            buttonThrower.setText("↓");
        }
        turn += 1;
    }
}