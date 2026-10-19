package com.jazito.gastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefonia;
    @FXML
    private TextField txtOtros;
    @FXML
    private TextField txtTotalSemanal;
    @FXML
    private TextField txtMayorGasto;

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotalSemanal.clear();
        txtMayorGasto.clear();
    }

    @FXML
    private void estadisticas() {
        int cAlimentacion = Integer.parseInt(txtAlimentacion.getText());
        int cRefrigerios = Integer.parseInt(txtRefrigerios.getText());
        int cTransporte = Integer.parseInt(txtTransporte.getText());
        int cTelefonia = Integer.parseInt(txtTelefonia.getText());
        int cOtros = Integer.parseInt(txtOtros.getText());

        int totalSemanal = cAlimentacion + cRefrigerios + cTransporte + cTelefonia + cOtros;
        txtTotalSemanal.setText("" + totalSemanal);

        int[] gastos = new int[5];
        int mayor = 0;
        gastos[0] = cAlimentacion;
        gastos[1] = cRefrigerios;
        gastos[2] = cTransporte;
        gastos[3] = cTelefonia;
        gastos[4] = cOtros;
        mayor = gastos[0];
        for (int i = 0; i < gastos.length; i++) {

            if (gastos[i] > mayor) {
                mayor = gastos[i];
            }
        }
        if (mayor == gastos[0]) {
            txtMayorGasto.setText("Alimentación");
        } else if (mayor == gastos[1]) {
            txtMayorGasto.setText("Refrigerios");
        } else if (mayor == gastos[2]) {
            txtMayorGasto.setText("Transporte");
        } else if (mayor == gastos[3]) {
            txtMayorGasto.setText("Telefonía");
        } else if (mayor == gastos[4]) {
            txtMayorGasto.setText("Otros");
        }

    }
}
