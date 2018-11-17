/**
 * Aula14
 */
public class Aula14 {
    public static void main(String[] args) {
        Gafanhoto [] g = new Gafanhoto[]{
            new Gafanhoto("andrelfs", "Andre", 23, "Masc"),
            new Gafanhoto("creuzita", "Creuza", 20, "Fem"),
        };
        Video [] v = new Video[]{
            new Video("Video 01 POO"),
            new Video("Video 02 PHP"),
            new Video("Video 03 HTML"),
        };
        //
            /*
            System.out.println(g.getTotalAssistido());
            g.viuMaisUm();
            System.out.println(g.getTotalAssistido());

            System.out.println(v[0].isReproduzindo());
            v[0].play();
            System.out.println(v[0].isReproduzindo());
        //*/
        System.out.println(g[0].toString());
        System.out.println(v[0].toString());
    }
}