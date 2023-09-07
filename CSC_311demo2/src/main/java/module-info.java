module com.example.csc_311demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc_311demo2 to javafx.fxml;
    exports com.example.csc_311demo2;
}