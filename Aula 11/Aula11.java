/**
 * Aula11
 */
public class Aula11 {
    public static void main(String[] args) {
        String nome = "andre";
        int idade = 23;
        String sexo = "masc";
        int matricula = 01;
        String curso = "ADS";
        int bolsa = 50;
        String especialidade = "algo";
        float salario = 2300.45f;
        int registroProfissional = 123;

        //Pessoaa p = new Pessoaa(nome, idade, sexo);
        Visitante v = new Visitante(nome, idade, sexo);
        Alunoo a = new Alunoo(matricula, curso, nome, idade, sexo);
        Bolsista b = new Bolsista(bolsa, matricula, curso, nome, idade, sexo);
        Professorr p = new Professorr(especialidade, salario, nome, idade, sexo);
        Tecnico t = new Tecnico(registroProfissional, matricula, curso, nome, idade, sexo);

        System.out.println(v.getIdade());
        v.fazerAniversario();
        System.out.println(v.getIdade());

        b.renovarBolsa();
        b.pagarMensalidade();
        a.pagarMensalidade();
        
        System.out.println(v.toString());

        System.out.println(p.getSalario());
        p.receberAumento(34.12f);
        System.out.println(p.getSalario());

        t.praticar();
    }
}