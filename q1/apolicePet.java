public class apolicePet extends apolice {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo

    public apolicePet(double valorDoCalculo) {
       super(valorDoCalculo);
        
    }
@Override 
public double calcularPremio(){
    valorDoCalculo = (valorDoCalculo * 0.025) / 12;
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE SEGURO: PET // PREMIO MENSAL: " + valorDoCalculo + " DOCUMENTOS EXIGIDOS: CARTEIRA DE VACINAÇÃO E DOCUMENTO DO TUTOR";
}
}
