package com.jazito.desglosedinero;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextArea txtBilletes;
    @FXML
    private TextField txtCantidad;
    @FXML
    private TextArea txtCantidadBilletes;
   
    @FXML
    private void initialize(){
        txtBilletes.setText("Billetes de $500\n"
        + "Billetes de $200\n"
        + "Billetes de $100\n"
        + "Billetes de $50\n"
        + "Billetes de $20\n"
        + "Monedas de $10\n"
        + "Monedas de $5\n"
        + "Monedas de $2\n"
        + "Monedas de $1");
    }
   
    @FXML
    private void Limpiar(){
        txtCantidad.setText("");
    }
    
    @FXML 
    private void Desglosar(){
        int dinero = Integer.parseInt(txtCantidad.getText());
        int billetes500 = dinero/500;
        dinero = dinero%500;
        int billetes200 = dinero/200;
        dinero = dinero%200;
        int billetes100 = dinero/100;
        dinero = dinero%100;
        int billetes50 = dinero/50;
        dinero = dinero%50;
        int billetes20 = dinero/20;
        dinero = dinero%20;
        int monedas10 = dinero/10;
        dinero = dinero%10;
        int monedas5 = dinero/5;
        dinero = dinero%5;
        int monedas2 = dinero/2;
        dinero = dinero%2;
        int monedas1 = dinero;
        
        txtCantidadBilletes.setText(billetes500+"\n"+billetes200+"\n"+billetes100
                                        +"\n"+billetes50+"\n"+billetes20+"\n"+monedas10+"\n"
                                        +monedas5+"\n"+monedas2+"\n"+monedas1);
    }
}
