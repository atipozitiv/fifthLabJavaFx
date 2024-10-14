package org.example.fifthlab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.w3c.dom.UserDataHandler;

import java.io.IOException;
import java.util.Objects;

public class RestaurantController {
    public Spinner potatoSpinner;
    public Spinner cutletSpinner;
    public Spinner sausageSpinner;
    public Spinner compoteSpinner;

    @FXML
    void getCheck(ActionEvent event) throws IOException {
        String result = "";
        Integer sum = 0;
        if ((Integer) potatoSpinner.getValue() > 0) {
            result += "Картошечка  " + potatoSpinner.getValue() + "  " + ((Integer) potatoSpinner.getValue() * 200) + "\n";
            sum += (Integer) potatoSpinner.getValue() * 200;
        }
        if ((Integer) cutletSpinner.getValue() > 0) {
            result += "Котлетка  " + cutletSpinner.getValue() + "  " + ((Integer) cutletSpinner.getValue() * 500) + "\n";
            sum += (Integer) cutletSpinner.getValue() * 500;
        }
        if ((Integer) sausageSpinner.getValue() > 0) {
            result += "Сосисочка  " + sausageSpinner.getValue() + "  " + ((Integer) sausageSpinner.getValue() * 300) + "\n";
            sum += (Integer) sausageSpinner.getValue() * 300;
        }
        if ((Integer) compoteSpinner.getValue() > 0) {
            result += "Компотик  " + compoteSpinner.getValue() + "  " + ((Integer) compoteSpinner.getValue() * 127) + "\n";
            sum += (Integer) compoteSpinner.getValue() * 127;
        }
        result += "\nОбщая стоимость: " + sum;
        HelloApplication.check = result;

        Stage stage = new Stage();
        Parent scene = FXMLLoader.load(Objects.requireNonNull(CheckForRestController.class.getResource("checkForRest.fxml")));
        stage.setScene(new Scene(scene));
        stage.setTitle("Чек");
        stage.setHeight(300);
        stage.setWidth(220);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)event.getSource()).getScene().getWindow() );
        stage.show();
    }

}
