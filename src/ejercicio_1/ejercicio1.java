package ejercicio_1;

import java.util.Scanner;

public class ejercicio1 {

    // *declaramos el scanner de forma global*//
    static Scanner escanear = new Scanner(System.in);

    // *declaro una funciones para simplificar el sistem.out.print y asi practico*//

    // *Declaro una funcion solo para texto*//
    public static void solotexto(String soloText) {
        System.out.println(soloText);
    }

    // *Declaro una funcion para texto + la variable long *//
    public static void imprimStyLn(String texto, long cantidad) {
        System.out.println(texto + cantidad);
    }

    // ! Codigo Principal (Funcion MAIN)
    public static void main(String[] args) {

        // *Inicial *//
        solotexto("Introduce un Numero, solo positivo");
        long n = escanear.nextLong();
        imprimStyLn("El numero añadido es el: ", n);

        /*
         * Hacer que si añades un numero negatvio tengas que volver a añadir el balor
         */
        

    }

}
