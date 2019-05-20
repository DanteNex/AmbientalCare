
public class Organico extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Organico() {
		this.categoria = "Orgânico";
		this.decomposicao = "1 a 2 anos";
		this.metodoReciclagem = "Este tipo de lixo precisa ser tratado com todo cuidado, pois pode gerar consequências indesejadas para \nos seres humanos como, por exemplo, mau cheiro, desenvolvimento de bactérias e fungos, aparecimento de ratos e insetos. Nestes casos, várias doenças podem surgir, através da contaminação do solo e da água. \nNo processo de decomposição (apodrecimento) do lixo orgânico é produzido o chorume, que é um líquido viscoso e de cheiro forte e desagradável. \nO chorume também é um elemento que pode provocar a contaminação do solo e das águas (rios, lagos, lençóis freáticos).\r\n" + 
				"\r\n" + 
				"";
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
