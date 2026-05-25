module org.example.smartypartygame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens App to javafx.fxml;
    opens Controller to javafx.fxml;


    exports App;

}