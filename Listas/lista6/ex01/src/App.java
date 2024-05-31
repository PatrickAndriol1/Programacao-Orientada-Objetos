import veiculos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("RS6");
        carro.setMarca("Audi");
        System.out.println("Marca: " + carro.getMarca());
        carro.acelerar();
        carro.frear();

        Moto moto = new Moto("XJ6");
        moto.setMarca("Yamaha");
        System.out.println("Marca: " + moto.getMarca());
        moto.acelerar();
        moto.frear();

    }
}
