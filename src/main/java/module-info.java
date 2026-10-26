module com.mycompany.lab09_harelrajendram {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab09_harelrajendram to javafx.fxml;
    exports com.mycompany.lab09_harelrajendram;
}
