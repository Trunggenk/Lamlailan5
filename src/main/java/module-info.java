module com.example.lamlailan5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.lamlailan5 to javafx.fxml;
    exports com.example.lamlailan5;
}