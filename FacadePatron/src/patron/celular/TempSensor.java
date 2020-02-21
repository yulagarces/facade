
package patron.celular;

/**
 *
 * @author Facade Team
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
