import aula04.Caneta;

//Aula 4b inicio
/**
 * Aula04
 */
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        //c1.modelo = "BIC";
        //c1.ponta = 0.5f; privado
        c1.status();
        System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
    }
}