package ejercicio_3;

import java.util.Scanner;

public class ejercicio3 {

    static Scanner scanear = new Scanner(System.in);

    //funcion para abrebiar el sistem.out.println
    public static void textT(String texto) {
        System.out.println(texto);

    }

    //funcion de jugar
    public static void jugar() {
        textT("PRUEBA1");

    }

    //funcion de la configuracion
    public static void configuracion() {
        textT("PRUEBA2");
    }

    //funcion para salir
    public static void salir() {
        textT("PRUEBA3");
    }

    public static void main(String[] args) {

        textT("-----MENU-------");

        textT("1: Jugar");

        textT("2: Configuracion");

        textT("0: Salir");

        switch (scanear.nextInt()) {
            case 1:
                jugar();
                break;
            case 2:
                configuracion();
                break;
            default:
                salir();
                break;
        }

    }
}
