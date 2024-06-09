package exception;

public class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(){
        super("Idade eh obrigatoria");
    }
}
