package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.Bus;
import com.example.persointegradoimplementacion.Clases.Conductor;
import com.example.persointegradoimplementacion.Clases.EmpresasProveedoras;
import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AsignarConductorABusController {
    PersonIntegrado perso = PersonIntegrado.getInstance();

    @FXML
    private TextField idBusField;
    @FXML
    private TextField NITField;
    @FXML
    private TextField nombreConductorField;
    @FXML
    private TextField cedulaField;
    @FXML
    private TextField licenciaField;
    @FXML
    private Button asignarButton;

    public void initialize() {
        // FUNCIONES QUE SE EJECUTAN CUANDO SE ACTIVA EL BOTON
        asignarButton.setOnAction(event -> {asignarConductorABus();irAMenu();});
    }

    //IR A MENU
    public void irAMenu(){
        try {
            // Cargar el archivo FXML del menú
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/persointegradoimplementacion/Menu.fxml"));
            Scene menuScene = new Scene(loader.load());

            // Obtener el Stage actual del botón que disparó el evento
            Stage stage = (Stage) asignarButton.getScene().getWindow();

            // Establecer la nueva escena en el Stage
            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void asignarConductorABus() {
        int id = Integer.parseInt(idBusField.getText());
        int NIT = Integer.parseInt(NITField.getText());
        String nombre = nombreConductorField.getText();
        int cedula = Integer.parseInt(cedulaField.getText());
        int licencia = Integer.parseInt(licenciaField.getText());

        for(EmpresasProveedoras e : perso.empresasProveedoras){
            if (e.NIT == NIT){
                for (Bus b : e.buses){
                    if(b.id == id){
                        if(b.conductor == null){
                            b.conductor = new Conductor(nombre, cedula, licencia);
                            System.out.println("Conductor asignado al bus con ID: " + b.id);
                            System.out.println("Información del bus:");
                            System.out.println("ID: " + b.id);
                            System.out.println("Placa: " + b.placa);
                            System.out.println("Propietario: " + b.propietario);
                            System.out.println("Modelo: " + b.modelo);
                            System.out.println("Conductor: " + b.conductor.nombre + " | Cédula: " + b.conductor.cedula + " | Licencia: " + b.conductor.licencia);
                        }else {
                            System.out.println("Hay conductor asignado");
                        }
                    }

                }
            }

        }
    }


}
