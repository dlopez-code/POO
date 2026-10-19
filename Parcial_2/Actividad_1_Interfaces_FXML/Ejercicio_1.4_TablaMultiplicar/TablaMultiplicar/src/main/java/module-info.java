module com.jazito.tablamultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jazito.tablamultiplicar to javafx.fxml;
    exports com.jazito.tablamultiplicar;
}
