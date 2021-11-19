/*
 *3) Declarar uma variável do tipo String com seu valor inicial igual a branco  e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z, uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */


public class L7Ex02V3Alfab {
	
	public static void main (String[] args) {
		
		String texto = "";
		
		char letra = 'A';
		
		for (int i = 0 ; i < 26 ; i++){ //A maiusculo = 65
		
			
			texto = texto + (char)( letra + i ) ; //converter para char para não sairem em numeros
			System.out.println (texto); //acumula letra a letra
		}
		
		System.out.println ( ">>> " + texto);
		
	}
}

