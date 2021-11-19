/*
3 - Crie um arquivo chamado ExibeNome.java. Implemente 
* um programa em Java que declare uma variável do tipo
*  String chamada nome. Essa variável deve ser associada 
* o seu nome. Ele deve ser escrito entre aspas. Por fim, 
* exiba o valor associado a essa variável na saída padrão.
 */


public class ExibeNome {
	
	public static void main (String[] args) {
	
	String nome;
	nome = "\"Nice\""; // faltaram as aspas na saída
	
		System.out.println ("Meu nome: " + nome);
		
	}
}

