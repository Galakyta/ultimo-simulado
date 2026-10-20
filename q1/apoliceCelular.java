public class apoliceCelular extends apolice {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo



    public apoliceCelular(double valorDoCalculo) {
        super(valorDoCalculo);
    }
    //
@Override 
public double calcularPremio(){
    valorDoCalculo = (valorDoCalculo * 0.06) / 12;
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE SEGURO: Celular // PREMIO MENSAL: " + valorDoCalculo + " DOCUMENTOS EXIGIDOS: NOTA FISCAL E DOCUMENTO DE IDENTIDADE";
}
}
