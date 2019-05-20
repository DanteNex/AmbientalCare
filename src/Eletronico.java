public class Eletronico extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Eletronico() {
		this.categoria = "Eletrônico";
		this.decomposicao = "Indeterminado";
		this.metodoReciclagem = "No caso de celulares, antes de ir atrás de um local para reciclagem, \nveja se a sua operadora presta este serviço. Algumas contam até com postos de coleta para baterias e aparelhos.\r\n" + 
				"Outra alternativa é dar uma olhada no Mapa da Reciclagem do Cempre (O Compromisso Empresarial para Reciclagem), que lista sucateiros e catadores de lixo reciclável por região e municípios, ou então, \nrecorrer a ONGs especializadas da sua cidade que indicam endereços onde você pode dar um fim mais sustentável ao seu lixo.";
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