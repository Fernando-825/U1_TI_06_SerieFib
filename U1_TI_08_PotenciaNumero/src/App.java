import java.util.Scanner;

public class App {

    static int potenciaNumero(int base, int potencia){
        if(potencia == 0){

            return 1;
        }

        int resultadofun = base * potenciaNumero(base, potencia-1);

        return resultadofun;
    }

public static void main(String[] args) throws Exception {
    Scanner leer = new Scanner(System.in);
    System.out.println("Hello, World!");

    System.out.println("Ingresa el numero a elevar (Base): ");
    int numero = leer.nextInt();
    System.out.println("Ingresa el la potencia (Exponente): ");
    int potencia = leer.nextInt(); 
    int resultado = potenciaNumero(numero, potencia);

    System.out.println(numero+ " ^ " +potencia+ " = "+ resultado);

}
}
