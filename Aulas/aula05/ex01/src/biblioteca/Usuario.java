package biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private long id;
    private String endereco;
    private int idade;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}
