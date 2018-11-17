/**
 * Cachorro
 */
public class Cachorro extends Mamifero{

    public Cachorro(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarCauda() {
        System.out.println("Abanando cauda");
    }
}