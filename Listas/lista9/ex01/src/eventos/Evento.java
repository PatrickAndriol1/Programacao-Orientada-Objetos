package eventos;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public void exibirInformacoes(){
        System.out.printf("Nome: %s%nLocal: %s%nData: %s%n", nome, local, data);
    }

    public abstract void comecarEvento();
    
    public String getNome() {
        return this.nome;
    }    
    public String getLocal() {
        return this.local;
    }
    public String getData() {
        return this.data;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setData(String data) {
        this.data = data;
    }
}