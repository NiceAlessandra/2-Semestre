/*
 4) Declarar uma variável do tipo String com seu valor inicial igual a branco () e a
seguir atribuir os caracteres numéricos (0123456789), um-a-um, as primeiras dez
posições da variável String. Imprimir o resultado. 
 */


public class L7Ex04Carac {
	
	public static void main (String[] args) {
		
		String saida = "";
		
		for ( int numero = 0 ; numero <= 9 ; numero++){
			
			saida += numero;
			
			}
		System.out.println (" >>> " + saida);
	}
	
}
