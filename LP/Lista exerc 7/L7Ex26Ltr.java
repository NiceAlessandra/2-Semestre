/*
26) Escreva um programa para gerar aleatoriamente uma String com 100 letras minúsculas.
Apresentar, caso haja:
- as letras do alfabeto que NÃO constam na sequência;
- a maior sequência de letras repetidas;
- a maior sequência de vogais; e
- a maior sequência alfabética.
 * 
 */


public class L7Ex26Ltr {
	
	public static void main (String[] args) {
		
		String texto  = "", 
		       saida  = "",
		       vogais = "aeiou",
		       alfabeto = "";
		int    contador, 
		       maior;
		
		for ( int i = 'a' ; i <= 'z' ; i++ ) {
			
			alfabeto += (char) i;
		}
		
		for ( int i = 1 ; i <= 1000 ; i++ ) {
			
			// 0 ~ 25 .. 'a' ~ 'z'
			texto += (char)('a' + Math.random() * 26); 
		}
		
		System.out.println ( texto );
		
		System.out.println ( "As letras do alfabeto que NÃO constam na sequência" );
		
		for ( int letra = 'a' ; letra <= 'z' ; letra++ ) {
			
			contador = 0;
			
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				
				if ( letra == texto.charAt ( i ) ) {
					
					contador++;
				}
			}
			
			if ( contador == 0 ) {
				
				saida += (char) letra + " ";
			}
		}
		
		if ( saida.isEmpty() ) {
			
			System.out.println(">>> Todas letras do alfabeto foram enconitradas no texto!");
		
		} else {
			
			System.out.println(">>> " + saida );
		}
		
		System.out.println ();
		
		System.out.println ( "A maior sequência de letras repetidas" );
		
		maior = 0;
		
		for ( int letra = 'a' ; letra <= 'z' ; letra++ ) {
			
			contador = 0;
			
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				
				if ( letra == texto.charAt ( i ) ) {
					
					contador++;
				
				} else {
					
					contador = 0;
				}
				
				if ( contador > maior ) {
					
					maior = contador;
				}
			}
		}
		
		System.out.println(">>> " + maior);
		
		System.out.println();
		
		
		
		
		System.out.println ( "A maior sequência de vogais (primeira forma)" );
		// aaa ou ee ou iiii ou oo ou uuu 
		
		maior = 0;
		
		for ( int letra = 0 ; letra < vogais.length() ; letra++ ) {
			
			contador = 0;
			
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				
				if ( vogais.charAt ( letra ) == texto.charAt ( i ) ) {
					
					contador++;
				
				} else {
					
					contador = 0;
				}
				
				if ( contador > maior ) {
					
					maior = contador;
				}
			}
		}
				
		System.out.println(">>> " + maior);
		
		System.out.println();
		
		
		
		System.out.println ( "A maior sequência de vogais (segunda forma)" );
		// a
		// ae
		// aei
		// aeio
		// aeiou 
		// e
		// ei
		// eio
		// eiou
		
		maior = 0;
		
		for ( int letra = 0 ; letra < vogais.length() ; letra++ ) {
			
			contador = 0;
			
			String procurado = vogais.substring(0, vogais.length() - letra); // aeiou
			
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				
				if ( texto.substring(i).startsWith(procurado) ) {
					
					contador = procurado.length();
				
				} else {
					
					contador = 0;
				}
				
				if ( contador > maior ) {
					
					maior = contador;
				}
			}
		}
				
		System.out.println(">>> " + maior);
		
		System.out.println();
		
		
		System.out.println ( "A maior sequência alfabética" );
		// a
		// ab
		// abc
		// abcd
		// ...
		
		maior = 0;
		
		for ( int letra = 0 ; letra < alfabeto.length() ; letra++ ) {
			
			contador = 0;
			
			String procurado = alfabeto.substring(0, alfabeto.length() - letra); // aeiou
			
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				
				if ( texto.substring(i).startsWith(procurado) ) {
					
					contador = procurado.length();
				
				} else {
					
					contador = 0;
				}
				
				if ( contador > maior ) {
					
					maior = contador;
				}
			}
		}
				
		System.out.println(">>> " + maior);
		
		System.out.println();
	}
}
