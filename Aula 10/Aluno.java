/**
 * Aluno
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(int matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatricula() {
        System.out.println("matricula cancelada");
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}