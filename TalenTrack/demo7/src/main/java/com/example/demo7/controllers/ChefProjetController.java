package com.example.demo7.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Contrôleur pour la gestion des missions par le Chef de Projet.
 * Permet d'affecter et de retirer des employés des missions.
 */
public class ChefProjetController {

    /**
     * Table des missions affichées dans l'interface.
     */
    @FXML private TableView<?> tableMissions;

    /**
     * Colonnes de la table des missions.
     */
    @FXML private TableColumn<?, ?> colMissionId;
    @FXML private TableColumn<?, ?> colMissionNom;
    @FXML private TableColumn<?, ?> colMissionDesc;

    /**
     * Listes déroulantes pour la sélection des missions et des utilisateurs.
     */
    @FXML private ComboBox<?> comboMissions;
    @FXML private ComboBox<?> comboUsers;

    /**
     * Boutons pour affecter et retirer un employé d'une mission.
     */
    @FXML private Button btnAffecterMission;
    @FXML private Button btnRetirerMission;

    /**
     * Bouton pour retourner à la page d'accueil.
     */
    @FXML private Button btnRetourAccueil;

    /**
     * Initialise le contrôleur.
     * Affiche un message indiquant que l'interface est chargée.
     */
    @FXML
    private void initialize() {
        System.out.println("Interface Chef de Projet chargée !");
    }

    /**
     * Affecte un employé sélectionné à une mission.
     *
     * @throws NullPointerException si aucune mission ou employé n'est sélectionné
     */
    @FXML
    private void handleAffecterMission() {
        System.out.println("Employé affecté à la mission");
    }

    /**
     * Retire un employé d'une mission.
     *
     * @throws NullPointerException si aucune mission ou employé n'est sélectionné
     */
    @FXML
    private void handleRetirerMission() {
        System.out.println("Employé retiré de la mission");
    }

    /**
     * Retourne à l'écran d'accueil.
     */
    @FXML
    private void handleRetourAccueil() {
        System.out.println("Retour à l'accueil");
    }
}