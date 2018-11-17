/**
 * Mamifero
 */
public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(String corPelo, float peso, int idade, int membros) {
        this.corPelo = corPelo;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
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