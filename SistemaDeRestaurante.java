import java.util.Scanner;

public class SistemaDeRestaurante {
	private static Cardapio cardapio = new Cardapio(1);
	private static String letreiro = "";

	static void exibirAsOpcoesDoSistema() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("");

		letreiro = ("##### POR FAVOR, ESCOLHA UMA DAS OPCOES: #####");
		
		for (int i=0; i<(letreiro.length()-1); i++) {
			System.out.print("#");
		}
		System.out.println("#");
		System.out.println(letreiro);
		for (int i=0; i<(letreiro.length()-1); i++) {
			System.out.print("#");
		}
		System.out.println("#");

		System.out.println("");
		System.out.println("1-Cadastrar novo produto");
		System.out.println("2-Exibir o cardapio");
		System.out.println("3-Buscar preco do produto dado");
		System.out.print("4-Sair do sistema\n\n=>>");

		int opcao = scanner.nextInt();

		if (opcao < 1 || opcao > 4) {
			System.out.println("Opcao Invalida! Tente novamente.");
			exibirAsOpcoesDoSistema();
		}
		else {
			switch (opcao)
			{
				case 1 : cadastrarNovoProduto(); break;
				case 2 : exibirOCardapio(); break;
				case 3 : buscarPrecoProduto(); break;
				case 4 : sairDoSistema(); break;
				//default : ;
			}
		}
	}

	static void cadastrarNovoProduto() {
		System.out.println("");
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		NvProduto produto = new NvProduto();

		System.out.println("***** CADASTRO DE NOVO PRODUTO *****");
		System.out.println("");
		System.out.println("Qual o nome do produto?");
		produto.setNome(scanner.next());
		System.out.println("Qual o preco do produto?");
		produto.setPreco(scanner.nextDouble());

		cardapio.adicionarProduto(produto);
	}

	static void exibirOCardapio() {
		
		cardapio.listarProdutos();
	}

	static void buscarPrecoProduto() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("***** BUSCA DE PRECO DE PRODUTO *****");
		System.out.println("");
		System.out.println("Por favor, forneca o codigo (Id) do produto, para obter o preco desejado.");
		int id = scanner.nextInt();
		cardapio.buscarPrecos(id);
	}

	static void sairDoSistema() {
		System.exit(0);
	}










	public static void main (String[] args) {
		cardapio.listaDeProdutos[0] = new NvProduto();
		SistemaDeRestaurante sistemaDeRestaurante = new SistemaDeRestaurante();

		while (true)
		{
			sistemaDeRestaurante.exibirAsOpcoesDoSistema();
		}
	}
}
