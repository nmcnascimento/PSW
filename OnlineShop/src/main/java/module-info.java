module com.example.onlineshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.base;
    requires java.sql;

    opens com.example.onlineshop to javafx.graphics, javafx.fxml;
    exports com.example.onlineshop;
}