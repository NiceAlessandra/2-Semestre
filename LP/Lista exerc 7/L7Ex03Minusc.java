/*
 3) Declarar uma variável do tipo String com seu valor inicial igual a branco e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */


public class L7Ex03Minusc {
	
	public static void main (String[] args) {
		
		String saida = "";
		
		for ( int letra = 'a' ; letra <= 'z' ; letra++){
			
			saida += (char)letra ;
			
			}
		System.out.println (" >>> " + saida);
	}
	
}

