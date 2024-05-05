import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero = Integer.parseInt(scan.nextLine());
        if(ehPar(numero)){
            System.out.println("Eh par");
        } else {
            System.out.println("Nao eh par");
        }
    }
    public static boolean ehPar(int numero){
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }
}
