/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author dokm01
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() { // co ma delat po kliknuti
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane(); // zpusob vykreslovani prvku  - kontajner do ktereho se vzkresluji objekty javaFX
        // BorderPane rozdeluje obrazovku na 5 casti (top, center, bottom ,left, right), HPane, Vpane, GridPane (tabulka), flowPane, AnchorPane (zakotveni)
        // jednotlive layouty lze skladat BorderPaneLeft(Vbox/VPane)
        
        root.getChildren().add(btn); // pridani tlacitka do pane
        
        Scene scene = new Scene(root, 300, 250); // vztvoreni nove sceny a vloyeni tlacitka (pane) do sceny , sirka vyska
        
        primaryStage.setTitle("Hello World!"); // title sceny
        primaryStage.setScene(scene); // vlozeni sceny na stage
        primaryStage.show(); // zobrazeni sceny
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args); //spusti metodu start
    }
    
}
