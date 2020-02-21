
package patron.celular;

/**
 *
 * @author Facade Team
 */
public class AccelerometerSensor implements IMobileSensor{

    @Override
    public boolean exists() {
        return true;
    }

    @Override
    public String value() {
        return "0x, 0y, -1z";
    }

    @Override
    public void start() {
        System.out.println("Accelerometer sensor started");
    }

    @Override
    public void stop() {
        System.out.println("Accelerometer sensor stopped");
    }
    
}
