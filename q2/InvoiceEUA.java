package q2;


public class InvoiceEUA implements Invoice{

    @Override 
public Etiqueta etiquetaGerada(){
    return new EtiquetaEUA();
}
@Override 
public Pagamento pagamentoGerado(double valor){
    return new PagamentoEUA(valor);
}
@Override 
public DocFiscal docFiscalGerado(){
    return new DocFiscalEUA();
}

}
