/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.celular;

/**
 *
 * @author YULI GARCES
 */
public interface IMobileSensor {
    
    public boolean exists();
    
    public String value();
    
    public void start();
    
    public void stop();
    
}
