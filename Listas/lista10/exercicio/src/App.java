import java.util.Arrays;
import locadora.*;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("Velozes e Furiosos", "Rob Cohen", Arrays.asList("Vin Diesel", "Paul Walker", "Jordana Brewster"));
        Jogo jogo = new Jogo("Free Fire", "PlayStore");
        
        Locadora<AudioVisual> locadora = new Locadora<>();
        
        locadora.adicionarItem(filme);
        locadora.adicionarItem(jogo);
        
        locadora.listarItens();
        
        String titulo1 = "Minecraft";
        String titulo2 = "Velozes e Furiosos";
        
        AudioVisual item = locadora.buscarItem(titulo1);
        System.out.println("Buscando " + titulo1 + "...");
        procurarItem(item);

        System.out.println();
        
        AudioVisual item2 = locadora.buscarItem(titulo2);       
        System.out.println("Buscando " + titulo2 + "...");
        procurarItem(item2);
    }

    static void procurarItem(AudioVisual item){
        if (item != null) {
            item.exibirInfo();
        } else {
            System.out.println("Nao disponivel no momento...");
        }
    }
}