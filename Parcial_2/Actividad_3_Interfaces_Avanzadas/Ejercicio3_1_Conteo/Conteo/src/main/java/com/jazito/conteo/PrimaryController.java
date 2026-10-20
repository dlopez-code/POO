package com.jazito.conteo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtContador;

    @FXML
    private Button btnEsperar;

    @FXML
    private ProgressBar barraProgreso;

    private int contador = 0;

    //contar los clics
    @FXML
    private void contar() {
        contador++;
        txtContador.setText("" + contador);
    }

    //iniciar espera de 10 segundos
    @FXML
    private void esperar() {

        btnEsperar.setDisable(true); //deshabilitar boton
        barraProgreso.setProgress(0); //vaciar barra

        Thread hilo = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 1; i <= 10; i++) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }

                    final double progreso = i / 10.0;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            barraProgreso.setProgress(progreso);
                        }
                    });
                }

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        btnEsperar.setDisable(false);
                    }
                });
            }
        });

        hilo.start();
    }

}
