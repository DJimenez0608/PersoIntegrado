package com.example.persointegradoimplementacion;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VistaLoader {

    public static void mostrarVista() {
        Platform.runLater(() -> {
            try {
                // Cargar la vista FXML
                FXMLLoader loader = new FXMLLoader(VistaLoader.class.getResource("Menu.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
