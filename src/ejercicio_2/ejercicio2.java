package ejercicio_2;

import java.util.Scanner;

public class ejercicio2 {

    static Scanner scanear = new Scanner(System.in);

    public static void textT(String texto) {
        System.out.println(texto);
    }

    public static void textTYN(String texto, int numero) {
        System.out.println(texto + numero);
    }

    // *Mostrar matriz*
    public static void mostarMatriz(){

    }


    public static void main(String[] args) {

        // *MAXIMO UN 10X10*
        final byte MAXIMO = 10;

        // *numero de filas*
        textT("Introduce una cantidad de numeros para el array, maximo 10: ");
        int fla;
        fla = scanear.nextInt();
        textTYN("Numero de numeros de arrays añadidos: ", fla);
        // *Si supera el valor maximo*
        while (MAXIMO < fla) {
            textT("Solo agregar maximo " + MAXIMO + ", introduce otra vez otro valor: ");
            fla = scanear.nextInt();
        }
        // *Si es negativo*
        while (0 > fla) {
            textT("Solo agregar numeros positivos, introduce otra vez otro valor: ");
            fla = scanear.nextInt();
        }

        /*
         * // *el array*
         * textT("Introduce los numeros del array");
         * int[] a = new int[n];
         * for (int i = 0; i < n; i++) {
         * a[i] = scanear.nextInt();
         * }
         * 
         * for (int i : a) {
         * System.out.print(i + " ,");
         * }
         */

        // *numero de columnas*
        textT("Introduce una cantidad de columnas");
        int clum;
        clum = scanear.nextInt();
        textTYN("Numero de columnas añadidas: ", clum);
        // * Si supera el valor maximo*
        while (MAXIMO < clum) {
            textT("Solo agregar maximo " + MAXIMO + ", introduce otra vez otro valor: ");
            clum = scanear.nextInt();
        }
        while (0 > clum) {
            textT("Solo agregar numeros positivos, introduce otra vez otro valor: ");
            clum = scanear.nextInt();
        }
        scanear.close();

        int [][] matriz = new int[fla][clum];
        System.out.println(matriz);

        // *Bucle para crear las filas y columnas*
        for (int i = 1; i <= fla; i++) {
            for (int j = 1; j <= clum; j++) {
                System.out.print("1 ");
            }
            System.out.println(" ");
        }

    }

        // *Funcion de la matriz*
        public static void crearMatriz(){
            int [][] matriz = new int[fla][clum];
        }
}
