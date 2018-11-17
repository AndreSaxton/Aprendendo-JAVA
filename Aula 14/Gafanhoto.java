/**
 * Gafanhoto
 */
public class Gafanhoto extends Pessoa14{
    private String login;
    private int totalAssistido;

    public Gafanhoto(String login, String nome, int idade, String sexo) {
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