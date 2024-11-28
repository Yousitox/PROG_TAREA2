package ejercicio_3;

import java.util.Scanner;

public class ejercicio3 {

    static Scanner scanear = new Scanner(System.in);

    static int numIntento = 3;

    static int numAleatoGenera = 10;

    // *funcion para abrebiar el sistem.out.println
    public static void textT(String texto) {
        System.out.println(texto);

    }

    // *funcion para abrebiar el sistem.out.print
    public static void textTS(String textoS) {
        System.out.println(textoS);

    }

    // *funcion menu
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
        scanear.close();
    }

    // *funcion de jugar
    public static void jugar() {
        textT("");
        textT("!COMIENZA EL JUEGO!");
        // *Genera un numero ramdon
        int ramdon = (int) (Math.random() * numAleatoGenera) + 1;
        // *Variable para introducir para adivinar el numero
        int adivNum = 0;
        // *Juego :)*/

        for (int i = 0; i <= numAleatoGenera; i *= 0) {
            if (adivNum != ramdon) {
                System.out.println(
                        "Adivina el numero entre 1 a " + numAleatoGenera + " Tienes " + numIntento + " Intentos");
                adivNum = scanear.nextInt();
                numIntento -= 1;
            } else {
                textT("Felicidades el numero era " + ramdon + " Te han sobrado: " + numIntento + " Intentos");
                break;
            }

            if (adivNum > ramdon) {
                textT("El numero introducido es menor");
            } else if (adivNum < ramdon) {
                textT("El numero introducido es mayor");
            }

            if (numIntento <= 0) {
                System.out.println("Perdiste, el numero era: " + ramdon);
                break;
            }

        }
        textT("Gracias por jugar, espero tu regreso pronto");
        scanear.close();

    }

    // *funcion de la configuracion
    public static void configuracion() {
        textT("");
        textT("Configura el juego: ");

        textTS("Introduce el numero maximo de intextos permitidos");
        numIntento = scanear.nextInt();
        while (0 > numIntento || 0 == numIntento) {
            textT("No puedes agregar numeros negativos, ni 0, pon un numero positivo");
            numIntento = scanear.nextInt();
        }
        textT("");
        textTS("Introduce el numero maximo de numeros generados");
        numAleatoGenera = scanear.nextInt();
        while (0 > numAleatoGenera || 0 == numAleatoGenera) {
            textT("No puedes agregar numeros negativos, ni 0, pon un numero positivo");
            numAleatoGenera = scanear.nextInt();
        }
        menu();
        scanear.close();
    }

    // *funcion para salir
    public static void salir() {
        textT("Gracias por jugar :)");
        scanear.close();
    }

    // *Funcion principal
    public static void main(String[] args) {

        menu();

    }
}
