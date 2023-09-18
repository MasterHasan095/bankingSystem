package com.example.bankingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private AnchorPane primaryPane = new AnchorPane();
    @Override
    public void start(Stage stage) throws IOException {

        loginPage lPage = new loginPage(primaryPane);
        Scene scene = new Scene(primaryPane,390,750);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(false);
    }

    public static void main(String[] args) {
        launch();
    }
}