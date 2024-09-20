/*
 * Retos Mouredev https://tinyurl.com/2kzm2pj2
 * #01 OPERADORES Y ESTRUCTURAS DE CONTROL
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

public class Main {
    public static void main(String[] args) {
        // operadores de asignacion
        int a = 50;
        int b = 5;
        int c = 40;
        int d = 0;

        // Operadores aritmeticos
        int suma = a+b;
        System.out.println("Suma: " + suma);
        int resta = a-b;
        System.out.println("Resta: " + resta);
        int multi = a*b;
        System.out.println("Multiplicacion: " + multi);
        int div = a/b;
        System.out.println("Division: " + div);

        // Operador de comparacion
        if(a < b){
            System.out.println("A es menor que B");
        }else {
            System.out.println("A es mayor que B");
        }

        // Operadores logicos
        if(a > b && c > b){
            System.out.println("A y C son mayores que V");
        } else if (a < b || a > c) {
            System.out.println("A es mayor");
        }

        // Operadores de incremento y decremento
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        // Estructuras de control
        while (d <10){
            System.out.println(d);
            d++;
        }

        /*
        * DIFICULTAD EXTRA (opcional):
        * Crea un programa que imprima por consola todos los números comprendidos
        * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
        * */

        for (int i = 10; i <=55; i++){
            if (i % 2 == 0 && i != 16 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}