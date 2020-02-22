
package patron.celular;

/**
 *
 * @author Facade Team
 */
public class SensorDeTemperatura implements ISensorMovil{

    @Override
    public boolean existe() {
        return true;
    }

    @Override
    public String valor() {
        return "20°C";
    }

    @Override
    public void iniciar() {
        System.out.println("Sensor de temperatura iniciado");
    }

    @Override
    public void detener() {
        System.out.println("Sensor de temperatura detenido");
    }
    
}
