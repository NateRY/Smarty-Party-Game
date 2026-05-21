package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SP_Login_controller {

    private String username;
    private String password;
    private Boolean logStatues = false;

    @FXML private Label usernameLabel;
    @FXML private Label passwordLabel;


    public Boolean checkLogin(String username, String password) {
        //put link to database inside this method


        this.username = username;
        this.password = password;






        return logStatues;
    }
}
