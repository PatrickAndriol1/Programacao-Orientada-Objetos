import exceptions.*;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Camisa", 49.99);
        System.out.println(produto.getNome() + " " + produto.getValor());
        
        do { 
            try {
                Produto produto1 = new Produto("", 49.99);
                System.out.println(produto1.getNome() + " " + produto1.getValor());
                break;
            } catch (NomeInvalidoException | ValorInvalidoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        do { 
            try {
                Produto produto2 = new Produto("", 49.99);
                System.out.println(produto2.getNome() + " " + produto2.getValor());
                break;
            } catch (NomeInvalidoException | ValorInvalidoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        /* 
        import java.util.Scanner;
        Scanner scan = new Scanner(System.in);
        do { 
            try {
                Produto produto = new Produto(scan.nextLine(), Double.parseDouble(scan.nextLine()));
                System.out.println(produto.getNome() + " " + produto.getValor());
                break;
            } catch (NomeInvalidoException | ValorInvalidoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        */
    }
}
