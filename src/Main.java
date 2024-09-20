/*
Retos Mouredev https://tinyurl.com/3dmscn2r
# 00 SINTAXIS, VARIABLES, TIPOS DE DATOS Y HOLA MUNDO
EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */
public class Main {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/
        // Comentario de una linea
        /*
        *  Comentario de
        *  variar lineas
        * */

        // Variable normal
        int numero = 10;

        // Variable constante
        final int num = 11;

        // Crea variables representando todos los tipos de datos primitivos
        // del lenguaje (cadenas de texto, enteros, booleanos...).
        byte num1 = -128;
        byte num2 = 127;
        short num3 = -32768;
        short num4 = 32767;
        int num5 = 123456;
        long num6 = 1234567890123456789L;
        float num7 = 123.456f;
        double num8 = 1234.567;
        boolean cierto = true;
        boolean falso = false;
        char letra = 'a';

        // Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
        System.out.println("¡Hola, Java!");
    }
}