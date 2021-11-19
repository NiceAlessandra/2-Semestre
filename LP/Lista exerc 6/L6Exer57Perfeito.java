/*
57) Solicite ao usuário a quantidade de termos da sequência de números perfeitos e 
imprima o resultado. (Atenção! Este processamento pode demorar MUITO)
 */
import java.util.Scanner;
 
public class L6Exer57Perfeito {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0 , soma = 0;
		int termos = 0;
		
		System.out.print ("Entre com a quantidade de termos: ");
		termos = leia.nextInt();
		
		for ( numero = 1 ; numero <= termos ; numero++ ) {		
			
			soma = 0;
			
			for ( int i = 1 ; i < numero ; i++) {
				if ( numero % i == 0 ){
					
					soma = soma + i;
				}
			}
				if ( numero == soma ) {
					
				System.out.println (numero + " ");
			}
		}	
	}
}

