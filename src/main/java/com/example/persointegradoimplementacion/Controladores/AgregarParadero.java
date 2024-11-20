package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.Paradero;
import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Ruta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AgregarParadero {

    @FXML
    private TextField direccionField;

    @FXML
    private TextField nomParaderoField;

    @FXML
    private TextField nombreRutaField;

    @FXML
    private Button agregarParaderoButton;

    PersonIntegrado perso = PersonIntegrado.getInstance();


    public void initialize() {
        // FUNCIONES QUE SE EJECUTAN CUANDO SE ACTIVA EL BOTON
        agregarParaderoButton.setOnAction(even -> {agregarParadero();irAMenu();});
    }

    //IR A MENU
    public void irAMenu() {
        try {
            // Cargar el archivo FXML del menú
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/persointegradoimplementacion/Menu.fxml"));
            Scene menuScene = new Scene(loader.load());

            // Obtener el Stage actual del botón que disparó el evento
            Stage stage = (Stage) agregarParaderoButton.getScene().getWindow();

            // Establecer la nueva escena en el Stage
            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarParadero() {
        String nombreRuta = nombreRutaField.getText();
        String nombreParadero = nomParaderoField.getText();
        String direccion = direccionField.getText();

            Paradero nuevoParadero = new Paradero(direccion, nombreParadero, perso.rutas.size() + 1);

            for(Ruta r: perso.rutas) {
                if(r.getNombre().equals(nombreRuta)) {

                         r.paraderos.add(nuevoParadero);
                            System.out.println("Paraderos de la ruta " + r.getNombre() + ":");
                            for (Paradero pa : r.paraderos) {
                                System.out.println("Paradero ID: " + pa.getIdParadero() +  ", Nombre: " + pa.getNombre() + ", Dirección: " + pa.getDireccion());
                            }
                         return ;
                }
            }

        }

    }







