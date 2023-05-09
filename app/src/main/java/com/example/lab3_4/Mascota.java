package com.example.lab3_4;

public class Mascota {

    private String nombre;
    private String genero;
    private String nombreDueno;
    private String dni;
    private String descripcion;

    public Mascota(String nombre, String genero, String nombreDueno, String dni, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.nombreDueno = nombreDueno;
        this.dni = dni;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public String getDni() {
        return dni;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
