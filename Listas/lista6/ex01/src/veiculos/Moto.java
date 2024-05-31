package veiculos;

public class Moto implements Veiculo{
    private int velocidade = 0;
    private String marca;
    private String modelo;

    public Moto(String modelo){
        this.modelo = modelo;
    }
    public Moto(){
    }

    private void mostrarVelocidade(){
        System.out.println(String.format("%s estah a %s Km/h\n", this.modelo, this.velocidade));
    }

    @Override
    public void acelerar(){
        System.out.println("Vruuum!!");
        this.velocidade += 50;
        mostrarVelocidade();
    }

    @Override
    public void frear(){
        System.out.println("Skrrrrrrr!");
        this.velocidade -= 50;
        mostrarVelocidade();
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
