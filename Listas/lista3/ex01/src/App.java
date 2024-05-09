import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int ANO_ATUAL = 2024;
    public static void main(String[] args) throws Exception {
        int anoNascimento = Integer.parseInt(SCAN.nextLine());
        int idade = calcularIdade(anoNascimento);
        System.out.println(String.format("Ate o final de %s voce tera %s anos", ANO_ATUAL, idade));
    }
    public static int calcularIdade(int anoNascimento){
        return (ANO_ATUAL - anoNascimento);
    }
}
