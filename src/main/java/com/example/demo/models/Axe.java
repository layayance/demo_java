package com.example.demo.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Axe {

    @JacksonXmlProperty(isAttribute = true, localName = "ID_AXE")
    private String idAxe;

    @JacksonXmlProperty(localName = "NOM_AXE")
    private String nomAxe;

    @JacksonXmlProperty(localName = "NOM_USAGE")
    private String nomUsage;

    @JacksonXmlProperty(localName = "SECTEURS")
    private Secteurs secteurs;

    @JacksonXmlProperty(localName = "TYPE_ALERTC")
    private TypeAlertc typeAlertc;
//    @JacksonXmlProperty(localName = "LIB_TYPE_AXE")
//    private LibTypeAxe libTypeAxe;

    public Axe() {
    }

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

    public String getNomUsage() {
        return this.nomUsage;
    }


    public void setNomUsage(String nomUsage) {
        this.nomUsage = nomUsage;
    }

    public Secteurs getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(Secteurs secteurs) {

        this.secteurs = secteurs;
    }

    public TypeAlertc getTypeAlertc(){
        return typeAlertc;
    }

    public void setTypeAlertc(TypeAlertc typeAlertc){
        this.typeAlertc = typeAlertc;
    }
}
