/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author hp
 */
public class restaurant {
 
 private int id;
 private String nom;
 private String adresse;
 private String email;
 private String description;
 private String tel;
 private String site;
 private String heure_ouverture;
 private String heure_fermeture;
 private restaurant restaurant;
 private int  id_restaurateur;

    public restaurant(int id, String nom, String adresse, String email, String description, String tel, String site, String heure_ouverture, String heure_fermeture, restaurant restaurant) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.description = description;
        this.tel = tel;
        this.site = site;
        this.heure_ouverture = heure_ouverture;
        this.heure_fermeture = heure_fermeture;
        this.restaurant = restaurant;
    }



    public restaurant() {
        }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getTel() {
        return tel;
    }

    public String getSite() {
        return site;
    }

    public String getHeure_ouverture() {
        return heure_ouverture;
    }

    public String getHeure_fermeture() {
        return heure_fermeture;
    }

    public restaurant getRestaurant() {
        return restaurant;
    }

    public int getId_restaurateur() {
        return id_restaurateur;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeure_ouverture(String heure_ouverture) {
        this.heure_ouverture = heure_ouverture;
    }

    public void setHeure_fermeture(String heure_fermeture) {
        this.heure_fermeture = heure_fermeture;
    }

    public void setRestaurant(restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setId_restaurateur(int id_restaurateur) {
        this.id_restaurateur = id_restaurateur;
    }

    public String getString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}