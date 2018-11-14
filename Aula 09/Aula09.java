/**
 * Aula09
 */
public class Aula09 {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[]{
            new Pessoa("Andre", 23, "Masc"),
            new Pessoa("And", 21, "Masc")
        };
        Livro[] livro = new Livro[]{
            new Livro("t1", "a1", 44, p[0]),
            new Livro("t2", "a2", 44, p[1]),
            new Livro("t3", "a3", 44, p[0])
        };

        for (Livro l : livro) {
            System.out.println(l.detalharLivro());
        }

        livro[0].abrir();
        livro[0].folhear(30);
        livro[0].avancarPagina();
        System.out.println(livro[0].detalharLivro());
    }
}