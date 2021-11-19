/*
11) Escreva um programa para ler dois vetores QA e QB de inteiros de 5 elementos e
imprimir os vetores lidos. Construir outro vetor QC de tamanho 10, com todos os
elementos lidos de QA e de QB e imprimir este vetor obtido. (Intercalação)
 */


public class L8Exe11QaQbQc {
	
	public static void main (String[] args) {
		
		int tamanho = 5;
		
		int[] qa = new int[tamanho],
		      qb = new int[tamanho],
		      qc = new int[qa.length + qb.length];
		      
		System.out.print("QA: ");
		for ( int i = 0 ; i < qa.length ; i++ ) {
			
			qa[i] = (int)(Math.random()*10);
			System.out.print( qa[i] + " " );
		}
		System.out.println("\n");
		 
		System.out.print("QB: ");     
		for ( int i = 0 ; i < qb.length ; i++ ) {
			
			qb[i] = (int)(Math.random()*10);
			System.out.print( qb[i] + " " );
		}
		System.out.println("\n");
		
		// Intercalacao
		/*
		int j = 0;		      
		for ( int i = 0 ; i < qa.length ; i++ ) {
			
			qc[j++] = qa[i];
			qc[j++] = qb[i];
		}*/
		
		int j = 0;
		for ( int i = 0 ; i < qc.length ;  ) {
			
			qc[i++] = qa[j];
			qc[i++] = qb[j];
			j++;
		}
		
		
		System.out.print("QC: ");
		for ( int i = 0 ; i < qc.length ; i++ ) {
			
			System.out.print( qc[i] + " " );
		}
		System.out.println("\n");

		
	}
}
