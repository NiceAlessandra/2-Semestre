/*
9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). 
 */
import java.util.Scanner;

public class lista05Exerc09JorTrab {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double jornada          = 0;
		double horaExtra        = 0;
		double salarioHora      = 0;
		double salarioTotal     = 0;
		double salarioHoraExtra = 0;
		
		System.out.print ("Numero de horas trabalhadas no mes: ");
		jornada = leia.nextDouble();
		
		System.out.print ("Digite o salario hora R$: ");
		salarioHora = leia.nextDouble ();
		
		if (jornada > 160){
			horaExtra = jornada - 160;
			salarioHoraExtra = horaExtra *(salarioHora*0.5);
			salarioTotal = salarioHoraExtra + (jornada * salarioHora);
			
			System.out.println ("Horas extras: " + horaExtra);
			System.out.println ("Salario total R$: " + salarioTotal);
			}
			else {
			salarioTotal = jornada * salarioHora;	
			System.out.println ("Salario total R$: " + salarioTotal);
				}
			
	}
}

