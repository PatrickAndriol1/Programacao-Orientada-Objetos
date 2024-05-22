import loja.Loja;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja("Renner");
        System.out.println("Loja: " + loja.getNomeLoja());
        loja.adicionarProduto("camiseta da marvel", 45.90);
        loja.adicionarProduto("bermuda do ben10", 75.50);
        loja.adicionarProduto("moletom preto", 140);
        loja.visualizarprodutos();
        loja.getprodutos().get(1).exibirDados();
    }
}