package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.Paradero;
import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Ruta;
import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ConsultarInfoRutaController {
    PersonIntegrado perso = PersonIntegrado.getInstance();
    @FXML
    private TextField nombreRutaField;
    @FXML
    private Button consultarButton;
    @FXML
    private Label nombreInfoRutaField;
    @FXML
    private Label numRutaField;
    @FXML
    private Label salidaField;
    @FXML
    private Label llegadaField;
    @FXML
    private Label ciclicaField;
    @FXML
    private Label cantidadField;
    @FXML
    private Label paraderosField;
    @FXML
    private Button volverButton;

    public void initialize() {
        // FUNCIONES QUE SE EJECUTAN CUANDO SE ACTIVA EL BOTON
        consultarButton.setOnAction(event -> {consultarInfoRuta();});
        volverButton.setOnAction(event -> {irAMenu();});
    }

    //IR A MENU
    public void irAMenu(){
        try {
            // Cargar el archivo FXML del menú
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/persointegradoimplementacion/Menu.fxml"));
            Scene menuScene = new Scene(loader.load());

            // Obtener el Stage actual del botón que disparó el evento
            Stage stage = (Stage) consultarButton.getScene().getWindow();

            // Establecer la nueva escena en el Stage
            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void consultarInfoRuta() {
        // Obtener el nombre de la ruta ingresado por el usuario
        String nombreRuta = nombreRutaField.getText();

        // Recorrer la lista de rutas para buscar la coincidencia
        for (Ruta r : perso.rutas) {
            if (r.nombre.equalsIgnoreCase(nombreRuta)) {
                // Si se encuentra la ruta, actualizar los labels con la información correspondiente
                nombreInfoRutaField.setText( r.getNombre());
                numRutaField.setText("Número: " + r.getNumRuta());
                salidaField.setText( r.getLugarSalida().getNombre() + " (" + r.getLugarSalida().getDireccion() + ")");
                llegadaField.setText(r.getLugarLlegada().getNombre() + " (" + r.getLugarLlegada().getDireccion() + ")");
                ciclicaField.setText((r.isCiclica() ? "Sí" : "No"));
                cantidadField.setText("Buses Asignados: " + r.getCantidadBusesAsignados());

                // Formatear la lista de paraderos como una cadena de texto
                StringBuilder paraderosTexto = new StringBuilder();
                for (Paradero p : r.paraderos) {
                    paraderosTexto.append("- ").append(p.getNombre()).append(" (").append(p.getDireccion()).append(")\n");
                }
                paraderosField.setText(paraderosTexto.toString());

                return;
            }
        }

        // En caso de no encontrar la ruta, limpiar los labels y mostrar un mensaje
        nombreInfoRutaField.setText("Ruta no encontrada");
        numRutaField.setText("");
        salidaField.setText("");
        llegadaField.setText("");
        ciclicaField.setText("");
        cantidadField.setText("");
        paraderosField.setText("");
    }



}
