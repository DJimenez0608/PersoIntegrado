package com.example.persointegradoimplementacion.Clases;

import java.util.List;

public class Ruta {

    public String nombre;
    public int numRuta;
    public Paradero lugarSalida;
    public Paradero lugarLlegada;
    public boolean ciclica;
    public int cantidadBusesAsignados;
    public List<Paradero> paraderos;

    public Ruta(String nombre, int numRuta, Paradero lugarSalida, Paradero lugarLlegada, boolean ciclica, int cantidadBusesAsignados, List<Paradero> paraderos) {
        this.nombre = nombre;
        this.numRuta = numRuta;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.ciclica = ciclica;
        this.cantidadBusesAsignados = cantidadBusesAsignados;
        this.paraderos = paraderos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumRuta() {
        return numRuta;
    }

    public void setNumRuta(int numRuta) {
        this.numRuta = numRuta;
    }

    public Paradero getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(Paradero lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public Paradero getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(Paradero lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public boolean isCiclica() {
        return ciclica;
    }

    public void setCiclica(boolean ciclica) {
        this.ciclica = ciclica;
    }

    public int getCantidadBusesAsignados() {
        return cantidadBusesAsignados;
    }

    public void setCantidadBusesAsignados(int cantidadBusesAsignados) {
        this.cantidadBusesAsignados = cantidadBusesAsignados;
    }

    public List<Paradero> getParaderos() {
        return paraderos;
    }

    public void setParaderos(List<Paradero> paraderos) {
        this.paraderos = paraderos;
    }
}
