import javax.swing.*;
public class AmbientalCare {
	public static void main(String args[]) {
		int opt;
		String texto;
		String[] botoes = {"Papel", "Vidro", "Metal", "Plástico", "Eletrônico", "Radioativo", "Orgânico"};
 		opt = JOptionPane.showOptionDialog(null, "Bem vindo ao AmbientalCare\nEscolha o tipo de lixo para ser reciclado:", "AmbientalCare", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes);
		
		switch(opt) {
			case 0:
				Papel papel = new Papel();
				texto = papel.toString();
			break;
			case 1:
				Vidro vidro = new Vidro();
				texto = vidro.toString();
			break;
			case 2:
				Metal metal = new Metal();
				texto = metal.toString();
			break;
			case 3:
				Plastico plastico = new Plastico();
				texto = plastico.toString();
			break;
			case 4:
				Eletronico eletronico = new Eletronico();
				texto = eletronico.toString();
			break;
			case 5:
				Radioativo radioativo = new Radioativo();
				texto = radioativo.toString();
			break;
			case 6:
				Organico organico = new Organico();
				texto = organico.toString();
			break;
			default:
				texto = "Por favor, entre com uma opção válida.";
			break;
		}

		JOptionPane.showMessageDialog(null, texto, "AmbientalCare", JOptionPane.PLAIN_MESSAGE);
		int res = JOptionPane.showConfirmDialog(null, "Deseja realizar outra consulta?", "AmbientalCare", JOptionPane.OK_CANCEL_OPTION);
		if(res == 0) {
			main(null);
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