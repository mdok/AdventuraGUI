/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import logika.IHra;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
 *  Rozhraní určující metody, které musí obsahovat všechny třídy implementující dané rozhraní.
 *
 *@author Monika Dokoupilová
 *@version 1.0.0
 */
public interface Observer {
    /**
     * Metoda refreshující stav observera vzhledem ke změnám, které se udály s pozorovaným subjektem.
     */
    void update();
     
    /**
     * Metoda regujicí na zavolání nové hry (přeregistrování observerů)
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
 *
 * @author dokm01
 */
public interface Observer {
    void update();
    
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
    void novaHra(IHra hra);
    
}
