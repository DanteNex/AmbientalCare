public class Plastico extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Plastico() {
		this.categoria = "Plástico";
		this.decomposicao = "450 anos";
		this.metodoReciclagem = "Uma das etapas mais importantes no processo de reciclagem de plástico é a separação e coleta seletiva do Plástico. \nNas empresas, condomínios e outros locais existem espaços destinados ao descarte de plástico. Esta é uma atitude extremamente positiva e ecologicamente correta.\r\n" + 
				"Tipos de plásticos recicláveis (exemplos)\r\n" + 
				"- Garrafas PET\r\n" + 
				"- Potes Plásticos diversos\r\n" +  
				"- Tampas de embalagens\r\n" + 
				"- Sacos plásticos diversos\r\n" + 
				"- Canos de PVC\r\n" + 
				"- Componentes plásticos usados em eletrodomésticos\r\n" + 
				"- Engradados de bebida\r\n" + 
				"- Para-choques de carros\r\n" + 
				"- Copos descartáveis\r\n" + 
				"- Plásticos de brinquedos\r\n" + 
				"- Peças plásticas de automóveis\r\n" + 
				"- Embalagens de produtos de limpeza";
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