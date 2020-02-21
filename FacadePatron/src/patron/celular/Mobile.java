package patron.celular;

/**
 *
 * @author Facade Team
 */
import java.util.List;

public class Mobile {

    private final Battery battery;
    private final CPU cpu;
    private final List<IMobileService> mobileServices;
    private final List<IMobileSensor> mobileSensors;
    

    public Mobile(Battery battery, CPU cpu, List<IMobileService> mobileServices, List<IMobileSensor> mobileSensors) {
        this.battery = battery;
        this.cpu = cpu;
        this.mobileServices = mobileServices;
        this.mobileSensors = mobileSensors;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Battery getBattery() {
        return battery;
    }

    public List<IMobileService> getMobileServices() {
        return mobileServices;
    }
    
    public List<IMobileSensor> getMobileSensors(){
        return mobileSensors;
    }
}
