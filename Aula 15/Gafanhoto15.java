/**
 * Gafanhoto15
 */
public class Gafanhoto15 extends Pessoa15{
    private String login;
    private int totalAssistido;

    public Gafanhoto15(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm() {
        this.totalAssistido ++;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
            "\n login='" + getLogin() + "'" +
            ",\n totalAssistido='" + getTotalAssistido() + "'" +
            "\n "+ super.toString() +
            "\n}";
    }
}