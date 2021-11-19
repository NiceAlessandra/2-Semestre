/*
 *2) Declarar uma variável do tipo String com seu valor inicial igual a branco  e a
seguir atribuir as letras maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */


public class L7Ex02V2Alfab {
	
	public static void main (String[] args) {
		
		String texto = "";
		
		for (int i = 'A'; i <= 'Z' ; i++){ //A maiusculo = 65
		
		texto = texto + (char)i ;
		System.out.println (texto); //acumula letra a letra
		}
		
		System.out.println ( ">>> " + texto);
		
	}
}

