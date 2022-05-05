class NvProduto {
	private int id = 0;
	private String nome = "";
	private Double preco = 0.0; 

	//Getters and Setters:

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public int getId() {
		return id;
	}

	//----------------------------

	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public void setPreco(Double novoPreco) {
		preco = novoPreco;
	}

	public void setId(int novoId) {
		id = novoId;
	}
}