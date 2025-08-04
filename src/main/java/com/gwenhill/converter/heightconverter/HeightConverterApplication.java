package com.gwenhill.converter.heightconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HeightConverterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HeightConverterApplication.class.getResource("height-converter.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 593, 476);
        scene.setFill(Color.BLACK);
        stage.setTitle("Height Converter" + "");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}