package aula02;

public class Caderno {
	String modelo;
	String cor;
	String tamanho;
	int paginas;
	float valor;
	boolean escrever;

	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: "+ this.tamanho);
		System.out.println("Páginas " + this.paginas);
		System.out.println("Valor: " + this.valor);
		
		System.out.println("O caderno foi comprado? : " + this.escrever);
		
	}

	void comprado() {
	
	}
	
	void naoestudar() {
		this.escrever = false;
	}
	void estudar() {
		this.escrever = true;	
	}
	
	
	
	
}