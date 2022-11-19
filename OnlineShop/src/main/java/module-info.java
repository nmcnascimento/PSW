module com.example.onlineshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;

    opens com.example.onlineshop to javafx.fxml;
    exports com.example.onlineshop;
}