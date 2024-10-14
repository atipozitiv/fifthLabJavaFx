package org.example.fifthlab;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

public class FlagController {

    public RadioButton firstBlue;
    public RadioButton firstWhite;
    public RadioButton firstGreen;
    public RadioButton secondBlue;
    public RadioButton secondWhite;
    public RadioButton secondGreen;
    public RadioButton thirdBlue;
    public RadioButton thirdWhite;
    public RadioButton thirdGreen;
    public Text resultText;
    String firstColor;
    String secondColor;
    String thirdColor;

    public void firstBlueAction() {
        firstWhite.setSelected(false);
        firstGreen.setSelected(false);
        firstColor = "Синий";
    }
    public void firstWhiteAction() {
        firstBlue.setSelected(false);
        firstGreen.setSelected(false);
        firstColor = "Белый";
    }
    public void firstGreenAction() {
        firstWhite.setSelected(false);
        firstBlue.setSelected(false);
        firstColor = "Зеленый";
    }

    public void secondBlueAction() {
        secondWhite.setSelected(false);
        secondGreen.setSelected(false);
        secondColor = "Синий";
    }
    public void secondWhiteAction() {
        secondBlue.setSelected(false);
        secondGreen.setSelected(false);
        secondColor = "Белый";
    }
    public void secondGreenAction() {
        secondWhite.setSelected(false);
        secondBlue.setSelected(false);
        secondColor = "Зеленый";
    }

    public void thirdBlueAction() {
        thirdWhite.setSelected(false);
        thirdGreen.setSelected(false);
        thirdColor = "Синий";
    }
    public void thirdWhiteAction() {
        thirdBlue.setSelected(false);
        thirdGreen.setSelected(false);
        thirdColor = "Белый";
    }
    public void thirdGreenAction() {
        thirdWhite.setSelected(false);
        thirdBlue.setSelected(false);
        thirdColor = "Зеленый";
    }

    public void paintButton() {
        HelloApplication.mainStage.setHeight(400);
        resultText.setText(firstColor + ", " + secondColor + ", " + thirdColor);
    }
}
