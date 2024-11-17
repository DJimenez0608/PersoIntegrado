module com.example.persointegradoimplementacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.example.persointegradoimplementacion to javafx.fxml;
    exports com.example.persointegradoimplementacion;
    exports com.example.persointegradoimplementacion.Controladores;
    opens com.example.persointegradoimplementacion.Controladores to javafx.fxml;
}