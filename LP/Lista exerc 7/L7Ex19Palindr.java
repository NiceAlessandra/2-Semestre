/*
19) Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a
palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan,
sos, arara, etc).
 */

import java.util.Scanner;

class L7Ex19Palindr {
	
	public static void main (String[] args) {
	  
	  Scanner leiaStr = new Scanner(System.in); 
		
	  String palavra, reverse = "";   
      
      System.out.print ("Digite uma palavra: ");  
      palavra = leiaStr.nextLine();   
      
      int length = palavra.length();   
      
      for ( int i = length - 1; i >= 0; i-- )  
      
      reverse = reverse + palavra.charAt(i);  
      
			if (palavra.equals(reverse))  
			System.out.println("Eh um palindromo: " + palavra);  
      else  
         System.out.println("Nao eh um palindromo!!: " + palavra);   
   }  
} 

