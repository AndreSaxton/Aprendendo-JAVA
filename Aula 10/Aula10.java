/**
 * Aula10
 */
public class Aula10 {
    public static void main(String[] args) {
        Pessoa pe = new Pessoa("Andree", 23, "Masc");
        Aluno a = new Aluno(01, "ADS", "aluno1", 22, "Fem");
        Professor pr = new Professor("Historia", 3000.45f, "professor1", 22, "Fem");
        Funcionario f = new Funcionario("Adminstracao", true, "funcionario1", 22, "Masc");

        /*pe.setNome("pe1");
        a.setNome("a1");
        pr.setNome("pr1");
        f.setNome("f1");*/

        a.setCurso("TI");
        pr.setSalario(2500.33f);;
        f.setSetor("estoque");

        a.cancelarMatricula();
        pr.receberAumento(50.29f);
        f.mudarTrabalho();

        System.out.println(pe.toString());
        System.out.println(a.toString());
        System.out.println(pr.toString());
        System.out.println(f.toString());
    }
}