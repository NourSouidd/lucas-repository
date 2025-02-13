package com.example.demo7.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EmployeController {

    @FXML private TableView<?> tableMissions;
    @FXML private TableColumn<?, ?> colMissionId;
    @FXML private TableColumn<?, ?> colMissionNom;
    @FXML private TableColumn<?, ?> colMissionDesc;

    @FXML private Button btnRetourAccueil;

    @FXML
    private void initialize() {
        System.out.println("Interface Employé chargée !");
    }

    @FXML
    private void handleRetourAccueil() {
        System.out.println("Retour à l'accueil");
    }
}
