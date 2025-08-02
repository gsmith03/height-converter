module com.gwenhill.converter.heightconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gwenhill.converter.heightconverter to javafx.fxml;
    exports com.gwenhill.converter.heightconverter;
}