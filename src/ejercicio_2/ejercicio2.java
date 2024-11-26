package ejercicio_2;

import java.util.Scanner;

public class ejercicio2 {

    public static void textT(String texto) {
        System.out.println(texto);
    }

    public static void textTYN(String texto, long numero) {
        System.out.println(texto + numero);
    }

    static Scanner scanear = new Scanner(System.in);

    public static void main(String[] args) {

        // *MAXIMO UN 10X10*
        final byte MAXIMO = 10;

        // *numero de filas*
        textT("Introduce una cantidad de numeros para el array, maximo 10: ");
        int n;
        n = scanear.nextInt();
        textTYN("Numero de numeros de arrays añadidos: ", n);
        // *Si supera el valor maximo*
        while (MAXIMO < n) {
            textT("Solo agregar maximo " + MAXIMO + ", introduce otra vez otro valor: ");
            n = scanear.nextInt();
        }
        // *Si es negativo*
        while (0 > n) {
            textT("Solo agregar numeros positivos, introduce otra vez otro valor: ");
            n = scanear.nextInt();
        }
        

        // *el array*
        textT("Introduce los numeros del array");
        int [] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scanear.nextInt();
        }
        
        for(int i : a) {
            System.out.print(i+" ,");
        }
        scanear.close();
    

        /*
         * // *numero de columnas*
         * textT("Introduce una cantidad de columnas");
         * long clum;
         * clum = scanear.nextLong();
         * textTYN("Numero de columnas añadidas: ", clum);
         * // * Si supera el valor maximo*
         * while (MAXIMO < clum) {
         * textT("Solo agregar maximo " + MAXIMO +", introduce otra vez otro valor: ");
         * clum = scanear.nextLong();
         * } while (0 > clum) {
         * textT("Solo agregar numeros positivos, introduce otra vez otro valor: ");
         * clum = scanear.nextLong();
         * }
         */

/* 
        // *Bucle para crear las filas y columnas*
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        } */

    }
}
