import java.util.Random;
import javax.swing.JOptionPane;


public class girar {

	


public static void main(String[] args) {

	int n, x, aposta, i;// declarando variaveis
	double probabilidade;
	int[] roleta;//declarando vairaveis do vetor
	n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de lançamentos da bola: "));//pedindo para que informe um numero este numero sera atribuido a vairavel n
	x = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da aposta entre os numeros(1-36): "));
	
	roleta = new int[37]; // atribuindo ao vetor roleta o valor de 37 
	
	Random gerador = new Random();// criando a variavel que gera numeros aleatorios
		
	// aplicando a variavel na função e atribuindo ela a outra variavel
	
	for( i=0; i<37; i++ ){          //atribuindo 0 a todos os vetores da roleta
		roleta[i]=0;
	}

	for(i=1; i<n; i++){ 
	aposta = 1 + gerador.nextInt(37);	// aplicando a variavel na função e atribuindo ela a outra variavel
	roleta[aposta]++;   // atribuindo o valor gerado na variavel aposta como se fosse um vetor da roleta, e incrementando 1 para cada vetor 	
	}

	for(i=1; i<37; i++){
	System.out.printf("A frequencia do numero " + i + " foi de " + roleta[i] ); //mostra a frequencia em que cada numero da roleta caiu a bola
	}
	
	probabilidade = roleta[x] / n; // faz o calculo da probabilidade do numero da aposta sobre o numero de lancamentos.
	JOptionPane.showMessageDialog(null, "A probabilidade do numero " + roleta[x] + "em " + n + "lancamentos foi de "+ probabilidade );//mostra na tela a probabilidade
}
}