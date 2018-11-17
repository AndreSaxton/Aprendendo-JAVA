/**
 * Aula13
 */
public class Aula13 {
    public static void main(String[] args) {
        String corPelo = "Cinza";
        float peso = 6.34f;
        int idade = 5;
        int membros = 4;

        Mamifero13 m = new Mamifero13(corPelo, peso, idade, membros);
        Lobo l = new Lobo(corPelo, peso, idade, membros);
        Cachorro13 c = new Cachorro13(corPelo, peso, idade, membros);

        c.reagir("ola");
        c.reagir("aaaa");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}