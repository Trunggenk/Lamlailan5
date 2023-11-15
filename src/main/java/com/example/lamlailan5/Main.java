package com.example.lamlailan5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setTitle("Hello!");
        stage.setScene(new Scene(root, 873, 648));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}