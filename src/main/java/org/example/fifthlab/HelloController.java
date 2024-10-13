package org.example.fifthlab;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    protected void onThrowerButtonClick() throws IOException {
        HelloApplication.setWordThrower();
    }
    @FXML
    protected void onWidgetsButtonClick() throws IOException {
        HelloApplication.setWidgets();
    }
    @FXML
    protected void onRestaurantButtonClick() throws IOException {
        HelloApplication.setRestaurant();
    }
    @FXML
    protected void onCalculatorButtonClick() throws IOException {
        HelloApplication.setCalculator();
    }
    @FXML
    protected void onFlagButtonClick() throws IOException {
        HelloApplication.setFlag();
    }
}