
package patron.celular;

/**
 *
 * @author Facade Team
 */
public interface IMobileSensor {
    
    public boolean exists();
    
    public String value();
    
    public void start();
    
    public void stop();
    
}
