import java.util.*;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int NUMERO_CONVIDADOS = 10;
    private static final String[] CONVIDADOS = new String[NUMERO_CONVIDADOS];
    public static void main(String[] args) throws Exception {
        preencherListaConvidados();
        String requisitante = SCAN.nextLine();
        procurarRequisitanteLista(requisitante);
    }
    public static void preencherListaConvidados(){
        for(int i = 0; i < NUMERO_CONVIDADOS; i++){
            CONVIDADOS[i] = SCAN.nextLine();
        }
    }
    public static void procurarRequisitanteLista(String requisitante){
        boolean taNaLista = false;
        for(int i = 0; i < NUMERO_CONVIDADOS; i++){
            if(requisitante.equals(CONVIDADOS[i])){
                taNaLista = true;
            }
        }
        if(taNaLista){
            System.out.println("Requisitante esta na lista. Seja bem vindo!");
        } else {
            System.out.println("Requisitante nao esta na lista. Nao pode entrar na festa.");
        }
    }
}
