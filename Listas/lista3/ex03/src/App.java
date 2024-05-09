import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String palavra1 = SCAN.nextLine();
        String palavra2 = SCAN.nextLine();
        compararPalavras(palavra1, palavra2);
    }
    public static void compararPalavras(String palavra1, String palavra2){
        if(palavra1.equals(palavra2)){
            System.out.println("As palavras sao identicas");
        } else if(palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        } else{
            System.out.println("As palavras sao diferentes");
        }
    }
}
