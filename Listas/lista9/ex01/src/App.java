import eventos.Show;
import eventos.StandUp;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Show show = new Show("Rock In Rio", "Rio de Janeiro", "26/06/2024", Arrays.asList("Imagine Dragons", "Coldplay", "Maroon 5", "Capital Inicial"));
        StandUp standUp = new StandUp("Adulto", "Sao Paulo", "01/07/2024", "Whindersson Nunes");
        
        show.comecarEvento(true);
        show.exibirInformacoes();
        System.out.println();
        standUp.comecarEvento();
        standUp.exibirInformacoes();
    }
}