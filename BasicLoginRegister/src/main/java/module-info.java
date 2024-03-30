module com.example.basicloginregister {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basicloginregister to javafx.fxml;
    exports com.example.basicloginregister;
}