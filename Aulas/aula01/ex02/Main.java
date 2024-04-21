import java.util.*;
import java.util.Scanner;

public class Main {
  private static final Scanner SCAN = new Scanner(System.in);
  public static void main(String[] args) {
    int numero = Integer.parseInt(SCAN.nextLine());
    for(int i = numero; i >= 0 ; i--) {
      System.out.println(i);
    }
  }
}