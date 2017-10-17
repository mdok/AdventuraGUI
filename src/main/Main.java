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
import logika.Hra; // import balicku logika.Hra vzhledem k tomu ze ho tu pouzivame
import logika.IHra;
import logika.*;
import uiText.TextoveRozhrani;

/**
 *
 * @author dokm01
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Start Adventura");
        btn.setOnAction(new EventHandler<ActionEvent>() { // co ma delat po kliknuti
            
            @Override
            public void handle(ActionEvent event) {
                IHra hra= new Hra(); // spusti hru
                TextoveRozhrani textoveRozhrani = new TextoveRozhrani(hra);
                textoveRozhrani.hraj();
            }
        });
        
        StackPane root = new StackPane(); // zpusob vykreslovani prvku  - kontajner do ktereho se vzkresluji objekty javaFX
        // BorderPane rozdeluje obrazovku na 5 casti (top, center, bottom ,left, right), HPane, Vpane, GridPane (tabulka), flowPane, AnchorPane (zakotveni)
        // jednotlive layouty lze skladat BorderPaneLeft(Vbox/VPane)
        
        root.getChildren().add(btn); // pridani tlacitka do pane
        
        Scene scene = new Scene(root, 300, 250); // vztvoreni nove sceny a vloyeni tlacitka (pane) do sceny , sirka vyska
        
        primaryStage.setTitle("Moje adventura"); // title sceny
        primaryStage.setScene(scene); // vlozeni sceny na stage
        primaryStage.show(); // zobrazeni sceny
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length == 0){
            launch(args);
        }else{
            if(args[0].equals("-text")){
                IHra hra = new Hra();
                TextoveRozhrani textoveRozhrani = new TextoveRozhrani(hra);
                textoveRozhrani.hraj();

            }else{
                System.out.println("Neplatny parametr");
                System.exit(1);
            }
        }
        
        //launch(args); //spusti metodu start
    }
    
}
