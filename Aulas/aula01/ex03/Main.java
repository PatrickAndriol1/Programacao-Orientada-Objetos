import java.util.*;
import java.util.Scanner;

public class Main {
  private static final Scanner SCAN = new Scanner(System.in);
  
  public static void main(String[] args) {
    int idade = Integer.parseInt(SCAN.nextLine());
    classificarNadador(idade);
  }
  
  public static void classificarNadador(int idade) {
    String categoria;
    if(idade < 12) {
      categoria = "Infantil";
    } else if (idade < 15) {
      categoria = "Juvenil A";
    } else if (idade < 18) {
      categoria = "Juvenil B";
    } else {
      categoria = "Adulto";
    }
    System.out.println(categoria);
  }
}