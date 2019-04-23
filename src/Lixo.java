public class Lixo {
	boolean reciclavel, reutilizavel;
	String decomposicao;
	String classe/* Seco/Molhado */, tipo/* Domiciliar, Industrial, Comercial, Público, Hospitalar, Radioativo, Espacial, Especial, Agrícola */, categoria/* Papel, Vidro, Metal, Plastico, Eletronico, Radioativo */;
	String metodoReciclagem;
	Lixo() {
		classe = "Molhado";
		tipo = "Domiciliar";
		
	}
}