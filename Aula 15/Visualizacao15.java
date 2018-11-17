/**
 * Visualizacao15
 */
public class Visualizacao15 {
    private Gafanhoto15 espectador;
    private Video15 filme;

    public Visualizacao15(Gafanhoto15 espectador, Video15 filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int n) {
        this.filme.setAvaliacao(n);
    }

    public void avaliar(float p) {
        int tot = 0;
        if (p <= 20) {
            tot = 3;
        } else if (p <= 50) {
            tot = 5;
        } else if (p <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto15 getEspectador() {
        return this.espectador;
    }

    public void setEspectador(Gafanhoto15 espectador) {
        this.espectador = espectador;
    }

    public Video15 getFilme() {
        return this.filme;
    }

    public void setFilme(Video15 filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
            "\n espectador='" + getEspectador() + "'" +
            ",\n filme='" + getFilme() + "'" +
            "\n}";
    }
}