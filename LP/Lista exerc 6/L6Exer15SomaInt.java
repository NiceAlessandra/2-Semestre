/*
 15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor 
que o primeiro valor lido, ou seja, deve-se testá-los.
 */

import java.util.Scanner;

public class L6Exer15SomaInt {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int primeiroValor = 0;
		int segundoValor = 0;
		int soma     = 0;
		
			System.out.print ("Digite o primeiro valor: ");
			primeiroValor = leia.nextInt ();
			System.out.print ("Digite o segundo  valor: ");
			segundoValor = leia.nextInt ();
		
		if ( segundoValor > primeiroValor){
			
			soma = primeiroValor + segundoValor;
			System.out.println ("Soma dos dois numeros: " + soma);
		
		} else {
			System.out.println ("Digite o menor valor primeiro!!!");
		} 
	}
}
