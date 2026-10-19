module com.jazito.cifrasydivisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.cifrasydivisores to javafx.fxml;
    exports com.jazito.cifrasydivisores;
}
