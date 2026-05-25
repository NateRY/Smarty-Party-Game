package App;

import database.DatabaseManager;
import Controller.Scene_Controller;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;


public class Gamer_Luncher extends Application {

    @Override
    public void start(Stage primarystage) throws IOException {

        Connection conn = DatabaseManager.connect();
        if (conn != null) {
            System.out.println("Connected to database.");
        }
        else{
            System.out.println("Connection Failed.");
        }

        Scene_Controller.stage = primarystage;
        Scene_Controller.stage.setTitle("Smarty Party");


        Scene_Controller.setRoot("SP_HomeScreen");
        primarystage.show();

    }

    public static void main(String[] args) {launch(args);}
}