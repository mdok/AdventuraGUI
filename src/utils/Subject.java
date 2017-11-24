/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

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
public interface Subject {
    /**
     * Metoda registruje observera k pozorování událostí týkajícíh se daného subjektu.
     * @param observer - parametrem je observer (instance třídy, která pozoruje).
     */ 
    void registerObserver(Observer observer); // nemusi pred nimi byt public v interface jsou vsechny metody public
    
    /**
     * Metoda ruší registraci observera k pozorování událostí týkajícíh daného subjektu
     * @param observer - parametrem je observer (instance třídy, která pozoruje).
     */ 
    void deleteObserver(Observer observer);
    
    /**
     * Metoda notifikuje všechny observery = volá na ně metodu update().
     */ 
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
 *
 * @author dokm01
 */
public interface Subject {
    void registerObserver(Observer observer); // nemusi pred nimi byt public v interface jsou vsechny metody public
    void deleteObserver(Observer observer);
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
    void notifyAlllObservers();
}
