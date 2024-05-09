import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String login = scan.nextLine();
        String senha = scan.nextLine();
        validarLogin(login, senha);
    }
    public static void validarLogin(String login, String senha){
        if(login.equals("admin") && senha.equals("senha123")){
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }
    }
}
