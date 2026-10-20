module com.jazito.liebretortuga {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.liebretortuga to javafx.fxml;
    exports com.jazito.liebretortuga;
}
