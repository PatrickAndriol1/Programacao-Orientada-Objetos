package pagamentos;

public interface FormaPagamento {
    double receberPagamento(String identificador, double valor);
    double reembolsar(double valor);
    String imprimirComprovante();
}
