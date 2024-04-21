import java.util.Scanner;

public class App {
  private static final int DISCIPLINAS = 3;
  private static final Scanner SCAN = new Scanner(System.in);
  
  public static void main(String[] args) {
    int quantidadeAlunos = receberQuantidadeAlunos();
    int[][] alunos = new int[quantidadeAlunos][DISCIPLINAS];
    solicitarNotasAlunos(alunos, quantidadeAlunos);
    apresentarNotasStatus(alunos, quantidadeAlunos);
  }

  public static int receberQuantidadeAlunos() {
    System.out.print("Digite a quantidade de alunos: ");
    return Integer.parseInt(SCAN.nextLine());
  }

  public static void solicitarNotasAlunos(int[][] alunos, int quantidadeAlunos) {
    for(int i = 0; i < quantidadeAlunos; i++) {
      System.out.println("Aluno " + (i+1));
      for(int j = 0; j < DISCIPLINAS; j++) {
        System.out.print("Digite a nota da " + (j+1) + "° disciplina: ");
        alunos[i][j] = Integer.parseInt(SCAN.nextLine());
      }
      System.out.println();
    }
  }

  public static void apresentarNotasStatus(int[][] alunos, int quantidadeAlunos) {
    for(int i = 0; i < quantidadeAlunos; i++) {
      System.out.println("Aluno " + (i+1));
      double somatorio = 0.0;
      for(int j = 0; j < DISCIPLINAS; j++) {
        somatorio += alunos[i][j];
      }
      double media = Math.round(somatorio / DISCIPLINAS);
      boolean aprovado = media >= 5 ? true : false;

      System.out.println("Media: " + media);
      if(aprovado) {
        System.out.println("Aprovado");
      } else {
        System.out.println("Reprovado");
      }
    }
  }
}