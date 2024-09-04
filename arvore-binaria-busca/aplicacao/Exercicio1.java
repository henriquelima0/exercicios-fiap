package aplicacao;

import java.util.Scanner;

import arvores.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar");
			System.out.println("3 - Apresenta quantidade de nos");
			System.out.println("4 - Consultar nos");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa!");
				break;
			case 1:
				System.out.print("Informe valor a ser inserido na ABB: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n*** Apresentacao da ABB ***");
				abb.show(abb.root);
				System.out.println();
				break;
			case 3:
				System.out.println(" A quantidade de nos na ABB: "+ abb.contaNos(abb.root, 0));
				break;
			case 4:
				System.out.println("Informe o valor a ser pesquisado na ABB: ");
				valor = le.nextInt();
				if(abb.consulta(abb.root, valor))
					System.out.println("Valor presente na ABB");
				else
					System.out.println("Valor NÃO está presente na ABB");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);
		le.close();

	}

}
