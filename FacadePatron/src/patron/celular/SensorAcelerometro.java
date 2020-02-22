
package patron.celular;

/**
 *
 * @author Facade Team
 */
public class SensorAcelerometro implements ISensorMovil{

    @Override
    public boolean existe() {
        return true;
    }

    @Override
    public String valor() {
        return "0x, 0y, -1z";
    }

    @Override
    public void iniciar() {
        System.out.println("Acelerómetro iniciado");
    }

    @Override
    public void detener() {
        System.out.println("Acelerómetro detenido");
    }
    
}
