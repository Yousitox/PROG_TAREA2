package ejercicio_3;

import java.util.Scanner;

public class ejercicio3 {

    static Scanner scanear = new Scanner(System.in);

    static int numIntento = 3;

    static int numAleatoGenera = 10;

    //*funcion para abrebiar el sistem.out.println
    public static void textT(String texto) {
        System.out.println(texto);

    }
        //*funcion para abrebiar el sistem.out.print
        public static void textTS(String textoS) {
            System.out.println(textoS);
    
        }

    //*funcion menu
    public static void menu() {
        textT("-----MENU-------");

        textT("1: Jugar");

        textT("2: Configuracion");

        textT("0: Salir");

        textTS("Elige una opcion: ");

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


    //*funcion de jugar
    public static void jugar() {
        textT("");
        textT("!COMIENZA EL JUEGO!");
        System.out.println(numIntento + " " + numAleatoGenera);

    }

    //*funcion de la configuracion
    public static void configuracion() {
        textT("");
        textT("Configura el juego: ");

        textTS("Introduce el numero maximo de intextos permitidos");
        numIntento = scanear.nextInt();
        textT("");
        textTS("Introduce el numero maximo de numeros generados");
        numAleatoGenera = scanear.nextInt();



        //* */
        textT("Selecciona 0 para ir al menu");

        switch (scanear.nextInt()) {
            default:
                menu();
                break;
        }
        scanear.close();
    }

    //*funcion para salir
    public static void salir() {
        textT("Gracias por jugar :)");
        scanear.close();
    }

    //*Funcion principal
    public static void main(String[] args) {

        menu();

    }
}
