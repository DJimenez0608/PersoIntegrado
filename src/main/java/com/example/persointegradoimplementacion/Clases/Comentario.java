package com.example.persointegradoimplementacion.Clases;

import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;
import java.util.Date;

public class Comentario {
    private String texto;
    private float calificacion;
    private String fecha;
    private String nombreUsuario;
    private String nombreRuta; // Ruta asociada al comentario

    // Constructor
    public Comentario(String texto, float calificacion, String fecha, String nombreUsuario, String nombreRuta) {
        this.texto = texto;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.nombreUsuario = nombreUsuario;
        this.nombreRuta = nombreRuta;
    }

    // Getters y Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getnombreRuta() {
        return nombreRuta;
    }

    public void setnombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

// Método toString para mostrar la información del comentario
@Override
public String toString() {
    return "[" + fecha + "] " + nombreUsuario + " sobre la ruta " + nombreRuta + ":\n" +
            "Texto: " + texto + "\n" +
            "Calificación: " + calificacion;
    }
}

