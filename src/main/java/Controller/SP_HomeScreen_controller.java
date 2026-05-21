package Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;

public class SP_HomeScreen_controller {

//    @FXML private Button SinglePlayer;

    //This brings player to the name entry scene
    public void goSinglePlayer() throws IOException {
        Scene_Controller.setRoot("SinglePlayer_Entry");
    }


    @FXML private void SignIn() throws IOException
    {
        Scene_Controller.setRoot("SP_Login");
    }





//    public void goP2_NewGame() throws IOException {
//        Scene_Controller.loadScene("P2_Gamplay_Entry");
//    }
//
//    public void goQuestionEntry() throws IOException {
//        Scene_Controller.loadScene("Question_Entry_Scene");
//    }
//
//
//    public void goLeaderboard() throws IOException {
//        Scene_Controller.loadScene("Leaderboard_Scene");
//    }
//
//    public void playGameP1() throws IOException {
//        Scene_Controller.loadScene("P1_GamePlay_Sceen");
//    }
//
//    public void playGameP2() throws IOException {
//        Scene_Controller.loadScene("P2_GamePlay_Sceen");
//    }
//
//    @FXML
//    private void goHome() throws IOException {
//        Scene_Controller.setRoot("SP_HomeScreen");
//
//    }

    public void closeGame() throws IOException {
        Platform.exit();
    }


}