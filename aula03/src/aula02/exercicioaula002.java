package aula02;

public class exercicioaula002 {
	public static void main(String[] args) {
		Software c1 = new Software(); {
			c1.fornecedor = "Microsoft";
			c1.valor = 100;
			c1.ativo();
			c1.status();
			c1.utilizar();
		}
		
		Software c2 = new Software();{
			c2.fornecedor = "Kaspersky";
		}
	}
}
