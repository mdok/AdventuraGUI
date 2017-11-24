/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import logika.Hra;
import logika.IHra;
import main.Main;

/**
 *
 * @author dokm01
 */
public class MenuPole extends MenuBar{
    private Main main;
    public MenuPole(Main main){
        this.main=main;
        init();
    }
    
    private void init(){
        Menu menuSoubor = new Menu("Adventura");
        
        MenuItem itemNovaHra = new MenuItem("Nova hra");
                //MenuItem itemNovaHra = new MenuItem(new Image("Nova hra", new ImageView(Main.class.getResourcesAsStream("/zdroje/obrazek/ikona.png")))); - pro vlozeni obrazku do manu
        itemNovaHra.setAccelerator(KeyCombination.keyCombination("Ctrl+N")); // klavesova zkratka na novou hru
        
        MenuItem itemKonec = new MenuItem("Konec");
        
        Menu menuHelp = new Menu("Help");
        MenuItem itemOProgramu = new MenuItem("O programu");
        MenuItem itemNapoveda= new MenuItem("napoveda");
         
        menuHelp.getItems().addAll(itemOProgramu,itemNapoveda);
        menuSoubor.getItems().addAll(itemNovaHra, itemKonec);
        this.getMenus().addAll(menuSoubor,menuHelp);
        
        itemOProgramu.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("O Adventure");
                alert.setHeaderText("Toto je ma adventura");
                alert.setContentText("Graficka verze adventury");
                alert.initOwner(main.getPrimaryStage()); // kdo je vlastnikem popupu / primaryStage
                
                alert.showAndWait();
              
            }
        });
        
        itemNapoveda.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                stage.setTitle("Napoveda");
                WebView webview = new WebView();
                
                webview.getEngine().load(Main.class.getResource("/zdroje/napoveda.html").toExternalForm());
                stage.setScene(new Scene(webview,500,500));
                stage.show();
            }
        });
        
       
        
        itemKonec.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        itemNovaHra.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                main.novaHra();
            }
        });
        
    }
    
}