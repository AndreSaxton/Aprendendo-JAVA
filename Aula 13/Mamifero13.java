/**
 * Mamifero13
 */
public class Mamifero13 extends Animal13{
    protected String corPelo;

    public Mamifero13(String corPelo, float peso, int idade, int membros) {
        this.corPelo = corPelo;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}