/**
 * Ave
 */
public class Ave extends Animal{
    private String corPena;

    public Ave(String corPena, float peso, int idade, int membros) {
        this.corPena = corPena;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override

    public void emitirSom() {
        System.out.println("Som de ave");
    }
    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}