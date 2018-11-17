/**
 * Aula12
 */
public class Aula12 {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Mamifero m = new Mamifero("Cinza", 6.34f, 5, 4);
        Reptil r = new Reptil("verde", 3.54f, 4, 4);
        Peixe p = new Peixe("azul", 2.55f, 3, 3);
        Ave a = new Ave("Roxo", 6.33f, 2, 4);

        /*
            m.locomover();
            m.alimentar();
            m.emitirSom();

            p.locomover();
            p.alimentar();
            p.emitirSom();
            p.soltarBolha();

            a.locomover();
            a.alimentar();
            a.emitirSom();
            a.fazerNinho();

            r.locomover();
            r.alimentar();
            r.emitirSom();
        */

        Cachorro cac = new Cachorro("Cinza", 6.34f, 5, 4);
        Canguru can = new Canguru("Cinza", 6.34f, 5, 4);
        Cobra co = new Cobra("verde", 3.54f, 4, 4);
        Goldfish go = new Goldfish("azul", 2.55f, 3, 3);
        Tartaruga ta = new Tartaruga("verde", 3.54f, 4, 4);

        can.locomover();
        cac.locomover();

        System.console();
    }
}