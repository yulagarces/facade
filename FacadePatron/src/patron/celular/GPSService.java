package patron.celular;

/**
 *
 * @author Facade Team
 */
public class GPSService implements IMobileService {

    @Override
    public void start() {
        System.out.println("GPS Service started");
    }

    @Override
    public void close() {
        System.out.println("GPS Service closed");
    }
}
