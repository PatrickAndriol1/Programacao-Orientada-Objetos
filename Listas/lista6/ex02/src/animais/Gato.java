package animais;

public class Gato implements Animal{
    private String raca;
    private double peso;

    public Gato(String raca, double peso){
        this.raca = raca;
        this.peso = peso;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return this.raca;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }

    @Override
    public void comer(){
        System.out.println(String.format("Gato %s estah comendo...", raca));
        this.peso++;
        System.out.println(String.format("Gato estah pesando %s Kg!", peso));
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau.");
    }
}
