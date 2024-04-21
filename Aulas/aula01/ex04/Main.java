import java.util.*;
import java.util.Scanner;

public class Main {
  private static final Scanner SCAN = new Scanner(System.in);
  private static final int QUANTIDADE_VAGOES = 12;
  
  public static void main(String[] args) {
    int[] vagoes = new int[QUANTIDADE_VAGOES];
    preencherVagoes(vagoes);
    verificarVagoes(vagoes);
  }
  
  public static void preencherVagoes(int[] vagoes) {
    for(int i = 0; i < QUANTIDADE_VAGOES; i++) {
      vagoes[i] = Integer.parseInt(SCAN.nextLine());
    }
  }
  
  public static void verificarVagoes(int[] vagoes) {
    final int PESO_MAXIMO = 50;
    for(int i = 0; i < QUANTIDADE_VAGOES; i++) {
      if(vagoes[i] > PESO_MAXIMO) {
        System.out.println((i+1) + "° vagao ultrapassou o limite de peso");
      }
    }
  }
}