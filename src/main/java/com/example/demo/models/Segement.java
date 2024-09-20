package com.example.demo.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Segement {

    @JacksonXmlProperty(isAttribute = true, localName = "ID_SEGMENT")
    private Number idSegement;

    @JacksonXmlProperty(localName = "NOM_SEGMENT")
    private String nomSegment;

}
