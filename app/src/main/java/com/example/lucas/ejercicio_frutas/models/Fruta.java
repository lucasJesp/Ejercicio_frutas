package com.example.lucas.ejercicio_frutas.models;

/**
 * Created by Lucas on 07-feb-19.
 */

public class Fruta {
    private String nombre;
    private String origen;
    private String icono;
    private String Hola;
    private String Lucas;
    private String cambio;

    public Fruta(String nombre, String origen, String icono) {
        this.nombre = nombre;
        this.origen = origen;
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
}
