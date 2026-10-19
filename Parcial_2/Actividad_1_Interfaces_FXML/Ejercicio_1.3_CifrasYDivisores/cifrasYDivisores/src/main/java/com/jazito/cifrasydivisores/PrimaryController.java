package com.jazito.cifrasydivisores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtCanCifras;
    @FXML
    private TextField txtSumaImpares;
    @FXML
    private TextField txtSumaPares;
    @FXML
    private TextField txtSumTotal;
    @FXML
    private TextField txtCifraMay;
    @FXML
    private TextField txtCifraMen;
    @FXML
    private TextArea txtDivisores;
    
    @FXML
    private void Analizar() {
        int numero = Integer.parseInt(txtNumero.getText());
        int temporal = numero;

        int cantidadCifras = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaTotal = 0;
        int cifraMayor = 0;
        int cifraMenor = 9;

        do {
            int cifra = temporal % 10;
            cantidadCifras++;

            //suma de cifras pares e impares
            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }

            //sSuma total
            sumaTotal += cifra;

            //cifra mayor
            if (cifra > cifraMayor) {
                cifraMayor = cifra;
            }

            //cifra menor
            if (cifra < cifraMenor) {
                cifraMenor = cifra;
            }

            temporal = temporal / 10;

        } while (temporal > 0);

        
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + "\n";
            }
        }
        
        txtCanCifras.setText("" + cantidadCifras);
        txtSumaImpares.setText("" + sumaImpares);
        txtSumaPares.setText("" + sumaPares);
        txtSumTotal.setText("" + sumaTotal);
        txtCifraMay.setText("" + cifraMayor);
        txtCifraMen.setText("" + cifraMenor);
        txtCifraMen.setText("" + cifraMenor);
        txtDivisores.setText(divisores);
    }

    @FXML
    private void Limpiar() {
        txtNumero.clear();
        txtCanCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumTotal.clear();
        txtCifraMay.clear();
        txtCifraMen.clear();
        txtDivisores.clear();
    }

}
