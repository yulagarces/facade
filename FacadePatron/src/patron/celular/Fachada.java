package patron.celular;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Facade Team
 */
public class Fachada {

    public DispositivoMovil encender() {

        Bateria bateria = new Bateria();
        bateria.encender();

        CPU cpu = new CPU();
        cpu.iniciar();

        IServicioMovil gps = new ServicioGPS();
        gps.arrancar();

        IServicioMovil wifi = new ServicioWIFI();
        wifi.arrancar();

        List<IServicioMovil> servicios = Arrays.asList(gps, wifi);

        ISensorMovil temp = new SensorDeTemperatura();
        if (temp.existe()) {
            temp.iniciar();
            System.out.println(temp.valor());
        } else {
            System.out.println("El sensor de temperatura no existe");
        }

        ISensorMovil luz = new SensorDeLuz();
        if (luz.existe()) {
            luz.iniciar();
            System.out.println(luz.valor());
        } else {
            System.out.println("El sensor de luz no existe");
        }

        ISensorMovil acelerometro = new SensorAcelerometro();

        if (acelerometro.existe()) {

            acelerometro.iniciar();
            System.out.println(acelerometro.valor());
        } else {
            System.out.println("El sensor acelerómetro no existe");
        }

        ISensorMovil sensorNuevo = new SensorNuevo();

        if (sensorNuevo.existe()) {
            sensorNuevo.detener();
            System.out.println(sensorNuevo.valor());
        } else {
            System.out.println("El sensor nuevo no existe");
        }

        List<ISensorMovil> sensores = Arrays.asList(temp, luz, acelerometro, sensorNuevo);
        DispositivoMovil dispositivo = new DispositivoMovil(bateria, cpu, servicios, sensores);

        return dispositivo;
    }

    public void apagar(DispositivoMovil dispositivo) {

        dispositivo.getServicios().forEach(IServicioMovil::terminar);

        dispositivo.getSensores().stream().filter((sensor) -> (sensor.existe())).forEach((sensor) -> {
            sensor.detener();
        });
        dispositivo.getCpu().apagar();
        dispositivo.getBateria().apagar();
    }
}
