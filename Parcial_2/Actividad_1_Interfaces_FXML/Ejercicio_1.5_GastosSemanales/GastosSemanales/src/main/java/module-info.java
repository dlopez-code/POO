module com.jazito.gastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.gastossemanales to javafx.fxml;
    exports com.jazito.gastossemanales;
}
