/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author dokm01
 */
public interface Subject {
    void registerObserver(Observer observer); // nemusi pred nimi byt public v interface jsou vsechny metody public
    void deleteObserver(Observer observer);
    void notifyAlllObservers();
}
