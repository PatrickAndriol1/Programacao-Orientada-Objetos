import animais.*;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato("Siames", 4.5);
        gato.comer();
        gato.emitirSom();

        Cachorro cao = new Cachorro("Rottweiler", 55.6);
        cao.comer();
        cao.emitirSom();
    }
}
