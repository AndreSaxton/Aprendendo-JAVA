/**
 * Bolsista
 */
public class Bolsista extends Alunoo{
    private int bolsa;
   
    public Bolsista(int bolsa, int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("renovando bolsa de "+this.nome+"");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println("mensalidade de "+this.nome+" paga com desconto");
    }

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}