/*
11) Escreva um programa em Java para ler o número de alunos 
* existentes em uma turma e, após isto, ler as 
notas destes alunos, calcular e escrever a média aritmética dessas notas lidas. 
 */
import java.util.Scanner;
public class L6Exer11Notas {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int   alunos  = 0; 
		int    notas  = 0; 
		int     soma  = 0;
		double media  = 0;
		int contador  = 1;
		
		System.out.print ("Digite o numero de alunos: ");
			alunos = leia.nextInt ();
		
		while ( contador <= ){
			System.out.print ("Digite as notas do aluno: ");
			notas = leia.nextInt ();
			soma = soma + notas;
			contador ++;
		}
		media = (double) soma / 4; 
		System.out.println ("Media: " + media);
	}
}

