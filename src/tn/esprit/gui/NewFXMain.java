/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author amadd
 */
public class NewFXMain extends Application {
    
 

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tn/esprit/gui/Transport.fxml"));

        Parent root = loader.load();

        // Create a Scene
        Scene scene = new Scene(root);

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Customize your Stage as needed (e.g., set a title)
        primaryStage.setTitle("Transport Application");

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
