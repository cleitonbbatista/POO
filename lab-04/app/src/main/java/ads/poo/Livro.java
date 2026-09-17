package ads.poo;

public class Livro {

    private String isbn;
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String ibsn, String titulo, String autor, int ano) {
        this.isbn = ibsn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
