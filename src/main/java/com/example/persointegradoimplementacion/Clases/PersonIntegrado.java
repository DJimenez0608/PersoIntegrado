package com.example.persointegradoimplementacion.Clases;

import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonIntegrado {
    private static PersonIntegrado instance; // Única instancia de la clase
    public List<Usuario> usuarios;
    public List<Ruta> rutas ;
    public List<EmpresasProveedoras> empresasProveedoras;
    public List<Comentario> comentarios;


    private PersonIntegrado() {
        comentarios = new ArrayList<>();
        usuarios = new ArrayList<>();
        rutas = new ArrayList<>(Arrays.asList(
                new Ruta(
                        "Ruta 1",
                        101,
                        new Paradero("Calle 1", "Paradero A", 1),
                        new Paradero("Calle 2", "Paradero F", 10),
                        false,
                        5,
                        new ArrayList<>(Arrays.asList(  // Cambiar a ArrayList
                                new Paradero("Calle 1", "Paradero A", 1),
                                new Paradero("Calle 3", "Paradero B", 2),
                                new Paradero("Calle 4", "Paradero C", 3),
                                new Paradero("Calle 5", "Paradero D", 4),
                                new Paradero("Calle 6", "Paradero E", 5),
                                new Paradero("Calle 2", "Paradero F", 10)
                        ))
                ),
                new Ruta(
                        "Ruta 2",
                        102,
                        new Paradero("Calle 2", "Paradero B", 2),
                        new Paradero("Calle 2", "Paradero B", 2),
                        true,
                        3,
                        new ArrayList<>(Arrays.asList(  // Cambiar a ArrayList
                                new Paradero("Calle 2", "Paradero B", 2),
                                new Paradero("Calle 3", "Paradero A", 1),
                                new Paradero("Calle 4", "Paradero C", 3),
                                new Paradero("Calle 5", "Paradero D", 4),
                                new Paradero("Calle 4", "Paradero E", 5),
                                new Paradero("Calle 3", "Paradero F", 6),
                                new Paradero("Calle 2", "Paradero B", 2)
                        ))
                )
        ));

        this.empresasProveedoras = new ArrayList<>(Arrays.asList(
                new EmpresasProveedoras(
                        "Transporte rapido y confiable",
                        45657,
                        new ArrayList<>(Arrays.asList(
                                new Bus(
                                        1,
                                        "SAM324",
                                        "Transporte rapido y confiable",
                                        "2002",
                                        new Conductor("Carlos Alcaraz", 123456, 13)

                                ),
                                new Bus(
                                        2,
                                        "QQU324",
                                        "Transporte rapido y confiable",
                                        "2020",
                                        null

                                ),
                                new Bus(
                                        3,
                                        "TTT324",
                                        "Transporte rapido y confiable",
                                        "2015",
                                        null

                                )


                        ))
                ), new EmpresasProveedoras(
                        "Buses seguros",
                        123456,
                        new ArrayList<>(Arrays.asList(
                                new Bus(
                                        1,
                                        "KPM324",
                                        "Buses seguros",
                                        "2002",
                                        new Conductor("Carlos Andrade", 123456, 20)

                                ),
                                new Bus(
                                        2,
                                        "QER324",
                                        "Buses seguros",
                                        "2020",
                                        null

                                ),
                                new Bus(
                                        2,
                                        "DFG324",
                                        "Buses seguros",
                                        "2015",
                                        new Conductor("Andres Rodriguez", 12459, 15)

                                )


                        ))
                )

        ));
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
    //FUNCION PARA AGREGAR UNA RUTA A LA LISTA DE RUTAS
    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }
    // Crear rutas con valores iniciales


}
