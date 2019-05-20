public class Papel extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Papel() {
		this.categoria = "Papel";
		this.decomposicao = "3 a 6 meses";
		this.metodoReciclagem = "Uma das etapas mais importantes no processo de reciclagem de papel � a separa��o e coleta seletiva do papel. \nNas empresas, condom�nios e outros locais existem espa�os destinados ao descarte de papel. Tipos de papel que podem ser reciclados: papel sulfite, \npapel�o, caixas de embalagens de produtos, papel de presente, folhas de caderno, entre outros.";
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