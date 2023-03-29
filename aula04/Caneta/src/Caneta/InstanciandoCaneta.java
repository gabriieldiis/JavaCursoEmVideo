package Caneta;

public class InstanciandoCaneta {
public static void main(String[] args) {
	Caneta c1 = new Caneta("BIC", "Amarela", 0.4f);
	c1.status();
	
	System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
	}
}
