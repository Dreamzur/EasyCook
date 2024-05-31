module com.example.easycook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.easycook to javafx.fxml;
    exports com.example.easycook;
}