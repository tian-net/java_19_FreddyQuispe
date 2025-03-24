package actividad5;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos
    public String obtenerInfo() {
        return "Título: " + titulo + " | Autor: " + autor;
    }

    public boolean esClasico() {
        return autor.contains("Shakespeare") || autor.contains("Cervantes");
    }
}
