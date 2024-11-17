package com.example.persointegradoimplementacion.Clases.Usuarios;

import com.example.persointegradoimplementacion.Clases.Tarjetas.Tarjeta;

public class Usuario {
    public String nombre;
    public int numDocumento;
    public String direccion;
    public String fechaNacimiento;
    public Tarjeta tipoTarjeta;


    public Usuario(String nombre, int numDocumento, String direccion, String fechaNacimiento, Tarjeta tipoTarjeta) {
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoTarjeta = tipoTarjeta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Documento: " + numDocumento + ", Dirección: " + direccion + ", Fecha de Nacimiento: " + fechaNacimiento + ", Tarjeta asignnada: " + tipoTarjeta.toString();
    }
}
