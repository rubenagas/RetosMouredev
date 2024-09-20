/*
 * Retos Mouredev https://tinyurl.com/3dmscn2r
 * # 02 FUNCIONES Y ALCANCE
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        System.out.println("Escribe tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println(mensajeSaludo(nombre));

        String fizz;
        System.out.println("Escribe la primera cadena: ");
        fizz = scanner.nextLine();

        String buzz;
        System.out.println("Escribe la segunda cadena: ");
        buzz = scanner.nextLine();

        int contador = fizzBuzz(fizz, buzz);
        System.out.println("Se ha impreso el número " + contador + " veces");
    }

    public void mensaje(){
        System.out.println("Hola mundo");
    }

    public String holaMundo(){
        return "Hola mundo";
    }

    public void saludo(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static String mensajeSaludo(String nombre){
        return "Hola " + nombre;
    }

    public static int fizzBuzz(String fizz, String buzz){
        int cont = 0;
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println(fizz + buzz);
            }else if(i%3==0){
                System.out.println(fizz);
            }else if(i%5==0){
                System.out.println(buzz);
            }else{
                System.out.println(i);
                cont++;
            }
        }
        return cont;
    }
}