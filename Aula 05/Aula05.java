
/**
 * Aula05
 */
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.abrirConta("CC");
        cb1.setNumConta(111);
        cb1.setDono("Jubileo");
        cb1.estadoAtual();
        cb1.sacar(60);
        cb1.fecharConta();
        cb1.pagarMensalidade();
        cb1.sacar(38);
        cb1.fecharConta();
        cb1.estadoAtual();


        ContaBanco cb2 = new ContaBanco();
        cb2.abrirConta("CP");
        cb2.setNumConta(222);
        cb2.setDono("Creuza");
        cb2.estadoAtual();
        cb2.sacar(60);
        cb2.fecharConta();
        cb2.pagarMensalidade();
        cb2.sacar(38);
        cb2.fecharConta();
        cb2.estadoAtual();
    }
}