package com.example.demo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Axe {

    @JacksonXmlProperty(isAttribute = true, localName = "ID_AXE")
    private String idAxe;

    @JacksonXmlProperty(localName = "NOM_AXE")
    private String nomAxe;

    @JacksonXmlProperty(localName = "SECTEURS")
    private Secteurs secteurs;

    public Axe() {
    }

//    public Axe(String port) {
//        this.nomAxe = port;
//    }
//
//    public Axe(String idAxe, String nomAxe, Secteurs secteurs) {
//        this.idAxe = idAxe;
//        this.nomAxe = nomAxe;
//        this.secteurs = secteurs;
//    }

    // Getters et Setters
    public String getIdAxe() {
        return idAxe;
    }

    public void setIdAxe(String idAxe) {
        this.idAxe = idAxe;
    }

    public String getNomAxe() {
        return nomAxe;
    }

    public void setNomAxe(String nomAxe) {
        this.nomAxe = nomAxe;
    }

    public Secteurs getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(Secteurs secteurs) {
        this.secteurs = secteurs;
    }
}
