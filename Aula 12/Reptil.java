/**
 * Reptil
 */
public class Reptil extends Animal{
    private String corEscamas;

    public Reptil(String corEscamas, float peso, int idade, int membros) {
        this.corEscamas = corEscamas;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
    public String getCorEscamas() {
        return this.corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}