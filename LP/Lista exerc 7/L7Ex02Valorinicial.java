/*
 *2) Declarar uma variável do tipo String com seu valor inicial igual a branco  e a
seguir atribuir as letras maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */


public class L7Ex02Valorinicial {
	
	public static void main (String[] args) {
		
		String texto = "";
		
		for (int i = 65; i <= 90 ; i++){ //A maiusculo = 65
		
		texto = texto + (char)i ;
		System.out.println (texto); //acumula letra a letra
		}
		
		System.out.println ( ">>> " + texto);
		
	}
}

