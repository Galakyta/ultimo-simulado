public class apoliceBicicleta extends apolice {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo



    public apoliceBicicleta(double valorDoCalculo) {
       super(valorDoCalculo);
        
    }
@Override 
public double calcularPremio(){
    valorDoCalculo = (valorDoCalculo * 0.04) / 12;
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE SEGURO: BICICLETA // PREMIO MENSAL: " + valorDoCalculo + " DOCUMENTOS EXIGIDOS: NOTA FISCAL E FOTO DO NUMERO D/S DO QUADRO";
}
}
