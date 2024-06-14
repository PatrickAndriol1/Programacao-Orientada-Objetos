package exceptions;

public class ValorInvalidoException extends Exception{
    public ValorInvalidoException(){
        super("O valor precisa ser positivo.");
    }

}
