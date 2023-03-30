package ej1_guia7.entidades;


public class Libro {
    
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int NPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int NPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NPaginas = NPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNPaginas() {
        return NPaginas;
    }
    
    
    

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNPaginas(int NPaginas) {
        this.NPaginas = NPaginas;
    }

    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", NPaginas=" + NPaginas + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    

}
