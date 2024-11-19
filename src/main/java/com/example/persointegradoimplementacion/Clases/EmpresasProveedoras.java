package com.example.persointegradoimplementacion.Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpresasProveedoras {
    public String nombre;
    public int NIT;
    public List<Bus> buses;

    public EmpresasProveedoras(String nombre, int NIT, List<Bus> buses) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.buses =  buses;
    }


}
