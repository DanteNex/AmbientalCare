public class Metal extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;
	
	Metal() {
		this.categoria = "Metal";
		this.decomposicao = "Indeterminado";
		this.metodoReciclagem = "Uma das etapas mais importantes no processo de reciclagem de metal é a separação e coleta seletiva do metal. \nNas empresas, residências e outros locais existem espaços destinados ao descarte de metal. Separação no processo de reciclagem\r\n" + 
				"Na primeira fase do processo de reciclagem de metal, os mesmos são separados por tipos e características. Desta forma, alumínio, cobre, aço e ferro passam por processos de reciclagem diferentes.";
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDecomposicao() {
		return decomposicao;
	}

	public void setDecomposicao(String decomposicao) {
		this.decomposicao = decomposicao;
	}

	public String getMetodoReciclagem() {
		return metodoReciclagem;
	}

	public void setMetodoReciclagem(String metodoReciclagem) {
		this.metodoReciclagem = metodoReciclagem;
	}


}