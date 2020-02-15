package patron.celular;
public class WifiSevice implements IMobileService {
    @Override
    public void start() {
        System.out.println("WIFI Service started");
    }

    @Override
    public void close() {
        System.out.println("WIFI Service stopped");
    }
}
