package animais;

public class Cachorro implements Animal{
    private String raca;
    private double peso;

    public Cachorro(String raca, double peso){
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
        System.out.println(String.format("Cachorro %s foi ao pote de racao comer..", raca));
        this.peso++;
        System.out.println(String.format("Cachorro estah com %s Kg!!!", peso));
    }

    @Override
    public void emitirSom(){
        System.out.println("Au-au-au!");
    }
}
