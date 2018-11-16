/**
 * Professor
 */
public class Professor extends Pessoa{
    private String especialida;
    private float salario;

    public Professor(String especialida, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialida = especialida;
        this.salario = salario;
    }

    public void receberAumento(float s) {
        setSalario(s);
    }

    public String getEspecialida() {
        return this.especialida;
    }

    public void setEspecialida(String especialida) {
        this.especialida = especialida;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}