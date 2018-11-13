import java.util.Random;

/**
 * luta
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private Boolean aprovada;

    public boolean marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            return true;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            return false;
        }
    }
    public String lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    return "Empatou";
                    //break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    return "desafiado "+this.desafiado.getNome()+" ganhou";
                    //break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    return "desafiante "+this.desafiante.getNome()+" ganhou";
                    //break;
            }
            return "";
        } else {
            return "Luta nao foi aprovada";
        }
    }

    public String getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}