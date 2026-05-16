package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Gamer_Luncher extends Application {


    @Override
    public void start(Stage stage) throws IOException {


        try{

            Parent root = FXMLLoader.load(getClass().getResource( "/fxml/SP_HomeScreen.fxml"));
            Scene scene = new Scene(root, 700, 700);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
