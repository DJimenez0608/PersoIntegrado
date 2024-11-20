package com.example.persointegradoimplementacion.Clases;

public class Paradero {
    public String direccion;
    public String nombre;
    public int idParadero;

    public Paradero(String direccion, String nombre, int idParadero) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.idParadero = idParadero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdParadero() {
        return idParadero;
    }
}
