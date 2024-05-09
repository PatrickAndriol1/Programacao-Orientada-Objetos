import java.util.Scanner;
public class 01 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        int tamanho = Integer.parseInt(scan.nextLine());
        char[][] matriz = new char[tamanho][tamanho];
        for(int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matriz[i][j] = ' ';
                if(i == j){
                    matriz[i][j] = '\\';
                } if(i+j == tamanho-1){
                    matriz[i][j] = '/';
                } if(i == j && i == tamanho/2){
                    matriz[i][j] = 'X';
                }
            }
        }
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}