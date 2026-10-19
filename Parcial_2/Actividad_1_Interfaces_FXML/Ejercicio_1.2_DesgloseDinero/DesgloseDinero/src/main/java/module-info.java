module com.jazito.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.desglosedinero to javafx.fxml;
    exports com.jazito.desglosedinero;
}
