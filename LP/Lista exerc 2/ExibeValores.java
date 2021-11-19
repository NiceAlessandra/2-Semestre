/*
4 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. Defina os nomes que
achar mais apropriado para essas variáveis. Por fim, exiba os valores dessas variáveis na saída
padrão. 
 */

public class ExibeValores {
	
	public static void main (String[] args) {
		
		byte  b = 19;
		short s = 1571;
		int   i = 100000;
		long  l = 2147483648L;
		double numero = 3.14;
		boolean bo = true;
		char letra = 'k';
		
		System.out.println("Byte: "  + b);
		System.out.println("Short: " + s);
		System.out.println("Int: "   + i);
		System.out.println("Long: "  + l);
		System.out.println("Double: "  + numero);	
		System.out.println ("PI = " +  Math.PI );	
		System.out.println ("True = " + bo );
		System.out.println ("Letra = " + letra);
		
	}
}

