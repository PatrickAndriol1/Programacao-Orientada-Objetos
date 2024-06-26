package eventos;

import java.util.List;

public class Show extends Evento {

    private List<String> artistas;

    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Artistas: " + artistas);
    }

    @Override
    public void comecarEvento(){
        System.out.println("Senhoras e senhores, o show " + getNome() + " vai comecar!!!");
    }

    public void comecarEvento(boolean comAplausos){
        comecarEvento();
        if(comAplausos){
            System.out.println("Clap clap clap! (Palmas)");
        }
    }

    public List<String> getArtistas() {
        return this.artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

}