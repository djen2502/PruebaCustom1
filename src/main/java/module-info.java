module com.example.pruebacustom1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebacustom1 to javafx.fxml;
    exports com.example.pruebacustom1;
}