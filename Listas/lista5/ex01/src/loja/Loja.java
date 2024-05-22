package loja;  

import java.util.ArrayList;

public class Loja {
    private final String nomeLoja;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public String getNomeLoja(){
        return nomeLoja;
    }

    public ArrayList<Produto> getprodutos(){
        return this.produtos;
    }

    public void adicionarProduto(String nomeproduto, double valor){
        produtos.add(new Produto(nomeproduto, valor));
    }

    public void visualizarprodutos(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(String.format(
                """
                [%s] %s
                Preco: R$ %s 
                """,
                (i+1) , produtos.get(i).getNomeProduto(), produtos.get(i).getValor()
            ));
        }
    }
}
