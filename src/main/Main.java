/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import UI.Mapa;
import UI.MenuPole;
import java.util.HashSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
    
    private Mapa mapa;
    private MenuPole menu;
    
    @Override
    public void start(Stage primaryStage) {
        
      
        IHra hra= new Hra(); // spusti hru
        mapa = new Mapa(hra);
        menu = new MenuPole();
        
        BorderPane borderPane = new BorderPane();
        TextArea centerText = new TextArea();
        centerText.setText(hra.vratUvitani());
        centerText.setEditable(false);
        borderPane.setCenter(centerText);
                
        Label zadejPrikazLabel = new Label("Zadej prikaz");
        zadejPrikazLabel.setFont(Font.font("Arial",FontWeight.BOLD, 16));
        
        
        
        TextField zadejPrikazTextField = new TextField("Sem zadej prikaz");
        zadejPrikazTextField.setOnAction(new EventHandler<ActionEvent>() { //po entru

            @Override
            public void handle(ActionEvent event) {
                String zadanyPrikaz = zadejPrikazTextField.getText();
                String odpoved = hra.zpracujPrikaz(zadanyPrikaz);
                
                centerText.appendText("\n"+zadanyPrikaz+"\n");
                centerText.appendText("\n"+odpoved+"\n");

                zadejPrikazTextField.setText("");
                
                if(hra.konecHry()){
                    zadejPrikazTextField.setEditable(false);
                }
                
            }
            
        });
        
        FlowPane dolniPanel = new FlowPane();
        dolniPanel.setAlignment(Pos.CENTER);
        dolniPanel.getChildren().addAll(zadejPrikazLabel,zadejPrikazTextField);
        
        borderPane.setLeft(mapa);
        
        //menu Adventury
        borderPane.setTop(menu);
        borderPane.setBottom(dolniPanel);
        Scene scene = new Scene(borderPane, 1200, 600); // vztvoreni nove sceny a vloyeni tlacitka (pane) do sceny , sirka vyska
        
        primaryStage.setTitle("Moje adventura"); // title sceny
        primaryStage.setScene(scene); // vlozeni sceny na stage
        primaryStage.show(); // zobrazeni sceny
        
        zadejPrikazTextField.requestFocus(); // po spusteni adventury lze rovnou psat do pole pro text
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length == 0){ //spusti v gui
            launch(args);
        }else{
            if(args[0].equals("-text")){ // spusti v textovem rozhrani pri nastaveni parametru -text
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
