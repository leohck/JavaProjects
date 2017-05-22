import java.util.Scanner;//esse algoritmo usa class scanner


public class juros {
	
// usando for(...) e usando a formula matematica
	//formula matematica : a=p*(1+r)^n
	// onde p- capital inicial, r- taxa de juros mensal, n- quantia de mes ou anos
	//a- quanrtidade em deposito no fim no décimo mes ou ano.
	
	 public static void main(String[] args) {
		 
		 double quantia; // quantia obtida no fim de cada mes
		 double CapInicial; // capital inicial
		 double taxa; // taxa de juros de cada mes
		 // criar uma instacia do scanner(tela/saida)
		 //para obter entrada de dados digitados por usuario
		 
		 Scanner entrada = new Scanner (System.in);
		 
		 System.out.print("Informe seu capital inicial: ");
		 CapInicial= entrada.nextDouble(); // ler capital inicial digitado por usuario
		 
		 System.out.print("Informe a taxa de juros de cada mes: ");
		 taxa= entrada.nextDouble(); // ler taxa de juros digitada pelo usuario
		 
		 //mostrar cabeçalhos
		 System.out.printf("%s%20s\n","Mes","Quantidade Obtida no deposito(v1)");
		 
		 //calcular a quantidade obtida em cada mes	
		 for(int mes=1; mes<=12; mes++)
		 { // calcular nova quantida em um mes especificado
			 quantia= CapInicial = Math.pow(1.0 + taxa,mes);
		 
		 //Mostrar o resultado de cada mês
		 System.out.printf("%s%20s%,20.2f\n",mes,quantia);
	 }// fim for
}
}

