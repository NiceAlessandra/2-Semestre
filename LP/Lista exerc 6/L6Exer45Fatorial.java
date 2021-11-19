/*
45) Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a 
sequência do final para o início.
 */
import java.util.Scanner;
public class L6Exer45Fatorial {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int fatorial = 1; 
		int termos = 0;
	    
	    System.out.print ("Digite a quantidade de termos: ");
		termos = leia.nextInt ();
		
		for ( int sequencia = 1 ; sequencia <= termos ; sequencia ++){		
			fatorial = 1;
			
			for ( int i = 1 ; i <= sequencia ; i++){
				fatorial *= i; 
						
			}
			System.out.println (sequencia  + " !: " + fatorial );
			
			//for ( int j = 1 ; j <= termos - i ; j++){ 
			//	System.out.print (j + " ");
			//} Como fazer de traz para frente???
		}
		
	}
}




