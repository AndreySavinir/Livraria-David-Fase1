package entities;

public class Livros {
    private String titulo;
    private int anoPublicacao;
    private String autor;
    private int codigo;
    private String status;
    private static int contador = 1;

    public Livros(String titulo, int anoPublicacao, String autor, String status ) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.status = status;
        this.codigo = gerarCodigoUnico();
    }

    public static int gerarCodigoUnico() {
        return contador++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}



