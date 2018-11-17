/**
 * Aula15
 */
public class Aula15 {
    public static void main(String[] args) {
        Gafanhoto15 [] g = new Gafanhoto15[]{
            new Gafanhoto15("andrelfs", "Andre", 23, "Masc"),
            new Gafanhoto15("creuzita", "Creuza", 20, "Fem"),
        };
        Video15 [] v = new Video15[]{
            new Video15("Video 01 POO"),
            new Video15("Video 02 PHP"),
            new Video15("Video 03 HTML"),
        };
        Visualizacao15 [] visu = new Visualizacao15[]{
            new Visualizacao15(g[0], v[0])
        };

        //criando nova array para caber mais itens
        Visualizacao15[] a = new Visualizacao15[visu.length+1];
        for (int i = 0; i < visu.length; i++) {
            a[i] = visu[i];
        }
        a[a.length-1] = new Visualizacao15(g[0], v[1]);
        
        visu[0].avaliar();
        System.out.println(a[0].toString());
        visu[0].avaliar(85.0f);
        System.out.println(a[0].toString());
        //System.out.println(a[1].toString());
        //System.out.println(visu[0].toString());
        //System.out.println(visu[1].toString());
    }
}