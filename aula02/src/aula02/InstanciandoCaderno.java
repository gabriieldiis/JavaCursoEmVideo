package aula02;

public class InstanciandoCaderno {
	public static void main	(String[] args) {
		 aula02.Caderno001 c1 = new aula02.Caderno001();
		 c1.cor = "Cinza";
		 c1.modelo = "Espiral";
		 c1.paginas = 120;
		 c1.tamanho = "A3";
		 c1.valor = 00.00f;
		 c1.comprado();
		 c1.naoestudar();
		 c1.status();
	}

}
