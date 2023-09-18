package com.example.bankingsystem;

import javafx.scene.layout.AnchorPane;

public class loginPage {
    private AnchorPane primaryPane;
    private String username;
    private String password;
    private String encryptedPassword;

    public AnchorPane getPrimaryPane() {
        return primaryPane;
    }

    public void setPrimaryPane(AnchorPane primaryPane) {
        this.primaryPane = primaryPane;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public boolean checkLogin(){
        // TODO Add checkLogin Method
        return true;
    }


    public loginPage(){
        //No-args constructor
    }
    public loginPage(AnchorPane primaryPane){
        this.primaryPane = primaryPane;
    }
}
