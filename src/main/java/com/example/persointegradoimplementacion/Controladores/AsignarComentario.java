package com.example.persointegradoimplementacion.Controladores;

import com.example.persointegradoimplementacion.Clases.Comentario;
import com.example.persointegradoimplementacion.Clases.PersonIntegrado;
import com.example.persointegradoimplementacion.Clases.Ruta;
import com.example.persointegradoimplementacion.Clases.Usuarios.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class AsignarComentario {

    PersonIntegrado perso = PersonIntegrado.getInstance();

    @FXML
    private TextField nombreUsuario;

    @FXML
    private TextField nombreRuta;

    @FXML
    private TextField calificacion;

    @FXML
    private TextField comentario;

    @FXML
    private Button publicarComentario;

    public void initialize() {
        // FUNCIONES QUE SE EJECUTAN CUANDO SE ACTIVA EL BOTON
        publicarComentario.setOnAction(event -> {hacerComentario();irAMenu();});
    }

    //IR A MENU
    public void irAMenu() {
        try {
            // Cargar el archivo FXML del menú
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/persointegradoimplementacion/Menu.fxml"));
            Scene menuScene = new Scene(loader.load());

            // Obtener el Stage actual del botón que disparó el evento
            Stage stage = (Stage) publicarComentario.getScene().getWindow();

            // Establecer la nueva escena en el Stage
            stage.setScene(menuScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void hacerComentario (){
        String nombre = nombreUsuario.getText();
        String ruta = nombreRuta.getText();
        int califi = Integer.parseInt(calificacion.getText());
        String contenido = comentario.getText();


        for (Usuario u: perso.usuarios){

            if(nombre.equals(u.getNombre())){
                for(Ruta r: perso.rutas){
                    if(r.getNombre().equals(ruta)){
                        Comentario nuevoComentario = new Comentario(contenido, califi, LocalDate.now().toString(), nombre, ruta);
                        perso.comentarios.add(nuevoComentario);
                       System.out.println("Comentario registrado");
                       System.out.println(perso.comentarios);

                        System.out.println("\nLista de comentarios registrados:");
                        for (Comentario c : perso.comentarios) {
                            System.out.println("- " + c);
                        }

                        return;

                    }
                }

            }

        }
    }



}
