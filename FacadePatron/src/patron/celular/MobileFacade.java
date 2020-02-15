package patron.celular;

import java.util.Arrays;
import java.util.List;

public class MobileFacade {

    public Mobile on() {

        Battery battery = new Battery();
        battery.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        IMobileService gps = new GPSService();
        gps.start();

        IMobileService wifi = new WifiSevice();
        wifi.start();

        List<IMobileService> mobileServices = Arrays.asList(gps, wifi);
        
        IMobileSensor temp = new TempSensor();
        if(temp.exists()){
            temp.start();
            System.out.println(""+temp.value());
        }
        else{
            System.out.println("Temperatur sensor doesn´t exists");
        }
        
        
        IMobileSensor light = new LightSensor();
         if(light.exists()){
            light.start();
             System.out.println(""+light.value());
        }
        else{
            System.out.println("Ambiente Ligth sensor doesn´t exists");
        }
         
        IMobileSensor accelerometer = new AccelerometerSensor();
        
         if(accelerometer.exists()){
            accelerometer.start();
             System.out.println(""+accelerometer.value());
        }
        else{
            System.out.println("Accelerometer sensor doesn´t exists");
        }

        List<IMobileSensor> sensors = Arrays.asList(temp, light, accelerometer);
        Mobile mobile = new Mobile(battery, cpu, mobileServices, sensors);

        return mobile;
    }

    public void off(Mobile mobile) {

        /*for(IMobileService service :mobile.getMobileServices()) {
            service.close();
        }*/
        mobile.getMobileServices().forEach(IMobileService::close);
        
        
        for(IMobileSensor sensor :mobile.getMobileSensors()){
            if(sensor.exists()){
                sensor.stop();
            }
        }
        mobile.getCpu().shutDown();
        mobile.getBattery().off();
    }
}
