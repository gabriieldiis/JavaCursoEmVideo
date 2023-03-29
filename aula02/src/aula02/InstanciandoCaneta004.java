package aula02;

public class InstanciandoCaneta004 {
    public static void main(String[] args) {
        Caneta004 c1= new Caneta004("Faber", "Preta", 0.4f);
            c1.status();
            //System.out.println("Tenho uma caneta " + c1.getModelo() + " que tem a ponta de " + c1.getPonta());

        Caneta004 c2 = new Caneta004("Maped", "Roxa", 2.0f);
        c2.status();
    }
}
