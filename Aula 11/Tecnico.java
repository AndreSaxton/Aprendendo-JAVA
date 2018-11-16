/**
 * Tecnico
 */
public class Tecnico extends Alunoo{
    private int registroProfissional;

    public Tecnico(int registroProfissional, int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println(this.nome+" esta praticando");
    }
    public int getRegistroProfissional() {
        return this.registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}