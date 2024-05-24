public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        animal.preencherAtributos(0.45, "Gato", 5);
        animal.mostrarAtributos();

        Mecanico mecanico = new Mecanico();
        mecanico.preencherDados("Seu Zé", true, 85);
        mecanico. mostrarDados();

        Luta luta = new Luta();
        luta.especificarLuta("Karate", 2, 'F');
        luta.caracteristicas();
    }
}
