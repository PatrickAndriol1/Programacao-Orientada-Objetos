public class Luta {
    public String estilo;
    public int tempoDeDuracao;
    public char categoria;

    public void iniciar(){
        System.out.println("Todos preparados para lutar!!!");
    }
    public void lutar(){
        System.out.println("Pancadaria come solta");
    }
    public void especificarLuta(String estilo, int tempoDeDuracao, char categoria){
        this.estilo = estilo;
        this.tempoDeDuracao = tempoDeDuracao;
        this.categoria = categoria;
    }
    public void caracteristicas(){
        System.out.println(String.format(
            """
            Estilo: %s
            Tempo de duracao: %smin
            Categoria[M/F]: %s
            """,
            estilo, tempoDeDuracao, categoria
        ));
    }
}
