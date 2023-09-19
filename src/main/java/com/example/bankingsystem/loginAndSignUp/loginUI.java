package com.example.bankingsystem.loginAndSignUp;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class loginUI {
    private AnchorPane primaryPane;

    public AnchorPane getPrimaryPane() {
        return primaryPane;
    }

    public void setPrimaryPane(AnchorPane primaryPane) {
        this.primaryPane = primaryPane;
    }
    public loginUI(){
        //No srgs constructor
    }

    public loginUI(AnchorPane primaryPane){
        this.primaryPane = primaryPane;
        VBox vbox = new VBox(userName_lbl,username,password_lbl,password,loginButton,createNewAccount,cNA_Button);
        vbox.setSpacing(20);
        primaryPane.getChildren().addAll(vbox);
        AnchorPane.setLeftAnchor(vbox,100.0);
        AnchorPane.setTopAnchor(vbox,200.0);
    }
    Label userName_lbl = new Label("UserName : ");

    TextField username = new TextField();

    Label password_lbl = new Label("Password : ");
    TextField password = new TextField();

    Button loginButton = new Button("Log In");
    Button cNA_Button = new Button("Create new acount");
    Label createNewAccount = new Label("       OR        ");




}
