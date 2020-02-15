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
public class TempSensor implements IMobileSensor{

    @Override
    public boolean exists() {
        return true;
    }

    @Override
    public String value() {
        return "20°C";
    }

    @Override
    public void start() {
        System.out.println("Temperature sensor started");
    }

    @Override
    public void stop() {
        System.out.println("Temperatur sensor stopped");
    }
    
}
