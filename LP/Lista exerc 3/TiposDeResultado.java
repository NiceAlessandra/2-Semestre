/*
  5  - Crie um arquivo chamado TiposDeResultado.java. 
  * Complete o código a seguir, substituindo a seqüência xxxxx
  * com os tipos primitivos numéricos da linguagem Java. 
  * Utilize sempre o tipo que ocupa o menor espaço na memória. 
 }
}
 */


public class TiposDeResultado {
	
	public static void main (String[] args) {
		
		byte   a = 1;
		short  b = 2;
		double c = 3.14;
 
		byte  d = (byte) (a + b);
		short e = (short)(b + c);
		
 
			System.out.println(d); // saida  3 
			System.out.println(e); // saida  5
		
	}
}

