package org.example.fifthlab;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckForRestController implements Initializable {

    public Text checkText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        checkText.setText(HelloApplication.check);
    }
}
