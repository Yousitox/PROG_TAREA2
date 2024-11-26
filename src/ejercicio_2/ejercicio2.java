package ejercicio_2;

import java.util.Scanner;

public class ejercicio2 {

    /*
     * Aqui estoy creando unas variables fuera de las funciones
     * para que sean unas variables publicas por asi decirlo y se
     * puedan usar en todos las funciones
     */
    static Scanner scanear = new Scanner(System.in);
    static int fla;
    static int clum;

    /*
     * Funcion para que pueda poner el
     * println mas reducido
     */
    public static void textT(String texto) {
        System.out.println(texto);
    }

    /*
     * Aqui igual pero con numeros enteros tambien
     */
    public static void textTYN(String texto, int numero) {
        System.out.println(texto + numero);
    }

    /*
     * ! FUNCION PRINCIPAL (MAIN)
     */
    public static void main(String[] args) {
        textT("CASI MUERO HACIENDO MATRICES NO LO HAGAN");
        crearMatriz();
        mostarMatriz();

    }

    // *Funcion de la matriz*
    /*
     * En esta funcion lo que hice fue
     * el codigo principal lo baje a aqui, asi dejando el
     * main mas limpio y solo para ejecutar las 2 funciones
     * que he creado.
     * En esta funcion crearMatriz lo primero que hago
     * es crear una castante para el maximo de lineas y fila.
     * Desoyes creo un escanar con la variable publica de filas
     * que es fla a demas de mostrar por pantalla unos textos para guiarte
     * cuando añadas un numero si es negativo o mayor a 10, lo tendras
     * que volver a poner ya que el while lo impide y hace un bucle hasta
     * que lo pongas bien y por ultimo esta la de las columnas que
     * funciona igual que el de filas, solo que en este caso es para las columnas
     */
    public static void crearMatriz() {
        // *MAXIMO UN 10X10*
        final byte MAXIMO = 10;

        // *numero de filas*
        textT("Introduce una cantidad de numeros para las filas, maximo 10: ");
        fla = scanear.nextInt();
        textTYN("Numero de numeros de filas añadidos: ", fla);
        // *Si supera el valor maximo Y si es negativo*
        while (0 > fla || MAXIMO < fla) {
            textT("Solo agregar maximo " + MAXIMO + ", introduce otra vez otro valor: ");
            fla = scanear.nextInt();
        }

        // *numero de columnas*
        textT("Introduce una cantidad de columnas");
        clum = scanear.nextInt();
        textTYN("Numero de columnas añadidas: ", clum);
        // * Si supera el valor maximo Y si es negativo*
        while (0 > clum || MAXIMO < clum) {
            textT("Solo agregar maximo " + MAXIMO + ", introduce otra vez otro valor: ");
            clum = scanear.nextInt();
        }
    }

    // *Mostrar matriz*
    /*
     * Aqui hago los bucles, en este caso es un
     * bucle for anidado con un if-else
     * lo primero que podemos observer es que tenemos un
     * bucle for en el cual le decimos que la variable i sea 0
     * y despues que si i es menor a la varibale fla (fila)
     * que se sume en esta caso de 1 en 1
     * y el bucle for de abajo es igual solo que con la de
     * columnas
     * Por ultimo observamos el if-else, en este caso
     * lo que hace el if-else es lo siguiente
     * lo que hace el if es verificar si estamos
     * en la primera o ultama columna, por ejemplo,
     * el i == 0 indica que estamos en la primera fila
     * mientras que i == fla -1 indica que si estamos en la ultima fila
     * y con las columnas pasa igual que en este caso tienen la veriable
     * j del bucle anidado, diciendo que lo que hace es
     * i == 0 si es tru pone 1 en la primera fila de donde este
     * y igual pasa con la columna, en este caso
     * si i no se encuentra dentro de la primera u ultima fila o columna
     * prondra un 0 por el else
     */
    public static void mostarMatriz() {

        // *Bucle para crear las filas y columnas*
        textT("RESULTADO");
        for (int i = 0; i < fla; i++) {
            for (int j = 0; j < clum; j++) {
                if (i == 0 || i == fla - 1 || j == 0 || j == clum - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }
    }
}
