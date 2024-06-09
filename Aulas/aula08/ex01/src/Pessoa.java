public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws Exception{
        this.nome = setNome(nome);
        this.idade = setIdade(idade);
    }

    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade) throws Exception{
        if(idade >= 0){
            this.idade = idade;
        } else {
            throw new IdadeInvalidaException();
        }
    }

    public void setNome(String nome) throws Exception{
        if(!nome.isBlank()){
            this.nome = nome;
        } else {
            throw new Exception("Nome eh obrigatorio!");
        }
    }
}
