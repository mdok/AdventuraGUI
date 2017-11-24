/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import javafx.scene.layout.FlowPane;
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007


import logika.IHra;
import main.Main;
import utils.Observer;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
 * Třída Mapa realizuje zobrazení tečty, určující aktuální prostor na herním plánku.
 * Rozšiřuje AnchorPane a implementuje rozhraní Observer (sleduje události přechodu mezi prostory)

 * @Monika Dokoupilová 
 * @version 1.0.0
<<<<<<< HEAD
=======
=======
 *
 * @author dokm01
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
 */
public class Mapa extends AnchorPane implements Observer{
    private IHra hra;
    private Circle tecka;
    
<<<<<<< HEAD
    
=======
<<<<<<< HEAD
    
=======
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
    public Mapa(IHra hra){
        this.hra=hra;
        hra.getHerniPlan().registerObserver(this);
        init();
      
    }
<<<<<<< HEAD
    /**
     * Metoda inicializující obrázek s plánkem a tečku. Přidává tečku na plánek.
     */
=======
<<<<<<< HEAD
    /**
     * Metoda inicializující obrázek s plánkem a tečku. Přidává tečku na plánek.
     */
=======
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
    private void init(){
            ImageView obrazek = new ImageView( new Image(Main.class.getResourceAsStream("/zdroje/planek.jpg"),550,310,false,false));
            tecka = new Circle (10, Paint.valueOf("red"));
            this.getChildren().addAll(obrazek, tecka);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007

            update();
    }
    /**
     * Metoda Update zajišťuje refresh pozice tečky při přechodu do jiného prostoru.
     * Mění se pouze pozice tečky na plánku.
     */
    @Override
    public void update() {
        this.setTopAnchor(tecka, hra.getHerniPlan().getAktualniProstor().getPosY());
        this.setLeftAnchor(tecka, hra.getHerniPlan().getAktualniProstor().getPosX());  
    }
     /**
     * Metoda zajišťující přeregistrování observerů (změna ukazatelů z původních míst v paměti na nová, přiřazená
     * nové instanci hry)
     */
    @Override
    public void novaHra(IHra hra) {
        hra.getHerniPlan().deleteObserver(this); // pred prirazenim nove instance observeru k pozorovani se musi observer z puvodni instance odregistrovat !! *** totez pro ostatni
        this.hra = hra; // puvodni globalni promenna hra teto tridy - jeji obsah se nahradi novou hrou vytvorenou(predanou) zde
        hra.getHerniPlan().registerObserver(this);
        update();
    }
       
<<<<<<< HEAD
=======
=======
            update();
    }

    @Override
    public void update() {
        this.setTopAnchor(tecka, hra.getHerniPlan().getAktualniProstor().getPosY());
        this.setLeftAnchor(tecka, hra.getHerniPlan().getAktualniProstor().getPosX());
    }
    
   

    @Override
    public void novaHra(IHra hra) {
        hra.getHerniPlan().deleteObserver(this); // pred prirazenim nove instance observeru k pozorovani se musi observer z puvodni instance odregistrovat !! *** totez pro ostatni
        this.hra = hra; // puvodni globalni promenna hra(zelena) teto tridy - jeji obsah se nahradi novou hrou vytvorenou(predanou) zde
        hra.getHerniPlan().registerObserver(this);
        update();
    }
    
        
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
}
    
    

