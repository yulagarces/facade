package patron.celular;
/**
 *
 * @author Facade Team
 */
public class ServicioWIFI implements IServicioMovil {
    @Override
    public void arrancar() {
        System.out.println("Servicio WIFI iniciado");
    }

    @Override
    public void terminar() {
        System.out.println("Servicio WIFI detenido");
    }
}
