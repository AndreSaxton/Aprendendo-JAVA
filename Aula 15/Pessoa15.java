/**
 * Pessoa15
 */
public abstract class Pessoa15 {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa15(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void ganharExp(float x) {
        this.experiencia += x;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
            "\n nome='" + getNome() + "'" +
            ",\n idade='" + getIdade() + "'" +
            ",\n sexo='" + getSexo() + "'" +
            ",\n experiencia='" + getExperiencia() + "'" +
            "\n}";
    }
}