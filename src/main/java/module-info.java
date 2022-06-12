module ca.georgiancollege.assignment01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ca.georgiancollege.assignment01 to javafx.fxml;
    exports ca.georgiancollege.assignment01;
}