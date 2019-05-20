import javax.swing.*;
public class AmbientalCare {
	public static void main(String args[]) {
		int opt;
		String texto;
		String[] botoes = {"Papel", "Vidro", "Metal", "Pl�stico", "Eletr�nico", "Radioativo", "Org�nico"};

		JOptionPane.showMessageDialog(null, "Bem vindo ao AmbientalCare", "AmbientalCare", JOptionPane.PLAIN_MESSAGE);
 		opt = JOptionPane.showOptionDialog(null, "Escolha o tipo de lixo para ser reciclado:", "AmbientalCare", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes);
		
		switch(opt) {
			case 0:
				Papel papel = new Papel();
				texto = "Categoria: " + papel.getCategoria() + "\nDecomposi��o: " + papel.getDecomposicao() + "\nM�todo de Reciclagem: " + papel.getMetodoReciclagem();
			break;
			case 1:
				Vidro vidro = new Vidro();
				texto = "Categoria: " + vidro.getCategoria() + "\nDecomposi��o: " + vidro.getDecomposicao() + "\nM�todo de Reciclagem: " + vidro.getMetodoReciclagem();
			break;
			case 2:
				Metal metal = new Metal();
				texto = "Categoria: " + metal.getCategoria() + "\nDecomposi��o: " + metal.getDecomposicao() + "\nM�todo de Reciclagem: " + metal.getMetodoReciclagem();
			break;
			case 3:
				Plastico plastico = new Plastico();
				texto = "Categoria: " + plastico.getCategoria() + "\nDecomposi��o: " + plastico.getDecomposicao() + "\nM�todo de Reciclagem: " + plastico.getMetodoReciclagem();
			break;
			case 4:
				Eletronico eletronico = new Eletronico();
				texto = "Categoria: " + eletronico.getCategoria() + "\nDecomposi��o: " + eletronico.getDecomposicao() + "\nM�todo de Reciclagem: " + eletronico.getMetodoReciclagem();
			break;
			case 5:
				Radioativo radioativo = new Radioativo();
				texto = "Categoria: " + radioativo.getCategoria() + "\nDecomposi��o: " + radioativo.getDecomposicao() + "\nM�todo de Reciclagem: " + radioativo.getMetodoReciclagem();
			break;
			case 6:
				Organico organico = new Organico();
				texto = "Categoria: " + organico.getCategoria() + "\nDecomposi��o: " + organico.getDecomposicao() + "\nM�todo de Reciclagem: " + organico.getMetodoReciclagem();
			break;
			default:
				texto = "Por favor, entre com uma op��o v�lida.";
			break;
		}

		JOptionPane.showMessageDialog(null, texto, "AmbientalCare", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void msgBox(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String inputBox(String msg) {
		return JOptionPane.showInputDialog(null, msg);
	}
	
	public static void prnt(String msg) {
		System.out.println(msg);
	}
}