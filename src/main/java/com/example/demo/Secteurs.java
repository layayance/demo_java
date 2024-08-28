package com.example.demo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Secteurs {
    @JacksonXmlProperty(localName = "SECTEURS_GEO")
    private String secteursGeo;

    @JacksonXmlProperty(localName = "TUNNEL")
    private String tunnel;


    // Getters et Setters
    public String getSecteursGeo() {
        return secteursGeo;
    }

    public void setSecteursGeo(String secteursGeo) {
        this.secteursGeo = secteursGeo;
    }

    public String getTunnel() {
        return tunnel;
    }

    public void setTunnel(String tunnel) {
        this.tunnel = tunnel;
    }
}
