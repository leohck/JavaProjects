import java.util.Scanner;
public class fo {
	
	public static void main (String[] args){
		
		int numero;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o numero final da contagem: ");
		
		numero = entrada.nextInt();
		
		for(int contagem=1; contagem<=numero;contagem++){
			System.out.print(contagem);
		}
	}
	
	
}
