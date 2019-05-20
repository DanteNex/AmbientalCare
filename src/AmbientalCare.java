import javax.swing.*;
public class AmbientalCare {
	public static void main(String args[]) {
		int opt;
		String texto;
		String[] botoes = {"Papel", "Vidro", "Metal", "Plástico", "Eletrônico", "Radioativo", "Orgânico"};

		JOptionPane.showMessageDialog(null, "Bem vindo ao AmbientalCare", "AmbientalCare", JOptionPane.PLAIN_MESSAGE);
 		opt = JOptionPane.showOptionDialog(null, "Escolha o tipo de lixo para ser reciclado:", "AmbientalCare", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes);
		
		switch(opt) {
			case 0:
				Papel papel = new Papel();
				texto = "Categoria: " + papel.getCategoria() + "\nDecomposição: " + papel.getDecomposicao() + "\nMétodo de Reciclagem: " + papel.getMetodoReciclagem();
			break;
			case 1:
				Vidro vidro = new Vidro();
				texto = "Categoria: " + vidro.getCategoria() + "\nDecomposição: " + vidro.getDecomposicao() + "\nMétodo de Reciclagem: " + vidro.getMetodoReciclagem();
			break;
			case 2:
				Metal metal = new Metal();
				texto = "Categoria: " + metal.getCategoria() + "\nDecomposição: " + metal.getDecomposicao() + "\nMétodo de Reciclagem: " + metal.getMetodoReciclagem();
			break;
			case 3:
				Plastico plastico = new Plastico();
				texto = "Categoria: " + plastico.getCategoria() + "\nDecomposição: " + plastico.getDecomposicao() + "\nMétodo de Reciclagem: " + plastico.getMetodoReciclagem();
			break;
			case 4:
				Eletronico eletronico = new Eletronico();
				texto = "Categoria: " + eletronico.getCategoria() + "\nDecomposição: " + eletronico.getDecomposicao() + "\nMétodo de Reciclagem: " + eletronico.getMetodoReciclagem();
			break;
			case 5:
				Radioativo radioativo = new Radioativo();
				texto = "Categoria: " + radioativo.getCategoria() + "\nDecomposição: " + radioativo.getDecomposicao() + "\nMétodo de Reciclagem: " + radioativo.getMetodoReciclagem();
			break;
			case 6:
				Organico organico = new Organico();
				texto = "Categoria: " + organico.getCategoria() + "\nDecomposição: " + organico.getDecomposicao() + "\nMétodo de Reciclagem: " + organico.getMetodoReciclagem();
			break;
			default:
				texto = "Por favor, entre com uma opção válida.";
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