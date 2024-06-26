package eventos;

public class StandUp extends Evento {

    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Comediante: " + comediante);
    }

    @Override
    public void comecarEvento(){
        System.out.printf("O espetaculo %s de %s estah comecando!!!%n", getNome(), getComediante());
    }

    public void comecarEvento(String piada){
        comecarEvento();
        System.out.println(piada);
    }

    public String getComediante() {
        return this.comediante;
    }
    public void setComediante(String comediante) {
        this.comediante = comediante;
    }
}