/*
23) Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o
sobrenome do nome completo informado. Por exemplo, para o nome completo: Omero
Francisco Bertol, o programa deverá fornecer como resultado: Bertol.
 */
import java.util.Scanner;

public class L7Ex23Sobren {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String nome = "";
		String sobrenome = nome.substring(nome.lastIndexOf(" ") + 1);
			
		System.out.print ("Entre com um nome: ");
		nome = leiaStr.nextLine ();
		
		     
	    System.out.println (nome.substring(nome.lastIndexOf(" ") ) );
	}
}


	    
		
