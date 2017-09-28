package com.example.gianfranco.mbrapp;

/**
 * Created by gian franco on 25/09/2017.
 */

public class Usuario {

    private String username;
    private String password;


    public Usuario(){}

    public Usuario(String usurname, String clave) {
        this.username = usurname;
        this.password = clave;
    }

    public String getUsurname() {
        return username;
    }

    public void setUsurname(String usurname) {
        this.username = usurname;
    }

    public String getClave() {
        return password;
    }

    public void setClave(String clave) {
        this.password = clave;
    }

    @Override
    public String toString() {
        return username +password;
    }
}