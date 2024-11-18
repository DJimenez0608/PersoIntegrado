package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Tarjetas.Tarjeta;
import com.example.persointegradoimplementacion.Clases.Tarjetas.TarjetaDiscapacitado;
import com.example.persointegradoimplementacion.Clases.Tarjetas.TarjetaEstudiante;
import com.example.persointegradoimplementacion.Clases.Tarjetas.TarjetaTerceraEdad;
import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class RegistroUsuario {
    // USO DE SINGLETON
    private PersonIntegrado p = PersonIntegrado.getInstance();

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
        //ACCIONES CUANDO EL BOTON REGISTRAR ES PRESIONADO
        registrarButtom.setOnAction(event -> {
            registrarUsuario();
            irAMenu();
        });
    }

    // FUNCION PARA REGISTRAR UN NUEVO USUARIO
    private void registrarUsuario() {
        String nombre = nombreField.getText();
        Integer numero = Integer.parseInt(documentoField.getText());
        String direccion = direccionField.getText();
        String fechaComoTexto = nacimientoField.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String tipoUsuario = tipoUsuarioField.getText();
        //ASIGNACION DEL TIPO DE TARJETA
        Tarjeta tipoTarjeta = null;
        switch (tipoUsuario) {
            case "Tercera edad":
                tipoTarjeta = new TarjetaTerceraEdad(0, nombre + documentoField.getText());
                break;
            case "Discapacitado":
                tipoTarjeta = new TarjetaDiscapacitado(0, nombre + documentoField.getText());
                break;
            case "Estudiante":
                tipoTarjeta = new TarjetaEstudiante(0, nombre + documentoField.getText());
                break;
            case "Comun":
                tipoTarjeta = new TarjetaTerceraEdad(0, nombre + documentoField.getText());
                break;
        }
        // AGREGAR UN NUEVO USUARIO A LA LISTA DEL SINGLETON/VERIFICAR QUE LOS CAMPOS ESTEN COMPLETOS

            Usuario u = new Usuario(nombre, numero, direccion, fechaComoTexto, tipoTarjeta);
            p.agregarUsuario(u);
            // IMPRIMIR LA LISTA DE USUARIOS QUE HAY
            System.out.println("Usuarios registrados:");
            for (Usuario usuario : p.usuarios) {
                System.out.println(usuario);
            }




    }

    // FUNCION PARA IR A MENU
    public void irAMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/persointegradoimplementacion/Menu.fxml"));
            Scene menuScene = new Scene(loader.load());
            Stage stage = (Stage) registrarButtom.getScene().getWindow();
            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
