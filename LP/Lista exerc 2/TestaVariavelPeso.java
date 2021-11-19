/*
8 - Crie um arquivo chamado TestaVariavelPeso.java. 
* Implemente um programa em Java que declare uma 
* variável do tipo double chamada peso. Essa variável 
* deve ser inicializada com o valor do seu peso. No 
* final, exiba o valor dessa variável na saída padrão 
* usando o println() e o printf(). 
 */


public class TestaVariavelPeso {
	
	public static void main (String[] args) {
		
		double peso = 63.2;
		
		System.out.println ("Peso: " + peso); //padrão americano
		System.out.printf  ("Peso: %.3f" , peso);  // padrão do meu SO
		
	}
}

