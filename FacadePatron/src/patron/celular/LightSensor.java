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
public class LightSensor implements IMobileSensor{

    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public String value() {
        return "";
    }

    @Override
    public void start() {
        System.out.println("Ambient Ligth sensor started");
    }

    @Override
    public void stop() {
        System.out.println("Ambient Ligth sensor stopped");
    }
    
}
