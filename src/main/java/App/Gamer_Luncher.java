package App;

import Controller.Scene_Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static Controller.Scene_Controller.scene;
import static Controller.Scene_Controller.stage;


public class Gamer_Luncher extends Application {

    @Override
    public void start(Stage primarystage) throws IOException {

        Scene_Controller.stage = primarystage;
        Scene_Controller.stage.setTitle("Smarty Party");


        Scene_Controller.setRoot("SP_HomeScreen");

    }

    public static void main(String[] args) {
        launch(args);
    }
}





//try{
//
//Parent root = FXMLLoader.load(getClass().getResource( "/fxml/SP_HomeScreen.fxml"));
//Scene scene = new Scene(root, 700, 700);
//            stage.setScene(scene);
//            stage.show();
//
//        } catch (IOException e)
//        {
//        e.printStackTrace();
//        }