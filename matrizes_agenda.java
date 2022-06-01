package exercicios_prof_ohata;

import java.util.Scanner;

public class matrizes_agenda {

	public static void main(String[] args) {
		//Declarar variaveis 
		int coluna, linha; //Inica coluna e linha 
		
		String matriz[][] = new String[2][5];//Inicia matriz e atribui o tamanho dela
		
		Scanner input = new Scanner(System.in);//Declara scanner para a entrada de dados
		
		//For para atribuir valores para a matriz
		for (linha = 0; linha < 2; linha++) {
			
			for (coluna = 0; coluna < 5; coluna++) {
				
				//Entrada de dados das linhas e colunas
				System.out.printf("Digite o nome para ser registrado: ");
				matriz[linha][coluna] = input.next();
				
				System.out.printf("Digite o endereco para ser registrado: ");
				matriz[linha][coluna] = input.next();
				
				System.out.println("Digite o codigo postal para ser registrado: ");
				matriz[linha][coluna] = input.next();
				
				System.out.println("Digite o bairro para ser registrado: ");
				matriz[linha][coluna] = input.next();
				
				System.out.println("Digite o telefone para ser registrado: ");
				matriz[linha][coluna] = input.next();
			}	
			
		}
		//Percorre matriz e exibi seus valores
		for (linha = 0; linha < 2; linha++) {
			
			//Quebra linha para formar a tabela
			System.out.printf("\n");
			
			for (coluna = 0; coluna < 5; coluna++) {
				
				//Exibir valor da matriz
				System.out.printf("%s",matriz[linha][coluna]);
			}
		}

	}

}
