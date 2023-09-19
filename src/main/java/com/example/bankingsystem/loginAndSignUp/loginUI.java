package com.example.bankingsystem.loginAndSignUp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class loginUI {
    private boolean passwordVisible = false;
    private AnchorPane primaryPane;

    public AnchorPane getPrimaryPane() {
        return primaryPane;
    }

    public void setPrimaryPane(AnchorPane primaryPane) {
        this.primaryPane = primaryPane;
    }

    public loginUI() {
        // No args constructor
    }

    public loginUI(AnchorPane primaryPane) {
        this.primaryPane = primaryPane;
        passwordArea.getChildren().addAll(password,showHideButton);
        showHideButton.setOnAction(e->{
            togglePasswordVisibility();
        });
        VBox vbox = new VBox(userName_lbl, username, password_lbl, passwordArea, loginButton, createNewAccount, cNA_Button);
        vbox.setSpacing(20);
        primaryPane.getChildren().addAll(vbox);
        AnchorPane.setLeftAnchor(vbox, 200.0);
        AnchorPane.setTopAnchor(vbox, 100.0);

        // Apply CSS styles
        vbox.getStyleClass().add("login-box");
        userName_lbl.getStyleClass().add("label");
        username.getStyleClass().add("text-field");
        password_lbl.getStyleClass().add("label");
        password.getStyleClass().add("text-field");
        loginButton.getStyleClass().add("login-button");
        createNewAccount.getStyleClass().add("or-label");
        cNA_Button.getStyleClass().add("create-account-button");
    }

    Label userName_lbl = new Label("UserName : ");
    TextField username = new TextField();
    Label password_lbl = new Label("Password : ");
    HBox passwordArea = new HBox();
    PasswordField password = new PasswordField();
    Button showHideButton = new Button("Show");


    Button loginButton = new Button("Log In");
    Button cNA_Button = new Button("Create new account");
    Label createNewAccount = new Label("       OR        ");


    private void togglePasswordVisibility() {
        if (passwordVisible) {
            System.out.println(password.getText());
            password.setText(password.getText());
            showHideButton.setText("Hide");
        } else {
            password.setPromptText("Password");
            showHideButton.setText("Show");
        }
        passwordVisible = !passwordVisible;
    }
}
