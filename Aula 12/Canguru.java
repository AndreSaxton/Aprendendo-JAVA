/**
 * Canguru
 */
public class Canguru extends Mamifero{

    public Canguru(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}