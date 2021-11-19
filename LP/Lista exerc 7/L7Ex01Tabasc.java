/*
 1) Exibir na tela os caracteres da tabela de códigos ASCII (American Standard Code for
Information Interchange).
 */


public class L7Ex01Tabasc {
	
	public static void main (String[] args) {
		
		
		for (int i = 0 ; i <=255 ; i++) { // somente os 256 primeiros caracteres
			
			System.out.print ( i + "  -  " + (char) i );
			
			}
	}
}

