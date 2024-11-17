package com.example.persointegradoimplementacion;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Aquí va la lógica para cargar tu vista FXML
        VistaLoader.mostrarVista(); // Asegúrate de que este método cargue la vista correctamente
    }



    public static void main(String[] args) {
        launch(args); // Llamar a launch() para iniciar la aplicación JavaFX
    }
}
