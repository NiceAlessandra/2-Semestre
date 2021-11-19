/*
 Crie a classe DeclaracaoVariaveis.java e dentro do método main declare, inicialize e
utilize as variáveis como definido abaixo:
- Declare uma variável do tipo String para armazenar o nome de uma pessoa;
- Declare uma variável do tipo String para armazenar a data de nascimento de uma pessoa;
- Declare uma variável do tipo String para armazenar o rg de uma pessoa;
- Declare uma variável do tipo String para armazenar o sexo da pessoa utilizando a seguinte
regra: MASCULINO (M) e FEMININO (F)
- Declare uma variável do tipo double para armazenar o salário da pessoa;
- Imprima todos os valores de maneira a obter a seguinte saída:
O Senhor(a) <nome da pessoa> portador(a) do RG número <rg>, nascido em <data nascimento>,
do sexo <sexo>, está registrado com o salário de R$ <salario>.
 */


public class DeclaracaoVariaveis {
	
	public static void main (String[] args) {
		String nome;
		String dataDeNascimento, rg, sexo;
		double salario;
		
		nome= "Joseverson";
		dataDeNascimento= "12/06/1943";
		rg= "01.000.001-1";
		sexo= "Masculino";
		salario= 10000.00;
		System.out.print("O Senhor(a) " + nome + " nascido em  " + dataDeNascimento + " portador (a) do RG numero " 
		+ rg +" nascido em " + dataDeNascimento + " do sexo " + sexo + " esta registrado com o salario de R$ " + salario + "."); 
		
						
		
			}
}

