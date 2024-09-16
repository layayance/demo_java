package com.example.demo.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TypeAlertc {
    @JacksonXmlProperty(localName = "CODE_TYPE_AXE")
    private String codeTypeAxe;

    @JacksonXmlProperty(localName = "LIB_TYPE_AXE")
    private String libTypeAxe;

    public String getCodeTypeAxe(){
        return codeTypeAxe;
    }

    public void setCodeTypeAxe(String codeTypeAxe){
        this.codeTypeAxe = codeTypeAxe;
    }

    public String getLibTypeAxe(){
        return libTypeAxe;
    }

    public void setLibTypeAxe(String libTypeAxe){
        this.libTypeAxe = libTypeAxe;
    }

    public String toString(){
//        return "TypeAlertc {" +
//                "codeTypeAxe='" + codeTypeAxe + "'," +
//                 "libTypeAxe='" + libTypeAxe + "'" +
//                '}';

//        return "TypeAlertc {" +
//                "codeTypeAxe='" + codeTypeAxe + "'," +
//                "libTypeAxe='" + libTypeAxe + "'" +
//                '}';
        return codeTypeAxe;
    }

}
