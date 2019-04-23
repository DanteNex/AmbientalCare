import javax.swing.*;
public class AmbientalCare {
	public static void main(String args[]) {
		String opt;
		prnt("Bem vindo ao AmbientalCare, escolha o tipo de lixo para ser reciclado:");
		prnt("1 - Papel");
		prnt("2 - Vidro");
		prnt("3 - Metal");
		prnt("4 - Plástico");
		prnt("5 - Eletrônico");
		prnt("6 - Radioativo");
		opt = JOptionPane.showInputDialog(null, "Entre com o número da opção:");
		
		switch(opt) {
			case "1":
				Papel papel = new Papel();
				prnt("Categoria: " + papel.categoria + "\nDecomposição: " + papel.decomposicao + "\nMétodo de Reciclagem:" + papel.metodoReciclagem);

			break;
			case "2":
				Vidro vidro = new Vidro();
				prnt("Categoria: " + vidro.categoria + "\nDecomposição: " + vidro.decomposicao + "\nMétodo de Reciclagem:" + vidro.metodoReciclagem);
			break;
			case "3":
				Metal metal = new Metal();
				prnt("Categoria: " + metal.categoria + "\nDecomposição: " + metal.decomposicao + "\nMétodo de Reciclagem:" + metal.metodoReciclagem);
			break;
			case "4":
				Plastico plastico = new Plastico();
				prnt("Categoria: " + plastico.categoria + "\nDecomposição: " + plastico.decomposicao + "\nMétodo de Reciclagem:" + plastico.metodoReciclagem);
			break;
			case "5":
				Eletronico eletronico = new Eletronico();
				prnt("Categoria: " + eletronico.categoria + "\nDecomposição: " + eletronico.decomposicao + "\nMétodo de Reciclagem:" + eletronico.metodoReciclagem);
			break;
			case "6":
				Radioativo radioativo = new Radioativo();
				prnt("Categoria: " + radioativo.categoria + "\nDecomposição: " + radioativo.decomposicao + "\nMétodo de Reciclagem:" + radioativo.metodoReciclagem);
			break;
			default:
				msgBox("Por favor, entre com uma opção.");
			break;
		}

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