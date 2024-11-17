package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.format.DateTimeFormatter;

public class RegistroUsuario {

    @FXML
    private TextField nombreField;
    @FXML
    private TextField documentoField;
    @FXML
    private TextField direccionField;
    @FXML
    private DatePicker nacimientoField;
    @FXML
    private Button registrarButtom;

    @FXML
    public void initialize() {
        // Acción cuando el botón "Registrar" es presionado
        registrarButtom.setOnAction(event -> registrarUsuario());
    }

    private void registrarUsuario() {
        // GUARDAR LOS DATOS DEL USUARIO EN VARIABLES
        String nombre = nombreField.getText();
        int numero = Integer.parseInt(documentoField.getText());
        String direccion = direccionField.getText();
        String fechaComoTexto = nacimientoField.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // CREAR EL USUARIO
        Usuario u = new Usuario(nombre, numero, direccion, fechaComoTexto);

        // AGREGAR AL USUARIO A LA LISTA DE USUARIOS
        PersonIntegrado p = new PersonIntegrado();
        p.agregarUsuario(u);

        // IMPRIMIR LISTA DE USUARIOS
        System.out.println("Usuario agregado");
        System.out.println(p.usuarios);
    }
}
