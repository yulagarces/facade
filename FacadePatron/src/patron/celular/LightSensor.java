
package patron.celular;

/**
 *
 * @author Facade Team
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
