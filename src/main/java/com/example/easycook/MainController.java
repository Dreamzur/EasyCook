package com.example.easycook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
// Controller class handles all the events of the application

public class MainController {
    /**
     * All events are initialized below.
     * To add and create new events you have to enable it in scene builder and then initialize it here!
     */
//------------------------------------------------------\\
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameText;
    @FXML
    private PasswordField passwordText;
//------------------------------------------------------\\

    public void loginButtonOnAction(ActionEvent e) {

        if(!usernameText.getText().isBlank() && !passwordText.getText().isBlank()) {
            loginMessageLabel.setText("Login Attempt!");
        } else {
            loginMessageLabel.setText("Please enter the correct credentials.");
        }
    }

    //This method closes the application when you hit the 'Cancel' button
    public void cancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close(); //closes the application
        System.out.println("User has manually closed the application."); //once app is closed this prints onto console
    }
}