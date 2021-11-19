/*
20) Escreva um programa para ler um vetor AA de 10 posições com
elementos fornecidos pelo usuário e colocar os elementos em ordem
decrescente. Ao final imprimir o vetor AA ordenado.
 */


public class L8Exe20Ordena {
	
	public static void main (String[] args) {
		
		int limite = 10, temp;
		
		int[] aa = new int[(int)(Math.random()*limite)+1];
		      
		      
		System.out.print("AA: ");
		for ( int i = 0 ; i < aa.length ; i++ ) {
			
			aa[i] = (int)(Math.random()*10);
			System.out.print( aa[i] + " " );
		}
		System.out.println("\n");
		 
		
		// Ordemando o vetor AA		      
		for ( int i = 0 ; i < aa.length ; i++ ) {
			
			for ( int j = 0 ; j < aa.length ; j++ ) {
				
				if ( aa[i] > aa[j] ) {
					
					temp  = aa[i];
					aa[i] = aa[j];
					aa[j] = temp; 
				}
			}
		}
		
		System.out.print("AA: ");
		for ( int i = 0 ; i < aa.length ; i++ ) {
			
			System.out.print( aa[i] + " " );
		}
		System.out.println("\n");

		
	}
}

