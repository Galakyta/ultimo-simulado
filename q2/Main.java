package q2;


public class Main {

    public static void main(String[] args) {
        
        Checkout pedidoBrasil = new Checkout(new InvoiceEUA());
        pedidoBrasil.finalizarPedido(1000.00);
        Checkout pedidoAlemanha = new Checkout(new InvoicePortugal());
        pedidoAlemanha.finalizarPedido(2000.00);

    }


}
