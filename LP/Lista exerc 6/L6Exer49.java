/*
49) Solicite ao usuário a quantidade de termos da sequência de números primos 
e imprima a sequência do final para o início. 
 */
import java.util.Scanner;

public class L6Exer49 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in);
		
		int numero;
		String saida = "";
		do {
			System.out.print ("Entre com um numero: ");
			numero = leia.nextInt ();
			
			if ( numero > 0 ){
				for ( int i = 1 ; i <= numero; i++) {
					
					saida =  i + " " + saida ;
				}
				System.out.println ( saida );
				
			} else {
				if (numero < 0 ) {
					System.out.println ("\n\tNumero invalido. Entre com um nr positivo: ");
				}
			}
			
		} while (numero != 0 );
		
	}
}
