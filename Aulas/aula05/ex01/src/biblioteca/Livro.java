package biblioteca;

public class Livro {
    private String nome;
    private int classificacaoIndicativa;
    private boolean emprestado = false;

    public Livro(String nome, int classificacaoIndicativa){
        this.nome = nome;
        this.classificacaoIndicativa = classificarLivro(classificacaoIndicativa);
    }

    private int classificarLivro(int classificacaoIndicativa){
        if(classificacaoIndicativa < 0){
            return 0;
        }
        if(classificacaoIndicativa > 18){
            return 18;
        }
        return classificacaoIndicativa;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa){
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public int getClassificacaoIndicativa(){
        return classificacaoIndicativa;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    public boolean getEmprestado(){
        return emprestado;
    }
}
