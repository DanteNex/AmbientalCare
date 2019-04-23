import javax.swing.*;
public class AmbientalCare {
	public static void main(String args[]) {
		String opt;
		prnt("Bem vindo ao AmbientalCare, escolha o tipo de lixo para ser reciclado:");
		prnt("1 - Papel");
		prnt("2 - Vidro");
		prnt("3 - Metal");
		prnt("4 - Pl�stico");
		prnt("5 - Eletr�nico");
		prnt("6 - Radioativo");
		opt = JOptionPane.showInputDialog(null, "Entre com o n�mero da op��o:");
		
		switch(opt) {
			case "1":
				Papel papel = new Papel();
				prnt("Categoria: " + papel.categoria + "\nDecomposi��o: " + papel.decomposicao + "\nM�todo de Reciclagem:" + papel.metodoReciclagem);

			break;
			case "2":
				Vidro vidro = new Vidro();
				prnt("Categoria: " + vidro.categoria + "\nDecomposi��o: " + vidro.decomposicao + "\nM�todo de Reciclagem:" + vidro.metodoReciclagem);
			break;
			case "3":
				Metal metal = new Metal();
				prnt("Categoria: " + metal.categoria + "\nDecomposi��o: " + metal.decomposicao + "\nM�todo de Reciclagem:" + metal.metodoReciclagem);
			break;
			case "4":
				Plastico plastico = new Plastico();
				prnt("Categoria: " + plastico.categoria + "\nDecomposi��o: " + plastico.decomposicao + "\nM�todo de Reciclagem:" + plastico.metodoReciclagem);
			break;
			case "5":
				Eletronico eletronico = new Eletronico();
				prnt("Categoria: " + eletronico.categoria + "\nDecomposi��o: " + eletronico.decomposicao + "\nM�todo de Reciclagem:" + eletronico.metodoReciclagem);
			break;
			case "6":
				Radioativo radioativo = new Radioativo();
				prnt("Categoria: " + radioativo.categoria + "\nDecomposi��o: " + radioativo.decomposicao + "\nM�todo de Reciclagem:" + radioativo.metodoReciclagem);
			break;
			default:
				msgBox("Por favor, entre com uma op��o.");
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