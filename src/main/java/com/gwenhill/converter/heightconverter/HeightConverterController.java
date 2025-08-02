package com.gwenhill.converter.heightconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HeightConverterController {
    @FXML private TextField feetField;
    @FXML private TextField inchesField;
    @FXML private TextField cmField;

    @FXML private Button clearButton;
    @FXML private Button exitButton;

    @FXML
    private void handleClear() {
        feetField.clear();
        inchesField.clear();
        cmField.clear();
    }

    @FXML
    private void handleExit() {
        System.exit(0); //0 means normal exit; tells OS everything ended fine
    }

    @FXML
    private void handleConvert() {
        try {
            double feet, inches, centimeters; // declare variables

            // Read and Convert the User's Input
            feet = Double.parseDouble(feetField.getText());
            inches = Double.parseDouble(inchesField.getText());

            // Perform the conversion
            centimeters = ((feet * 12) + inches) * 2.54;
            //Display the results
            cmField.setText(String.format("%.2f", centimeters));
        }
        catch(NumberFormatException e) {
            // normal catch that shows error in the cmTextField
            // cmField.setText("Please enter valid numbers for feet and inches.");

            // Pop Up Box Alert
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Please enter valid numbers for feet and inches.");
            alert.showAndWait();
        }
    }
}