module ca.georgiancollege.assignment01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.assignment01 to javafx.fxml;
    exports ca.georgiancollege.assignment01;
}