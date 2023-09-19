package com.example.bankingsystem;

import com.example.bankingsystem.loginAndSignUp.loginUI;
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

        loginUI LUI = new loginUI(primaryPane);
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