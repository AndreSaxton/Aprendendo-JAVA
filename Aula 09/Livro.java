/**
 * Livro
 */
public class Livro implements Publicacao{
    private String titulo;    
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalharLivro() {
        return "titulo: "+this.titulo+",\nautor:"+this.autor+",\ntotalPaginas:"+this.totalPaginas+",\npaginaAtual:"+this.paginaAtual+",\naberto:"+this.aberto+"\nleitor:"+this.leitor.getNome()+"\n";
    }
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return this.paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return this.leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }
    @Override
    public void fechar() {
        this.aberto = false;
    }
    @Override
    public void folhear(int p) {
        if (this.totalPaginas > p) {
            this.paginaAtual = p;
        }
    }
    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }
    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
}