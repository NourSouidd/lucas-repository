package com.example.demo7.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.Objects;

/**
 * Contrôleur pour la vue d'accueil.
 * Cette classe gère les interactions utilisateur avec la vue d'accueil,
 * notamment la navigation vers la page de connexion.
 */
public class AccueilController {

    /**
     * Bouton pour accéder à la page de connexion.
     */
    @FXML
    private Button btnConnexion;

    /**
     * Méthode appelée lorsque l'utilisateur clique sur le bouton "Connexion".
     * Cette méthode charge la vue de connexion et l'affiche dans la même fenêtre.
     * En cas d'erreur lors du chargement de la vue, un message d'erreur est affiché dans la console.
     */
    @FXML
    private void onConnexionClick() {
        try {
            // Charge la vue de connexion à partir du fichier FXML
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/com/example/demo7/connexion-view.fxml")));
            Parent root = loader.load();

            // Obtient la fenêtre actuelle et change la scène pour afficher la vue de connexion
            Stage stage = (Stage) btnConnexion.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Connexion");
        } catch (IOException e) {
            // Affiche un message d'erreur en cas d'échec du chargement de la vue
            System.err.println("Erreur lors de l'ouverture de la page de connexion : " + e.getMessage());
        }
    }
}