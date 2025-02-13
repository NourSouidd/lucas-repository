package com.example.demo7.models;

import javafx.beans.property.*;

/**
 * Modèle représentant un membre du personnel.
 * Contient les informations telles que l'identifiant, le nom, le prénom, l'email et le rôle.
 */
public class Personnel {

    /**
     * Identifiant unique du personnel.
     */
    private final SimpleIntegerProperty id;

    /**
     * Nom du personnel.
     */
    private final SimpleStringProperty nom;

    /**
     * Prénom du personnel.
     */
    private final SimpleStringProperty prenom;

    /**
     * Adresse email du personnel.
     */
    private final SimpleStringProperty email;

    /**
     * Rôle du personnel.
     */
    private final SimpleStringProperty role;

    /**
     * Constructeur de la classe Personnel.
     *
     * @param id Identifiant unique du personnel.
     * @param nom Nom du personnel.
     * @param prenom Prénom du personnel.
     * @param email Adresse email du personnel.
     * @param role Rôle du personnel.
     */
    public Personnel(int id, String nom, String prenom, String email, String role) {
        this.id = new SimpleIntegerProperty(id);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.email = new SimpleStringProperty(email);
        this.role = new SimpleStringProperty(role);
    }

    /**
     * @return L'identifiant unique du personnel.
     */
    public int getId() { return id.get(); }

    /**
     * @return Le nom du personnel.
     */
    public String getNom() { return nom.get(); }

    /**
     * @return Le prénom du personnel.
     */
    public String getPrenom() { return prenom.get(); }

    /**
     * @return L'adresse email du personnel.
     */
    public String getEmail() { return email.get(); }

    /**
     * @return Le rôle du personnel.
     */
    public String getRole() { return role.get(); }

    /**
     * @return La propriété ID pour liaison avec l'interface utilisateur.
     */
    public IntegerProperty idProperty() { return id; }

    /**
     * @return La propriété nom pour liaison avec l'interface utilisateur.
     */
    public StringProperty nomProperty() { return nom; }

    /**
     * @return La propriété prénom pour liaison avec l'interface utilisateur.
     */
    public StringProperty prenomProperty() { return prenom; }

    /**
     * @return La propriété email pour liaison avec l'interface utilisateur.
     */
    public StringProperty emailProperty() { return email; }

    /**
     * @return La propriété rôle pour liaison avec l'interface utilisateur.
     */
    public StringProperty roleProperty() { return role; }

    /**
     * Définit un nouveau rôle pour le personnel.
     *
     * @param newRole Le nouveau rôle à attribuer.
     */
    public void setRole(String newRole) { this.role.set(newRole); }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du personnel.
     *
     * @return Nom et prénom du personnel.
     */
    @Override
    public String toString() {
        return nom.get() + " " + prenom.get();
    }
}
