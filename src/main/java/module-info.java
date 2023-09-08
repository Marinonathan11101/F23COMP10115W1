module com.example.f23comp10115w1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f23comp10115w1 to javafx.fxml;
    exports com.example.f23comp10115w1;
}