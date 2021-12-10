package com.example.graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GraphicsNewController {


    public TextField AreaText;
    public Button Computebutton;
    public TextField CirconferenceText;
    public TextField fieldHeight;
    public TextField FieldWith;


    public void Compute(ActionEvent actionEvent) {
        Rectangle r = new Rectangle(Double.parseDouble(FieldWith.getText()),Double.parseDouble(fieldHeight.getText()));
        AreaText.setText(""+r.computeArea());
        CirconferenceText.setText(""+r.computeCirconference());
    }

}
