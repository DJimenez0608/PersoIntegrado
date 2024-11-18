package com.example.persointegradoimplementacion.Clases;

import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PersonIntegrado {
    private static PersonIntegrado instance; // Única instancia de la clase
    public List<Usuario> usuarios;

    private PersonIntegrado() {
        usuarios = new ArrayList<>();
    }

    // FUNCION PARA OBTENER LA INSTANCIA UNICA
    public static PersonIntegrado getInstance() {
        if (instance == null) {
            instance = new PersonIntegrado();
        }
        return instance;
    }

    // FUNCION PARA AGREGAR UN USUARIO
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
