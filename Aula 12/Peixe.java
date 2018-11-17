/**
 * Peixe
 */
public class Peixe extends Animal{
    private String corEscama;

    public Peixe(String corEscama, float peso, int idade, int membros) {
        this.corEscama = corEscama;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public void soltarBolha() {
        System.out.println("Glub glub");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo coisas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}