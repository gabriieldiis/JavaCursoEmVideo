package aula02;

public class Caneta {
	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;
	
	void status() {
		System.out.println("modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada ? " + this.tampada);
	}
	
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro, nao posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	
	}
	
	 protected void tampar() {
		this.tampada = true;
	}

	protected void destampar() {
		this.tampada = false;
		
	}
	
}