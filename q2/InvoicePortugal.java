package q2;


public class InvoicePortugal implements Invoice{

    @Override 
public Etiqueta etiquetaGerada(){
    return new EtiquetaPortugal();
}
@Override 
public Pagamento pagamentoGerado(double valor){
    return new PagamentoPortugal(valor);
}
@Override 
public DocFiscal docFiscalGerado(){
    return new DocFiscalPortgual();
}

}
