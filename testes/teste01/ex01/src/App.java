import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero = Integer.parseInt(scan.nextLine());
        imprimirTabuada(numero);
    }

    public static void imprimirTabuada(int numero){
        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("%s x %s = %s", numero, i, numero*i));
        }
    }
}
