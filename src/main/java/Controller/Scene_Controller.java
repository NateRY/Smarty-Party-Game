package Controller;

import App.Gamer_Luncher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene_Controller {

    private Scene scene;
    private Stage stage;
    private Parent root;



    public void setRoot(ActionEvent event, String filename) throws IOException {

        root = loadScene("SP_HomeScreen");
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void setRoot(String filename) throws IOException {
        root = loadScene(filename);
        stage = (Stage) root.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }




    public static Parent loadScene(String fileName) throws IOException {

        FXMLLoader loader = new FXMLLoader(Gamer_Luncher.class.getResource("/resources/view/" +
                fileName + ".fxml"));

        return loader.load();
    }
}
