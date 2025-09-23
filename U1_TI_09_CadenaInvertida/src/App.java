import java.util.Scanner;

public class App {

    static void invertirCadena(String cadena) {
        // Valida si la cadena está vacía o tiene un solo carácter, la recursión se detiene.
        if (cadena == null || cadena.length() <= 1) {
            System.out.print(cadena);
            return;
        }

        /* Paso recursivo:
         1. Llama a la función con la cadena sin la primera letra.
            Esto apila las llamadas en la memoria. */
        invertirCadena(cadena.substring(1));

        /*  2. Imprime el primer carácter de la cadena actual.
            Esta línea se ejecuta en el camino de "regreso" de la recursión,
            logrando el efecto de invertir la cadena. */
        System.out.print(cadena.charAt(0));
    }

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Invertir Cadena (Recursividad)");
        System.out.print("Ingresa la cadena a invertir: ");
        String cadena = leer.nextLine();

        System.out.print("La cadena invertida es: ");
        invertirCadena(cadena);
        System.out.println(); // Salto de línea

    }
}