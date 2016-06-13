package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class FiveButtonsController {

    @FXML
    private Label time;

    public void buttonA(){

        Label secondlabel = new Label("Too Many Buttons");

        StackPane secondpane = new StackPane();
        secondpane.getChildren().add(secondlabel);

        Scene secondscene = new Scene(secondpane, 200, 100);

        Stage secondstage = new Stage();
        secondstage.setTitle("Fehler - Hinweis");
        secondstage.setScene(secondscene);

        secondstage.show();

    }

    public void buttonE(){
        LocalDateTime timer = LocalDateTime.now();
        time.setText("Uhrzeit: " + timer.toString());
    }
}
