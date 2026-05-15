module org.example.smartypartygame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.smartypartygame to javafx.fxml;
    exports org.example.smartypartygame;
}