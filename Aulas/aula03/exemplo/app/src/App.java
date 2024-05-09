import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] nomes = scan.nextLine().split(" ");
        System.out.println(String.format("%s mais conhecido como %s", nomes[0], nomes[1]));
    }
}
