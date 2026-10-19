package com.jazito.tablamultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

        @FXML
        private TextField txtNumero;
        @FXML
        private TextArea txtTabla;
    
    @FXML
    private void limpiar() {
       txtNumero.clear();
       txtTabla.clear();
    }
    
    @FXML
    private void calcular(){
        int numero = Integer.parseInt(txtNumero.getText());
        String resultado = "";
       
       for(int i=1; i<=10; i++){
           resultado = resultado + numero+"x"+i+"="+(numero*i)+"\n";
       }
       txtTabla.setText(resultado);
    }
    
}
