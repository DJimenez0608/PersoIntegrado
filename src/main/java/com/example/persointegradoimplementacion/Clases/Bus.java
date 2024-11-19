package com.example.persointegradoimplementacion.Clases;

public class Bus {
    public int id;
    public String placa;
    public String propietario;
    public String modelo;
    public Conductor conductor;

    public Bus(int id, String placa, String propietario, String modelo, Conductor conductor) {
        this.id = id;
        this.placa = placa;
        this.propietario = propietario;
        this.modelo = modelo;
        this.conductor = conductor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
