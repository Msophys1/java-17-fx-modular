package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GraphicsApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("graphics.new.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 300);
            primaryStage.setTitle("Graphic");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

