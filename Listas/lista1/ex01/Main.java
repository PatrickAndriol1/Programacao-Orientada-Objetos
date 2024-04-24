import java.util.*;

public class Main {
    private static final Scanner SCAN = new Scanner(System.in);
    static int[] vetor = new int[10];
    public static void main(String[] args) {
        preencherVetor(vetor);
        int numeroProcurado = Integer.parseInt(SCAN.nextLine());
        boolean temEsseNumero = buscarNumero(numeroProcurado);
        if(temEsseNumero) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
    public static void preencherVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }
    public static boolean buscarNumero(int num) {
        for(int i = 0; i < vetor.length; i++) {
            if(num == vetor[i]) {
                return true;
            }
        }
        return false;
    }
}