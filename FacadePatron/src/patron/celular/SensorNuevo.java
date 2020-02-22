/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.celular;

/**
 *
 * @author Team Facade
 */
public class SensorNuevo implements ISensorMovil{

    @Override
    public boolean existe() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public String valor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Valor del sensor nuevo";
    }

    @Override
    public void iniciar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Encendido el sensor nuevo");
    }

    @Override
    public void detener() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Detenido el sensor nuevo");
    }
    
}
