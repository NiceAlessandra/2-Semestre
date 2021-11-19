/*
25) Escreva um programa validador de senhas. A regra para a criação de uma senha forte é
que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras
minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter
pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2
símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha
que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha
passou pelos quesitos ou não.
Ex:
Senha: senha123
Regras
Tamanho 10: 8 (x)
Letras 3: 5 (ok)
Números 3: 3 (ok) 
Símbolos 2: 0 (x)
Senha reprovada! Tente novamente.
* 
Senha: Bgp2Ip4*@1
Regras
Tamanho 10: 10 (ok)
Letras 3: 5 (ok)
Números 3: 3 (ok) 
Símbolos 2: 2 (ok)
Senha aprovada! Parabéns!
 */

import java.util.Scanner;

public class L7Ex25Senha {
	
public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String senha = "";
		int contTamanho  = 0;
		int contMaiusculas = 0;
		int	contMinusculas = 0;
		int	contNumeros = 0;
		int simbolos = 0 ;
		int aceite   = 0;
		
		System.out.print ("Digite uma senha forte: ");
		senha = leiaStr.nextLine ();
		
		
		for (int i = 1 ; i < senha.length(  ) ; i ++) {
			System.out.println (senha.charAt (i));
			
			if ( senha.length ( ) > 10 ){
				contTamanho++;	
				
				System.out.println ("Senha reprovada! Tente novamente!");
					
			}
			
			if ( senha.charAt(i) >= 'A' && senha.charAt (i) <= 'Z'){
				contMaiusculas++;			
			}
			if ( senha.charAt(i) >= 'a' && senha.charAt (i) <= 'z'){
				contMinusculas++;			
			}
			if ( senha.charAt(i) >= '0' && senha.charAt (i) <= '9'){
				contNumeros++;			
			}
					
			} 
		System.out.println ("Regras: ");
		System.out.println ("Tamanho  - 10 carac.: " + contTamanho + " ( " + aceite + " ) ");
		System.out.println ("Letras   - 03 carac.(Maiusculas): " + contMaiusculas + " ( " + aceite + " ) ");
		System.out.println ("Letras   - 03 carac.(Minusculas): " + contMinusculas + " ( " + aceite + " ) ");
		System.out.println ("Numeros  - 03 carac.: " + contNumeros + " ( " + aceite + " ) ");
		System.out.println ("Simbolos - 02 carac.: " + simbolos + " ( " + aceite + " )");
				System.out.print ("Senha aprovada! Parabens!");
		}
		
}

