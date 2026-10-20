public class cliente {
public static void main(String[] args) {
    
     factoryGerencia gerencia1 = new gerenciaCelular();
     factoryGerencia gerencia2 = new gerenciaPet();
     factoryGerencia gerencia3 = new gerenciaBicicleta();

     //input do usuario é com virgula sempre e hardcodado é ponto

     apolice apolice1 = gerencia1.apoliceGerada(10000.00);
     apolice apolice2 = gerencia2.apoliceGerada(1000.00);
     apolice apolice3 = gerencia3.apoliceGerada(1000.00);

     System.out.println(apolice1.calcularPremio());
     System.out.println(apolice1.imprimirResumo());

     System.out.println(apolice2.calcularPremio());
     System.out.println(apolice2.imprimirResumo());

     System.out.println(apolice3.calcularPremio());
     System.out.println(apolice3.imprimirResumo());

     

}
}
