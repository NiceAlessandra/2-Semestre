/*
27) Escreva um programa para solicitar ao usuário duas Strings. Se forem de mesmo tamanho,
concatenar seus caracteres, caso contrário, informar ao usuário.
Ex:
Entrada 1: banana
Entrada 2: uva
* Saída: Erro! Entradas de tamanhos diferentes.
Entrada 1: bananas
Entrada 2: pitanga
Saída: bpaintaannagsa
 */

import java.util.Scanner;

public class L7Ex27UvaBan {
	
public static void main (String[] args) {
	
		Scanner leiaStr = new Scanner (System.in);
		
		String entrada1 = " ";
		String entrada2 = " ";
						
		int inicio1 = 0,
			inicio2 = 0,
		    termino1 = entrada1.length() - 1,
		    termino2 = entrada2.length() - 1;
		    
			
		System.out.print ("Entre com a primeira palavra: ");
		entrada1 = leiaStr.nextLine ();
		
		System.out.print ("Entre com a segunda  palavra: ");
		entrada2 = leiaStr.nextLine ();
		
		String saida1 = "";
		String saida2 = "";
		
		while ( inicio1 <= termino1 ) {
			
			saida1 += entrada1.charAt(inicio1);
			inicio1++;
			
				if ( inicio1 <= termino1 ) {
				
					saida1 += entrada1.charAt(termino1);
					termino1--;
			}
		}
			while ( inicio2 <= termino2 ) {
			
				saida2 += entrada2.charAt(inicio2);
				inicio2++;
			
					if ( inicio2 <= termino2 ) {
				
						saida2 += entrada2.charAt(termino2);
						termino2--;
				}
			}
		{
		System.out.println("Saida: " + saida1);
				
		}
	}

}
