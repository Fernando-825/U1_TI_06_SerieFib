public class App {

        static int fibonacci(int num){
            if(num <= 1){
                return num;
            }
            return fibonacci(num-1) + fibonacci(num-2);
        }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int num=5;
        fibonacci(5);
        System.out.println("Primeros 5 elementos de la serie Fibonacci");
        for(int n = 0; n<num; n++){
            System.out.println(""+fibonacci(n));
        }

    }
}
