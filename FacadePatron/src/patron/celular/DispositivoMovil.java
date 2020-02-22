package patron.celular;

/**
 *
 * @author Facade Team
 */
import java.util.List;

public class DispositivoMovil {

    private final Bateria bateria;
    private final CPU cpu;
    private final List<IServicioMovil> servicios;
    private final List<ISensorMovil> sensores;
    

    public DispositivoMovil(Bateria bateria, CPU cpu, List<IServicioMovil> servicios, List<ISensorMovil> sensores) {
        this.bateria = bateria;
        this.cpu = cpu;
        this.servicios = servicios;
        this.sensores = sensores;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public List<IServicioMovil> getServicios() {
        return servicios;
    }
    
    public List<ISensorMovil> getSensores(){
        return sensores;
    }
}
