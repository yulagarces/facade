package patron.cliente;

import patron.celular.*;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("--------------- ENCENDER ---------------");
        Fachada fachada = new Fachada();
        DispositivoMovil dispositivo = fachada.encender();
        System.out.println();
        System.out.println("--------------- APAGAR ---------------");
        fachada.apagar(dispositivo);
    }
}
