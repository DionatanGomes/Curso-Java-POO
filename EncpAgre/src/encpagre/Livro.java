
package encpagre;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    
    public void detalhes(){
        System.out.println("---------------- Livro --------------------");
        System.out.println("Titulo: "+ this.getTitulo());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Total de paginas "+ this.getTotPaginas());
        System.out.println("Pagina atual " + this.getPagAtual());
        System.out.println("Leitor: " +this.leitor.getNome());
        System.out.println("-------------------------------------------");
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
    public void folhear( int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
            System.out.println("Fonhando pagina "+ p);
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            this.setPagAtual(pagAtual + 1);
            System.out.println("Avança página "+ this.pagAtual);
        }else{
            System.out.println("Livro fechado não avança páginas");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            this.setPagAtual(pagAtual - 1);
            System.out.println("Voltar página " + this.pagAtual);
        }else{
            System.out.println("Livro fechado não avança páginas");
        }
    }
}
