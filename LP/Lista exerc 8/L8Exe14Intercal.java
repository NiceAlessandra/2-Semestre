/*
14) Escreva um programa para ler um vetor de inteiros S de 10 elementos e
imprimir o vetor lido. Ler outro vetor de inteiros T de 15 elementos e
imprimir este vetor lido. Construir outro vetor U com todos os elementos
lidos de S e de T e imprimir este vetor obtido. (Intercalação) 
 */


public class L8Exe14Intercal {
	
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
