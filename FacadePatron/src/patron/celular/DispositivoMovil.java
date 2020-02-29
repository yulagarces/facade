package patron.celular;

/**
 *
 * @author Facade Team
 */
import java.util.List;

public class DispositivoMovil {

    private Bateria bateria;
    private CPU cpu;
    private List<IServicioMovil> servicios;
    private List<ISensorMovil> sensores;
    

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
