package loja;

public class Produto {
    private String nomeProduto;
    private double valor;

    public Produto(String nomeProduto, double valor){
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }

    public void exibirDados(){
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preco: " + valor);
    }
}
