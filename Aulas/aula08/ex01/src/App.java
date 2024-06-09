import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pessoa usuario = new Pessoa("K", 0);
        
        try{
            usuario.setNome(scanner.nextLine());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            usuario.setIdade(Integer.parseInt(scanner.nextLine()));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
