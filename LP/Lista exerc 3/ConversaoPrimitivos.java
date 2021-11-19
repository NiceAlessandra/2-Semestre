/* 
 * 1 - Crie um arquivo chamado ConversaoPrimitivos.java. 
 * Para eliminar os erros de compilação, complete os 
 * espaços marcados por xxxxx do código abaixo quando 
 * necessário. 
*/
public class ConversaoPrimitivos {
	
	public static void main (String[] args) {
		int    a =  10;
		long   b =          a; // não precisa usar cast               // saida 10
		int    c = (int)    b; // int recebendo por cast um long      // saida 10
		float  d = (float)  b; // float recebendo por cast um int     // saida 10.0
		short  e = (short)  a; // short recebendo por cast um int     // saida 10
		double f =          d; // não precisa usar cast               // saida 10.0
		Long   g =  b;         // é uma classe wrapper???             // saida 10
		long   h =  g;         // long recebendo um long              // saida 10
		      
        	System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
	}
}

