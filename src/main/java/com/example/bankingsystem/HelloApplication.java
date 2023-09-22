package com.example.bankingsystem;

import com.example.bankingsystem.database.dbConnect;
import com.example.bankingsystem.loginAndSignUp.loginUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private AnchorPane primaryPane = new AnchorPane();
    public static dbConnect database = new dbConnect();
    @Override
    public void start(Stage stage) throws IOException {

        loginUI LUI = new loginUI(primaryPane);
        System.out.println(database);



        Scene scene = new Scene(primaryPane,600,600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(false);
    }

    public static void main(String[] args) {
        launch();
    }
}