package patron.celular;

/**
 *
 * @author Facade Team
 */
public class ServicioGPS implements IServicioMovil {

    @Override
    public void arrancar() {
        System.out.println("Servicio GPS iniciado");
    }

    @Override
    public void terminar() {
        System.out.println("Servicio GPS detenido");
    }
}
