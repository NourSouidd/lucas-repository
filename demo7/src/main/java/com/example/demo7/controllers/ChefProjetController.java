package com.example.demo7.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ChefProjetController {

    @FXML private TableView<?> tableMissions;
    @FXML private TableColumn<?, ?> colMissionId;
    @FXML private TableColumn<?, ?> colMissionNom;
    @FXML private TableColumn<?, ?> colMissionDesc;

    @FXML private ComboBox<?> comboMissions;
    @FXML private ComboBox<?> comboUsers;
    @FXML private Button btnAffecterMission;
    @FXML private Button btnRetirerMission;

    @FXML private Button btnRetourAccueil;

    @FXML
    private void initialize() {
        System.out.println("Interface Chef de Projet chargée !");
    }

    @FXML
    private void handleAffecterMission() {
        System.out.println("Employé affecté à la mission");
    }

    @FXML
    private void handleRetirerMission() {
        System.out.println("Employé retiré de la mission");
    }

    @FXML
    private void handleRetourAccueil() {
        System.out.println("Retour à l'accueil");
    }
}
