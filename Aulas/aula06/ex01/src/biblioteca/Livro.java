package biblioteca;

public class Livro {
    private String nome;
    private int classificacaoIndicativa;
    private boolean estahEmprestado;

    public Livro(String nome, int classificacaoIndicativa){
        this.nome = nome;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.estahEmprestado = false;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa){
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

}
