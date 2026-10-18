module com.jazito.edadpersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.edadpersona to javafx.fxml;
    exports com.jazito.edadpersona;
}
