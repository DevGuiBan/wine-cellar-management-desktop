module com.ggnarp.winecellarmanagementdesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.ggnarp.winecellarmanagementdesktop to javafx.fxml;
    exports com.ggnarp.winecellarmanagementdesktop;
}