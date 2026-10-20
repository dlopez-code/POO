module com.jazito.conteo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.conteo to javafx.fxml;
    exports com.jazito.conteo;
}
