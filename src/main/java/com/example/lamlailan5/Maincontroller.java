package com.example.lamlailan5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.security.cert.PolicyNode;

public class Maincontroller {

    @FXML
    private Button dictionary_button;


    @FXML
    private Button study_button;

    @FXML
    private Button transalate_button;

    public void page1(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Dictionary.fxml"));
    }

}
