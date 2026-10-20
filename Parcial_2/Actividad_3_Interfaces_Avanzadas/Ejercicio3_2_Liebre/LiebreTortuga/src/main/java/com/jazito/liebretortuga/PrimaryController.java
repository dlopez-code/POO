package com.jazito.liebretortuga;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML
    private ProgressBar barraLiebre;

    @FXML
    private ProgressBar barraTortuga;

    @FXML
    private Label lblLiebre;

    @FXML
    private Label lblTortuga;

    @FXML
    private Button btnIniciar;

    private boolean hayGanador = false;
    private int terminados = 0;

    @FXML
    private void iniciarCarrera() {

        barraLiebre.setProgress(0);
        barraTortuga.setProgress(0);

        lblLiebre.setText("La Liebre: ¡Está corriendo!");
        lblTortuga.setText("La Tortuga: ¡Está corriendo!");

        btnIniciar.setDisable(true);
        hayGanador = false;
        terminados = 0;

        // HILO DE LA TORTUGA
        Thread tortuga = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 1; i <= 10; i++) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }

                    final double progreso = i / 10.0;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                            barraTortuga.setProgress(progreso);

                            if (progreso == 1.0) {
                                terminarCarrera("Tortuga");
                            }
                        }
                    });
                }
            }
        });

        // HILO DE LA LIEBRE
        Thread liebre = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 1; i <= 10; i++) {

                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        return;
                    }

                    final double progreso = i / 10.0;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                            barraLiebre.setProgress(progreso);

                            if (progreso == 1.0) {
                                terminarCarrera("Liebre");
                            }
                        }
                    });

                    if (i == 5) {

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblLiebre.setText(
                                        "La Liebre: ¡Se durmió!"
                                );
                            }
                        });

                        try {
                            Thread.sleep(7000);
                        } catch (InterruptedException e) {
                            return;
                        }

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblLiebre.setText(
                                        "La Liebre: ¡Despertó!"
                                );
                            }
                        });
                    }
                }
            }
        });
        tortuga.start();
        liebre.start();
    }

    private void terminarCarrera(String ganador) {

        if (!hayGanador) {
            hayGanador = true;

            if (ganador.equals("Tortuga")) {
                lblTortuga.setText("La Tortuga: ¡Ganó!");
            } else {
                lblLiebre.setText("La Liebre: ¡Ganó!");
            }
        }

        terminados++;

        if (terminados == 2) {
            btnIniciar.setDisable(false);
        }
    }
}
