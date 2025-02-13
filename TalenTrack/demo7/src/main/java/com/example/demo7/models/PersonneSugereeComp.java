package com.example.demo7.models;

/**
 * Modèle représentant une personne suggérée avec une compétence spécifique.
 */
public class PersonneSugereeComp {

    /**
     * L'objet Personnel associé à la suggestion.
     */
    private Personnel personnel;

    /**
     * Nom de la compétence associée à la personne suggérée.
     */
    private String nomComp;

    /**
     * Constructeur de la classe PersonneSugereeComp.
     *
     * @param personnel L'objet Personnel associé à la suggestion.
     * @param nomComp Le nom de la compétence associée.
     */
    public PersonneSugereeComp(Personnel personnel, String nomComp) {
        this.personnel = personnel;
        this.nomComp = nomComp;
    }

    /**
     * Retourne l'objet Personnel associé à la suggestion.
     *
     * @return L'objet Personnel.
     */
    public Personnel getPersonnel() {
        return personnel;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet PersonneSugereeComp.
     *
     * @return Une chaîne représentant la personne et sa compétence.
     */
    @Override
    public String toString() {
        return personnel + " " + nomComp;
    }
}
