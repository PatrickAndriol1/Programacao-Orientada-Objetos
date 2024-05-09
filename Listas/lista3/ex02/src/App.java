import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int QUANTIDADE_NOTAS = 3;
    private static int[] notas = new int[QUANTIDADE_NOTAS];
    public static void main(String[] args) throws Exception {
        receberNotas();
        imprimirMedia();
    }
    public static void receberNotas(){
        for(int i = 0; i < QUANTIDADE_NOTAS; i++){
            notas[i] = Integer.parseInt(SCAN.nextLine());
        }
    }
    public static void imprimirMedia(){
        int media = 0;
        for(int i = 0; i < QUANTIDADE_NOTAS; i++){
            media += notas[i];
        }
        media /= QUANTIDADE_NOTAS;
        System.out.println(media);
    }
}
