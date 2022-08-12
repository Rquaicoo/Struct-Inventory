module com.example.structinventory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.structinventory to javafx.fxml;
    exports com.example.structinventory;
}