module hu.unideb.inf.kip_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.unideb.inf.kip_javafx to javafx.fxml;
    exports hu.unideb.inf.kip_javafx;
}