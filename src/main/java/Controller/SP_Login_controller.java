package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SP_Login_controller {

    private String username;
    private String password;
    private Boolean logStatues = false;

    @FXML private TextField usernameField;
    @FXML private TextField passwordField;
    @FXML private Button EnterButton;
    @FXML private Label loginFeedbackLabel;


    public void initialize() {
        //put link to database inside this method

//        username = username;
//        password = password;
        //logStatues = false;







        LoginCheck();

    }


    public void LoginCheck() {
        //if return 'logStatues' is true then the visibility will turn
        //to a success

        loginFeedbackLabel.setVisible(logStatues);

//        return login;
    }


    @FXML public void goHome() throws IOException {
        Scene_Controller.setRoot("SP_HomeScreen");
    }



}
