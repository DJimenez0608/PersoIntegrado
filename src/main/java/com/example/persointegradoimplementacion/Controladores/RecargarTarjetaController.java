package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RecargarTarjetaController {
    @FXML
    private TextField IdtarjetaField;
    @FXML
    private TextField valorRecargaField;
    @FXML
    private Button recargarButton;
    @FXML
    public void initialize() {
        // FUNCIONES QUE SE EJECUTAN CUANDO SE ACTIVA EL BOTON
        recargarButton.setOnAction(event -> {RecargarTarjeta();irAMenu();});
    }

    //IR A MENU
    public void irAMenu(){
        try {
            // Cargar el archivo FXML del menú
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/persointegradoimplementacion/Menu.fxml"));
            Scene menuScene = new Scene(loader.load());

            // Obtener el Stage actual del botón que disparó el evento
            Stage stage = (Stage) recargarButton.getScene().getWindow();

            // Establecer la nueva escena en el Stage
            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //RECARGAR UNA TERJETA
    public void RecargarTarjeta() {
        //OBTENER VALORES DE LOS TEXT FIELDS
        String idTarjeta = IdtarjetaField.getText();
        double valorRecarga = Double.parseDouble(valorRecargaField.getText());


        PersonIntegrado perso = PersonIntegrado.getInstance();

        // BUSCAR EL USUARIO CON EL ID DE LA TARJETA
        for (Usuario u : perso.usuarios) {
            if (u.tipoTarjeta.idTarjeta.equals(idTarjeta)) {
                // ACTUALIZAR SALDO
                u.tipoTarjeta.setSaldo(u.tipoTarjeta.getSaldo() + valorRecarga);
                //MOSTRAR SALDO ACTUALIZADO
                System.out.println("Nuevo saldo: " + u.tipoTarjeta.getSaldo());
                return;
            }
        }

        // EN CASO DE  NO ENCONTRAR LA TARJETA
        System.out.println("No se encontró una tarjeta con el ID especificado.");
    }

}

