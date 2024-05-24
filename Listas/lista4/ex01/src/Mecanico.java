public class Mecanico {
    public static String nome;
    public static boolean calvo;
    public static double peso;

    public static void concertarCarro(){
        System.out.println("Trim... Primm... Poft... Tá feito meu rei!");
    }
    public static void dormir(){
        System.out.println(nome + " estah roncando.");
    }
    public static void mostrarDados(){
        System.out.println(String.format(
            """
            Apelido: %s
            Eh calvo? %s
            Peso: %s Kg
            """,
            nome, calvo, peso
        ));
    }
    public void preencherDados(String nome, boolean calvo, double peso){
        this.nome = nome;
        this.calvo = calvo;
        this.peso = peso;
    }
}
