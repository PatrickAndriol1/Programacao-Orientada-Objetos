package ex02;
import java.util.Scanner;

public class Mapa {
    private static final int TAMANHO = 4;
    private static boolean[][] map = new boolean[TAMANHO][TAMANHO];
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[]args){
        preencherMatriz();
        int linha = Integer.parseInt(SCAN.nextLine());
        int coluna = Integer.parseInt(SCAN.nextLine());
        adicionarLocalização(linha, coluna);
        imprimirMapa();
    }
    public static void preencherMatriz(){
        for(int i = 0; i < TAMANHO; i++){
            for(int j = 0; j < TAMANHO; j++){
                map[i][j] = false;
            }
        }
    }
    public static void adicionarLocalização(int linha, int coluna){
        map[linha][coluna] = true;
    }
    public static void imprimirMapa(){
        for(int i = 0; i < TAMANHO; i++){
            System.out.print("|");
            for(int j = 0; j < TAMANHO; j++){
                if(map[i][j]){
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
