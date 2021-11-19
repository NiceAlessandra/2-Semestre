/*
01 - Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um 
* número aleatório com valores entre 0 e 10 (inclusos) e atribua a 
* variável nota. O programa deve exibir a mensagem REPROVADO quando 
* a nota do aluno for menor do que 6 ou APROVADO caso contrário. 
 */
 import java.util.Scanner;

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int nota = (int)(Math.random() * 11);
		
		System.out.println ("Sua nota foi: " + nota);
		
		
		if (nota >= 6){
			System.out.print ("Aprovado");
	}
		else {
				System.out.print ("Reprovado");
}
}
}
