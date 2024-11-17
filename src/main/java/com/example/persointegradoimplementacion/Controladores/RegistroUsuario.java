package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Tarjetas.Tarjeta;
import com.example.persointegradoimplementacion.Clases.Tarjetas.TarjetaDiscapacitado;
import com.example.persointegradoimplementacion.Clases.Tarjetas.TarjetaEstudiante;
import com.example.persointegradoimplementacion.Clases.Tarjetas.TarjetaTerceraEdad;
import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

import java.time.format.DateTimeFormatter;

public class RegistroUsuario {
    private PersonIntegrado p = new PersonIntegrado();
    @FXML
    private TextField tipoUsuarioField;
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
        String tipoUsuario = tipoUsuarioField.getText();

        //ASIGNAR TIPO DE TARJETA
         Tarjeta tipoTarjeta = null;
        switch (tipoUsuario){
            case "Tercera edad": {
                tipoTarjeta = new TarjetaTerceraEdad(0, nombre + documentoField.getText());
                break;
            }
            case "Discapacitado": {
                tipoTarjeta = new TarjetaDiscapacitado(0, nombre + documentoField.getText());
                break;
            }
            case "Estudiante": {
                tipoTarjeta = new TarjetaEstudiante(0, nombre + documentoField.getText());
                break;
            }
            case "Comun": {
                tipoTarjeta = new TarjetaTerceraEdad(0, nombre + documentoField.getText());
                break;
            }

        }

        // CREAR EL USUARIO
        Usuario u = new Usuario(nombre, numero, direccion, fechaComoTexto, tipoTarjeta);

        // AGREGAR EL USUARIO A LA LISTA EN PersonIntegrado

        p.agregarUsuario(u);

        // IMPRIMIR LA LISTA DE USUARIOS
        System.out.println("Usuarios registrados:");
        for (Usuario usuario : p.usuarios) {
            System.out.println(usuario);
        }
    }

}
