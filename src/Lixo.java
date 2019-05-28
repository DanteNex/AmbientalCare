public abstract class Lixo {
	protected String decomposicao;
	protected String categoria;
	protected String metodoReciclagem;
	
	public String getDecomposicao() {
		return decomposicao;
	}

	public void setDecomposicao(String decomposicao) {
		this.decomposicao = decomposicao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMetodoReciclagem() {
		return metodoReciclagem;
	}

	public void setMetodoReciclagem(String metodoReciclagem) {
		this.metodoReciclagem = metodoReciclagem;
	}
	
	@Override
	public String toString() {
		String desc = "Categoria: " + this.getCategoria() + "\nDecomposição: " + this.getDecomposicao() + "\nMétodo de Reciclagem: " + this.getMetodoReciclagem();
		return desc;
	}

	
}