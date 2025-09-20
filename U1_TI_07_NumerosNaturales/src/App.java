import java.util.Scanner;

public class App {

    static int NumerosNaturales(int num){
        if(num <= 0){
            num = 0;
            return num;
        }

        int resultadofun = num + NumerosNaturales(num-1);

        return resultadofun;
    }

public static void main(String[] args) throws Exception {
    Scanner leer = new Scanner(System.in);
    System.out.println("Hello, World!");

    System.out.println("Ingresa hasta que numero se sumara: ");
    int limite = leer.nextInt(); 
    int resultado = NumerosNaturales(limite);
    System.out.println("Los " +limite+ " elementos de la suma de numeros naturales ");

    System.out.println("= "+resultado);

}
}
