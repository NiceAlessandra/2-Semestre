/*
5) Modifique o exercício anterior para aceitar somente valores 
* maiores que 0 para N. Caso o valor informado (para N) não seja 
* maior que 0, deverá ser lido um novo valor para N. 
 */
import java.util.Scanner;

public class L6Exer5NmaiorZero {
	
	public static void main (String[] args) {
		
		int N = 0 ;
		
		Scanner leia = new Scanner (System.in);
				
		do {
			
		System.out.print ("Digite um numero: ");
		N = leia.nextInt ();	
		
		if ( N < 0 ) { 
		System.out.print ("Digite um numero positivo: ");
		N = leia.nextInt ();
		}
		} while ( N < 0 );
		  
	}
}	 			
	

