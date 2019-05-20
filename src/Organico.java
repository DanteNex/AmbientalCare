
public class Organico extends Lixo {
	private String categoria, decomposicao, metodoReciclagem;

	Organico() {
		this.categoria = "Org�nico";
		this.decomposicao = "1 a 2 anos";
		this.metodoReciclagem = "Este tipo de lixo precisa ser tratado com todo cuidado, pois pode gerar consequ�ncias indesejadas para \nos seres humanos como, por exemplo, mau cheiro, desenvolvimento de bact�rias e fungos, aparecimento de ratos e insetos. Nestes casos, v�rias doen�as podem surgir, atrav�s da contamina��o do solo e da �gua. \nNo processo de decomposi��o (apodrecimento) do lixo org�nico � produzido o chorume, que � um l�quido viscoso e de cheiro forte e desagrad�vel. \nO chorume tamb�m � um elemento que pode provocar a contamina��o do solo e das �guas (rios, lagos, len��is fre�ticos).\r\n" + 
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
