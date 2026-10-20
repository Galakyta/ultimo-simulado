package q2;

public class PagamentoEUA extends Pagamento {

    public PagamentoEUA(double valor) { 
       super(valor);
    }


    @Override 
public  String imprimirPagamento(){
    double valorASerPago = (valor * 0.07);
    return "Valor do pedido: " + valor + " com impostos: " + (valor + valorASerPago) + "Metodo de pagamento aceito: ACH (transferencia bancaria)";
}

}
