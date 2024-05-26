package zelda;

import java.util.*;

public class NPC implements Interativo{
    private ArrayList<String> falas;
    private String localizacao;

    @Override
    public void interagir(Heroi heroi){
        Random random = new Random();
        int indiceFalas = random.nextInt(falas.size());
        System.out.println("Ola " + heroi.getNome());
        System.out.println(falas.get(indiceFalas));
    }
}
