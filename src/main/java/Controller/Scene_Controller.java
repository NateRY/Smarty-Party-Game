package Controller;

import App.Gamer_Luncher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Scene_Controller {


    public static Scene scene;
    public static Stage stage;
    public static Parent root;



    public void setRoot(ActionEvent event, String fileName) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(Gamer_Luncher.class.getResource("/fxml/" +
                fileName + ".fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 700, 700);
        stage.setScene(scene);
        stage.show();

    }

    public static Parent setRoot(String fileName) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(Scene_Controller.class.getResource("/fxml/" +
                fileName + ".fxml")));
        stage.setScene(root.getScene());
        scene = new Scene(root, 700,700);
        stage.setScene(scene);
        stage.show();

        return root;

    }

    public static Scene getScene() { return scene;}
    public static Stage getStage() { return stage;}
    public static Parent getRoot() { return root; }


}