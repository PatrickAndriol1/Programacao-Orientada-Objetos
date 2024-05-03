import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String frase = SCAN.nextLine();
        imprimirFrase(frase);
    }
    public static void imprimirFrase(String frase){
        String[] palavras = frase.split(" ");
        for(int i = 0; i < palavras.length; i++){
            if(i == (palavras.length - 1)){
                imprimirUltimaPalavra(palavras[i]);
            } else {
                System.out.println(palavras[i]);
            }
        }
    }
    public static void imprimirUltimaPalavra(String palavra){
        char[] letras = palavra.toCharArray();
        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }
    }
}
