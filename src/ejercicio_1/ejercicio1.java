package ejercicio_1;

import java.util.Scanner;

public class ejercicio1 {

    // *declaramos el scanner de forma global* //
    static Scanner escanear = new Scanner(System.in);

    // *declaro una funciones para simplificar el sistem.out.print y asi practico*//

    // *Declaro una funcion solo para texto* //
    public static void solotexto(String soloText) {
        System.out.println(soloText);
    }

    // *Declaro una funcion para texto + la variable long* //
    public static void imprimStyLn(String texto, long cantidad) {
        System.out.println(texto + cantidad);
    }

    // ! Codigo Principal (Funcion MAIN)
    public static void main(String[] args) {

        // *Inicial* //
        solotexto("Introduce un Numero, solo positivo");
        long n = escanear.nextLong();
        imprimStyLn("El numero añadido es el: ", n);
        escanear.close();

        /*
         * Aqui creo 2 variables mas para la serie, diciendo con los 2 numeros que va a empezar
         * y por ultimo tenemos resultado, que sera pues la veriable que nos de el resultado
         */
        long num1 = 0, num2 = 1, resultado;

        // *Hacer que si añades un numero negatvio tengas que volver a añadir el balor* //
        if(0 > n){
            solotexto("Tienes que ingresar un numero positivo");  
            return;
        }

        // *hacer el bucle para lo de Fibonacci* //
        for(int i = 0; i < n; i++){
            // *Sumamos las veriables num1 y num2* //
            resultado = num1 + num2;
            // *Despues aqui lo que hago es decir que la veriable num 1 sea igual al resultado num2* //
            // *Para que despues el num1 se iguale al resultado y asi el num2 nunca cambie* //
            /*
             * Mejor explicado, lo que hacemos aqui es darle el valor de numero 2 a numero 1
             * porque recuerda que va de derecha a izquierda
             * Por ultimo le agragamos el valor de resultado a numero 2
             * Asi lo que hacemos es por ejemplo si en n ponemos 5
             * que num1 y num2 se sumen 5 veces, ademas, como estamos en un bucle
             * cuando haga la primera suma va a decir, el valor de num2 dacelo a 1 en la sigueinte suma
             * y el valor de resultado a num2 y asi susesibamente hasta llegar a el numero indicado en n
             */
            num1 = num2;
            num2 = resultado;

            System.out.print(num2 + ", ");
        }



    }

}
