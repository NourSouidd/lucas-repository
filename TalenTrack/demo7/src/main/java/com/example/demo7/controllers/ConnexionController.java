package com.example.demo7.controllers;

import com.example.demo7.database.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

/**
 * Contrôleur de la page de connexion.
 * Permet aux utilisateurs de se connecter selon leur rôle.
 */
public class ConnexionController {

    /**
     * Champ de saisie pour l'email de l'utilisateur.
     */
    @FXML private TextField emailField;

    /**
     * Champ de saisie pour le mot de passe de l'utilisateur.
     */
    @FXML private PasswordField passwordField;

    /**
     * Bouton de connexion.
     */
    @FXML private Button btnConnexion;

    /**
     * Gère l'événement de clic sur le bouton de connexion.
     * Vérifie les informations d'identification et ouvre l'interface correspondante.
     */
    @FXML
    private void onConnexionClick() {
        String email = emailField.getText();
        String motDePasse = passwordField.getText();

        if (email.isEmpty() || motDePasse.isEmpty()) {
            afficherAlerte("Erreur", "Veuillez remplir tous les champs !");
            return;
        }

        String role = DatabaseConnection.verifierUtilisateurAvecRole(email, motDePasse);

        if (role == null) {
            afficherAlerte("Erreur", "Email ou mot de passe incorrect !");
        } else {
            afficherAlerte("Succès", "Connexion réussie !");
            ouvrirInterface(role);
        }
    }

    /**
     * Affiche une alerte à l'utilisateur.
     *
     * @param titre   Le titre de l'alerte.
     * @param message Le message à afficher.
     */
    private void afficherAlerte(String titre, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titre);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Ouvre l'interface correspondant au rôle de l'utilisateur.
     *
     * @param role Le rôle de l'utilisateur connecté.
     */
    private void ouvrirInterface(String role) {
        String fxmlFile = null;

        switch (role) {
            case "Admin":
                fxmlFile = "/com/example/demo7/admin-view.fxml";
                break;
            case "Chef de projet":
                fxmlFile = "/com/example/demo7/chef_projet-view.fxml";
                break;
            case "Personnel":
                fxmlFile = "/com/example/demo7/employe-view.fxml";
                break;
            default:
                System.err.println("❌ Rôle inconnu : " + role);
                return;
        }

        try {
            URL fxmlLocation = getClass().getResource(fxmlFile);

            if (fxmlLocation == null) {
                throw new IOException("❌ Fichier FXML introuvable : " + fxmlFile);
            }

            System.out.println("✅ Chargement du fichier FXML : " + fxmlFile);

            FXMLLoader loader = new FXMLLoader(fxmlLocation);
            Parent root = loader.load();

            Stage stage = (Stage) emailField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Interface - " + role);
            stage.show();

        } catch (IOException e) {
            System.err.println("Erreur lors du chargement de l'interface " + role + " : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
