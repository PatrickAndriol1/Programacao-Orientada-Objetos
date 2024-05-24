public class Animal {
    public static double tamanho;
    public static String especie;
    public static double peso;

    public static void correr(){
        System.out.println(String.format(especie + " saiu correndo"));
    }
    public static void dormir(){
        System.out.println(especie + " esta tirando um cochilo... ");
    }
    public static void mostrarAtributos(){
        System.out.println(String.format(
            """
            Especie: %s
            Comprimento/Altura: %s m
            Peso: %s Kg 
            """,
            especie, tamanho, peso
        ));
    }
    public void preencherAtributos(double tamanho, String especie, double peso){
        this.especie = especie;
        this.peso = peso;
        this.tamanho = tamanho;
    }
}
