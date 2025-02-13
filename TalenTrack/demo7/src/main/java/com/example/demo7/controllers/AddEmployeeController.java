package com.example.demo7.controllers;

import com.example.demo7.database.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Contrôleur pour la vue d'ajout d'un employé.
 * Cette classe gère les interactions utilisateur avec la vue d'ajout d'un employé,
 * y compris la saisie des informations de l'employé et les actions sur les boutons.
 */
public class AddEmployeeController {

    /**
     * Champ de texte pour saisir le nom de l'employé.
     */
    @FXML
    private TextField txtEmployeeNom;

    /**
     * Champ de texte pour saisir le prénom de l'employé.
     */
    @FXML
    private TextField txtEmployeePrenom;

    /**
     * Champ de texte pour saisir l'email de l'employé.
     */
    @FXML
    private TextField txtEmployeeEmail;

    /**
     * Champ de mot de passe pour saisir le mot de passe de l'employé.
     */
    @FXML
    private PasswordField txtEmployeeMotDePasse;

    /**
     * Bouton pour ajouter un employé.
     */
    @FXML
    private Button btnAddEmployee;

    /**
     * Bouton pour annuler l'ajout d'un employé.
     */
    @FXML
    private Button btnCancel;

    /**
     * Méthode appelée lorsque l'utilisateur clique sur le bouton "Ajouter un employé".
     * Cette méthode récupère les informations saisies, vérifie qu'elles sont valides,
     * puis ajoute l'employé à la base de données via la classe DatabaseConnection.
     * Si tous les champs ne sont pas remplis, un message est affiché dans la console.
     */
    @FXML
    private void handleAddEmployee() {
        String nom = txtEmployeeNom.getText();
        String prenom = txtEmployeePrenom.getText();
        String email = txtEmployeeEmail.getText();
        String motDePasse = txtEmployeeMotDePasse.getText();

        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || motDePasse.isEmpty()) {
            System.out.println("All fields must be filled!");
            return;
        }

        DatabaseConnection.addEmployee(nom, prenom, email, motDePasse);
        closeModal();
    }

    /**
     * Méthode appelée lorsque l'utilisateur clique sur le bouton "Annuler".
     * Cette méthode ferme la fenêtre modale sans ajouter d'employé.
     */
    @FXML
    private void handleCancel() {
        closeModal();
    }

    /**
     * Méthode privée pour fermer la fenêtre modale d'ajout d'un employé.
     * Cette méthode est utilisée pour fermer la vue d'ajout d'un employé après une action.
     */
    private void closeModal() {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
}