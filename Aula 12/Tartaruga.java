/**
 * Tartaruga
 */
public class Tartaruga extends Reptil{

    public Tartaruga(String corEscamas, float peso, int idade, int membros) {
        super(corEscamas, peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Andando devagar");
    }
}