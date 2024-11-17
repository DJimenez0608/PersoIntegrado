package com.example.persointegradoimplementacion.Clases;

import java.util.ArrayList;
import java.util.List;

public class PersonIntegrado {
    public List<Usuario> usuarios = new ArrayList<>();



    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
