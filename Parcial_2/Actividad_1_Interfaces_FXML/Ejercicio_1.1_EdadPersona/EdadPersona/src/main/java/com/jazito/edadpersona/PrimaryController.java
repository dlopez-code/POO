package com.jazito.edadpersona;

import java.time.LocalDate; //para conocer la fecha actual
import javafx.fxml.FXML;
import javafx.scene.control.Label; //se necesitan importar las clases de los elementos
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label lblResultado; //debe coincidir con el id
    @FXML
    private TextField txtFechaNacimiento; //cada uno debe tener su fxml

    @FXML
    private void calcular() {
        String fecha = txtFechaNacimiento.getText();
        String[] partes = fecha.split("/"); //separar la fecha
  
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        LocalDate hoy = LocalDate.now(); //crear un objeto de la clase localDate
    
        int mesActual = hoy.getMonthValue();
        int anioActual = hoy.getYear();
        
        int añosCalculo = anioActual - anio;
        int mesesCalculo = mesActual - mes;
        lblResultado.setText("Tiene " + añosCalculo + " años con "+mesesCalculo+" meses");
    }

    @FXML
    private void limpiar() {
        txtFechaNacimiento.setText("");
        lblResultado.setText("Ingrese su fecha de nacimiento dd/mm/aaaa");
    }
}
