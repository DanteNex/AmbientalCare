import javax.swing.*;
public class AmbientalCare {
	public static void main(String args[]) {
		int opt;
		String texto;
		String coisa;
		String[] botoes = {"Papel", "Vidro", "Metal", "Plástico", "Eletrônico", "Radioativo", "Orgânico"};
 		opt = caixaBotoes("Bem vindo ao AmbientalCare\nEscolha o tipo de lixo para ser reciclado:", botoes);
		
		
		
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

		caixaDialogo(texto);
		int res = caixaConfirmar("Deseja realizar outra consulta?");
		if(res == 0) {
			main(null);
		} 	

	}

	public static void caixaDialogo(String msg) {
		JOptionPane.showMessageDialog(null, msg, "AmbientalCare", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static int caixaConfirmar(String msg) {
		int res = JOptionPane.showConfirmDialog(null, msg, "AmbientalCare", JOptionPane.OK_CANCEL_OPTION);
		return res;
	}
	
	public static int caixaBotoes(String msg, String[] botoes) {
 		int opt = JOptionPane.showOptionDialog(null, msg, "AmbientalCare", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes);
 		return opt;
	}
	
}