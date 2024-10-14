package org.example.fifthlab;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

public class WidgetsController {
    public CheckBox firstCheck;
    public Text firstText;
    public CheckBox secondCheck;
    public Text secondText;
    public CheckBox thirdCheck;
    public Text thirdText;

    @FXML
    void onFirstCheckAction() {
        if (firstCheck.isSelected()) {
            firstText.setVisible(false);
        } else {
            firstText.setVisible(true);
        }
    }

    @FXML
    void onSecondCheckAction() {
        if (secondCheck.isSelected()) {
            secondText.setVisible(false);
        } else {
            secondText.setVisible(true);
        }
    }

    @FXML
    void onThirdCheckAction() {
        if (thirdCheck.isSelected()) {
            thirdText.setVisible(false);
        } else {
            thirdText.setVisible(true);
        }
    }
}
