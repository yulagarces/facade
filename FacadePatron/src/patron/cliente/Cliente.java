package patron.cliente;

import patron.celular.*;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("--------------- ENCENDER ---------------\n");
        Fachada fachada = new Fachada();
        DispositivoMovil dispositivo = fachada.encender();
        System.out.println();
        System.out.println("El dispositivo se está apagando\n");
        fachada.apagar(dispositivo);
    }
}
