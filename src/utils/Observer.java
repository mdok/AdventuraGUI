/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import logika.IHra;

/**
 *
 * @author dokm01
 */
public interface Observer {
    void update();
    
    void novaHra(IHra hra);
    
}
