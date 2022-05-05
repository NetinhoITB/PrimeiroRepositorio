import java.text.NumberFormat;

class Cardapio {
	
	/*public static*/ NvProduto[] listaDeProdutos = new NvProduto[1];
	String letreiro, letreiro1, letreiro2 = "";
	Runtime rt = Runtime.getRuntime();

	//listaDeProdutos[0] = new NvProduto();

	public Cardapio (int qtdProdutos) {
		NvProduto[] listaDeProdutos = new NvProduto[qtdProdutos];

		for (int i=0; i<listaDeProdutos.length; i++) {
			listaDeProdutos[i] = new NvProduto();
		}
	}

	void adicionarProduto (NvProduto produto) {
		if (!listaDeProdutos[listaDeProdutos.length-1].getNome().equals("")) { 
			NvProduto[] listaDeProdutos2 = new NvProduto[listaDeProdutos.length];

			for (int i=0; i<listaDeProdutos2.length; i++) {
				listaDeProdutos2[i] = new NvProduto();
			}

			listaDeProdutos2 = listaDeProdutos;
			listaDeProdutos = null;
			listaDeProdutos = new NvProduto[listaDeProdutos2.length+1];
			System.arraycopy(listaDeProdutos2, 0, listaDeProdutos, 0, listaDeProdutos2.length);
			//Cardapio (listaDeProdutos2.length+1);
			produto.setId(listaDeProdutos.length);
			listaDeProdutos[listaDeProdutos.length-1] = produto;
			System.out.println(("(id "+produto.getId()+" - Adicionado)").toUpperCase());
			rt.gc();
		}
		else {
			produto.setId(listaDeProdutos.length);
			listaDeProdutos[listaDeProdutos.length-1] = produto;
			System.out.println(("(id "+produto.getId()+" - Adicionado)").toUpperCase());
		}
	}

	NvProduto getProduto (int idProduto) {
		NvProduto prod = null;
		for (int i=0; i<listaDeProdutos.length; i++) {
			if ((i+1) == idProduto) {
				prod = listaDeProdutos[i];
			}
		}
		return prod;
	}

	void listarProdutos() {

		System.out.println("");
		System.out.println("***** NOSSO CARDAPIO: *****");
		System.out.println("");

		for (NvProduto produto : listaDeProdutos) {
			System.out.println("----------");
			System.out.println("Produto Id = "+produto.getId()+":");
			System.out.println("Nome: "+produto.getNome());
			System.out.println("Preco: "+NumberFormat.getCurrencyInstance().format(produto.getPreco()));
			System.out.println("");
		}
		System.out.println("----------");
	}

	void buscarPrecos(int id) {

		if (listaDeProdutos[id-1].getId() == id) {
			System.out.println("");
			System.out.println("");

			letreiro = ("Prod Id-"+id+"          >>>          ");
			letreiro1 = ("|    "+NumberFormat.getCurrencyInstance().format(getProduto(id).getPreco())+" ("+(getProduto(id).getNome()).toUpperCase()+")    |");
			letreiro2 = letreiro.concat(letreiro1);
			
			for (int i=0; i<(letreiro.length()); i++) {
				System.out.print(" ");
			}
			for (int i=0; i<(letreiro1.length()-1); i++) {
				System.out.print("-");
			}
			System.out.println("-");
			System.out.println(letreiro2);
			for (int i=0; i<(letreiro.length()); i++) {
				System.out.print(" ");
			}
			for (int i=0; i<(letreiro1.length()-1); i++) {
				System.out.print("-");
			}
			System.out.println("-");
		}
		else {
			System.out.println("Prod Id-"+id+" nao encontrado!");
		}
	}
}
