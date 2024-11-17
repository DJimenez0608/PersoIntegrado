package com.example.persointegradoimplementacion.Clases;

import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PersonIntegrado {
    public List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
