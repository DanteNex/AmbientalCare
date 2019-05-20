public class Vidro extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Vidro() {
		this.categoria = "Vidro";
		this.decomposicao = "1 milh�o de anos";
		this.metodoReciclagem = "Uma das etapas mais importantes no processo de reciclagem de vidro � a separa��o e coleta seletiva do vidro. Nas empresas, condom�nios e \noutros locais existem espa�os destinados ao descarte de vidro.\r\n" + 
				"\r\n" + 
				"Uma das primeiras etapas no processo de reciclagem do vidro � sua separa��o por cores (�mbar, verde, transl�cido e azul) e tipos (lisos, ondulados, vidros de janelas, de copos, etc.). \nEsta separa��o � de extrema import�ncia para a fabrica��o de novos objetos de vidro, pois garante suas caracter�sticas e qualidades.\r\n"; 
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