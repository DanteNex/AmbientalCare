public class Vidro extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Vidro() {
		this.categoria = "Vidro";
		this.decomposicao = "1 milhão de anos";
		this.metodoReciclagem = "Uma das etapas mais importantes no processo de reciclagem de vidro é a separação e coleta seletiva do vidro. Nas empresas, condomínios e \noutros locais existem espaços destinados ao descarte de vidro.\r\n" + 
				"\r\n" + 
				"Uma das primeiras etapas no processo de reciclagem do vidro é sua separação por cores (âmbar, verde, translúcido e azul) e tipos (lisos, ondulados, vidros de janelas, de copos, etc.). \nEsta separação é de extrema importância para a fabricação de novos objetos de vidro, pois garante suas características e qualidades.\r\n"; 
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