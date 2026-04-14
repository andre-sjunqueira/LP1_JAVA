package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaInicialController {

    @FXML
    private Button btnFarmacia;

    @FXML
    private Button btnFeira;

    @FXML
    private Button btnSalao;

    @FXML
    private void goToFarmacia() throws IOException {
        App.setRootWithTheme("primary", "FARMACIA");
    }

    @FXML
    private void goToFeira() throws IOException {
        App.setRootWithTheme("primary", "FEIRA");
    }

    @FXML
    private void goToSalao() throws IOException {
        App.setRootWithTheme("primary", "SALAO");
    }
}
