/**
 * lutador
 */
public class lutador {
    private String nome;
    private String naciolidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public lutador(String nome, String naciolidade, int idade, float altura, float peso, String categoria, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.naciolidade = naciolidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String[] apresentar() {
        String[] stats;
        stats = new String[9];
        stats[0] = "Lutador: "+getNome();
        stats[1] = "Idade: "+getIdade();
        stats[2] = "Diretamente de :"+getNaciolidade();
        stats[3] = "Altura: " + getAltura();
        stats[4] = "Pesando: " + getPeso();
        stats[5] = "Vitorias: " + getVitorias();
        stats[6] = "Derrotas: " + getDerrotas();
        stats[7] = "Empates: " + getEmpates();
        return (stats);
    }
    public String[] status() {
        String[] stats;
        stats = new String[4];
        stats[0] = "Lutador: "+getNome();
        stats[1] = "Ganhou: " + getVitorias();
        stats[2] = "Perdeu: " + getDerrotas();
        stats[3] = "Empatou: " + getEmpates();
        return (stats);
    }
    public void ganharLuta() {
        setVitorias(getVitorias()+1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaciolidade() {
        return this.naciolidade;
    }

    public void setNaciolidade(String naciolidade) {
        this.naciolidade = naciolidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if (this.peso<52.2) {
            this.categoria = "Invalido";
        } else if (this.peso<=70.3) {
            this.categoria = "Leve";
        } else if (this.peso<=83.9) {
            this.categoria = "Medio";
        } else if (this.peso<=120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}