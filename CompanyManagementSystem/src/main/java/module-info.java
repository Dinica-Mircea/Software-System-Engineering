module com.example.companymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.companymanagementsystem to javafx.fxml;
    exports com.example.companymanagementsystem;
}