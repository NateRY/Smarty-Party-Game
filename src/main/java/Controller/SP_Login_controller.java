package Controller;

import database.PlayerDatabaseManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.io.IOException;

public class SP_Login_controller {

    private String username;
    private String password;
    private Boolean logStatues = false;

    @FXML private TextField usernameField;
    @FXML private PasswordField pswField;
    @FXML private Button EnterButton;
    @FXML private Label loginFeedbackLabel;


    public void initialize() {
        //put link to database inside this method

        username = usernameField.getText().trim();
        password = pswField.getText().trim();


    }


   @FXML public void LoginCheck() {
        //if return 'logStatues' is true then the visibility will turn
        //to a success

        if (usernameField.getText().equals("") || pswField.getText().equals("")) {
            loginFeedbackLabel.setText("Please fill all the fields");
            loginFeedbackLabel.setTextFill(Color.RED);
            loginFeedbackLabel.setVisible(true);

            System.out.println("Fill all the fields");

        }


        logStatues = PlayerDatabaseManager.verifylogin(username, password);

        if(!logStatues) {

            loginFeedbackLabel.setText("Login Failed! Wrong Username or Password");
            loginFeedbackLabel.setTextFill(Color.RED);
            loginFeedbackLabel.setVisible(true);

        }else if(logStatues)
        {
            loginFeedbackLabel.setTextFill(Color.GREEN);
            loginFeedbackLabel.setText("Loginjjjjjjj Successfully");
            loginFeedbackLabel.setVisible(true);
        }





    }


    public void CreateNewPlayer() {

        if (usernameField.getText().equals("") || pswField.getText().equals("")) {
            loginFeedbackLabel.setText("Please fill all the fields");
            loginFeedbackLabel.setVisible(true);
            loginFeedbackLabel.setTextFill(Color.RED);

            System.out.println("Fill all the fields");
        }

        PlayerDatabaseManager.CreatePlayer(username,password);

        if(logStatues == false) {

            loginFeedbackLabel.setVisible(logStatues);
        }else
        {
            loginFeedbackLabel.setTextFill(Color.GREEN);
            loginFeedbackLabel.setText("Login Successfully");
            loginFeedbackLabel.setVisible(true);

        }


    }






    @FXML public void goHome() throws IOException {
        Scene_Controller.setRoot("SP_HomeScreen");
    }



}
