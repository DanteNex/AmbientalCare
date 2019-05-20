public class Plastico extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Plastico() {
		this.categoria = "Pl�stico";
		this.decomposicao = "450 anos";
		this.metodoReciclagem = "Uma das etapas mais importantes no processo de reciclagem de pl�stico � a separa��o e coleta seletiva do Pl�stico. \nNas empresas, condom�nios e outros locais existem espa�os destinados ao descarte de pl�stico. Esta � uma atitude extremamente positiva e ecologicamente correta.\r\n" + 
				"Tipos de pl�sticos recicl�veis (exemplos)\r\n" + 
				"- Garrafas PET\r\n" + 
				"- Potes Pl�sticos diversos\r\n" +  
				"- Tampas de embalagens\r\n" + 
				"- Sacos pl�sticos diversos\r\n" + 
				"- Canos de PVC\r\n" + 
				"- Componentes pl�sticos usados em eletrodom�sticos\r\n" + 
				"- Engradados de bebida\r\n" + 
				"- Para-choques de carros\r\n" + 
				"- Copos descart�veis\r\n" + 
				"- Pl�sticos de brinquedos\r\n" + 
				"- Pe�as pl�sticas de autom�veis\r\n" + 
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