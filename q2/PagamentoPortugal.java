package q2;


public class PagamentoPortugal extends Pagamento {

    public PagamentoPortugal(double valor) {
       super(valor);
    }


    @Override 
public  String imprimirPagamento(){
    double valorASerPago = (valor * 0.23);
return "Valor do pedido: " + valor + " com impostos: " + (valor + valorASerPago) + "Metodo de pagamento aceito: MB WAY";
}

}
