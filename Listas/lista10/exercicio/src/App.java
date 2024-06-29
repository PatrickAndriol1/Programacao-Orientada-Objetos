import java.util.Arrays;

import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("homem aranha sem volta para casa", "Jon Watts", Arrays.asList("Tom Holland", "Tobey Maguire", "Andrew Garfield"));
        Jogo jogo = new Jogo("GTA 5", "PlayStation 5");

        Locadora<AudioVisual> locadora = new Locadora<>();

        locadora.adicionarItem(filme);
        locadora.adicionarItem(jogo);
        System.out.println("Itens disponíveis na locadora:");
        locadora.listarItens();

        String tituloBusca = "Porco Aranha";
        System.out.println("Buscando item com título: " + tituloBusca);
        AudioVisual itemBuscado = locadora.buscarItem(tituloBusca);
        if (itemBuscado != null) {
            itemBuscado.exibirInfo();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}