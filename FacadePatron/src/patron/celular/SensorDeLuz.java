
package patron.celular;

/**
 *
 * @author Facade Team
 */
public class SensorDeLuz implements ISensorMovil{

    @Override
    public boolean existe() {
        return false;
    }

    @Override
    public String valor() {
        return "";
    }

    @Override
    public void iniciar() {
        System.out.println("Sensor de Luz iniciado");
    }

    @Override
    public void detener() {
        System.out.println("Sensor de Luz detenido");
    }
    
}
