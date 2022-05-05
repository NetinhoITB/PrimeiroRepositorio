import java.util.Scanner;
import java.io.IOException;

public class CadastroDeProdutos {
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner (System.in);
		Produto[] produtos = new Produto[10];

		System.out.println("");
		System.out.println("&&&&& CADASTRO DOS PRODUTOS: &&&&&");
		System.out.println("");

		for (int i=0; i<produtos.length; i++) {
			produtos[i] = new Produto();

			System.out.println("PRODUTO "+(i+1)+":");
			System.out.println("Nome do produto:");
			produtos[i].setNome(scanner.next());
			System.out.println("Preco do produto:");
			produtos[i].setPreco(scanner.nextDouble());
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Digite qualquer tecla para continuar e ver a lista\ndos produtos cadastrados.");
		//A linha 27 (abaixo), como o import IOException e o adendo à declaração do método main vão me servir para obter uma pausa na execução do programa.
		System.in.read();

		System.out.println("***** LISTA DE PRODUTOS CADASTRADOS: *****");
		System.out.println("");

		for (int i=0; i<produtos.length; i++) {
			System.out.println("PRODUTO "+(i+1)+":");
			System.out.println("Id do Produto: "+i);
			System.out.println("Nome do produto: "+produtos[i].getNome());
			System.out.println("Preco do produto: "+produtos[i].getPreco());
			System.out.println("");
		}
	}
}