package com.example.demo7.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Contrôleur pour la gestion de l'interface Employé.
 * Permet aux employés de consulter leurs missions.
 */
public class EmployeController {

    /**
     * Table des missions attribuées à l'employé.
     */
    @FXML private TableView<?> tableMissions;

    /**
     * Colonnes de la table des missions.
     */
    @FXML private TableColumn<?, ?> colMissionId;
    @FXML private TableColumn<?, ?> colMissionNom;
    @FXML private TableColumn<?, ?> colMissionDesc;

    /**
     * Bouton permettant de retourner à l'accueil.
     */
    @FXML private Button btnRetourAccueil;

    /**
     * Initialise le contrôleur et affiche un message indiquant que l'interface Employé est chargée.
     */
    @FXML
    private void initialize() {
        System.out.println("Interface Employé chargée !");
    }

    /**
     * Gère l'événement de retour à l'accueil.
     */
    @FXML
    private void handleRetourAccueil() {
        System.out.println("Retour à l'accueil");
    }
}
