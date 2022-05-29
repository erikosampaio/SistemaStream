package Domain;

public class Documentario {

    private String titulo;
    private int ano;
    private String genero;

    public Documentario(String titulo, int ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "==========Documentário==========\n" +
                "Título  -> " + titulo + '\n' +
                "Ano     -> " + ano + '\n' +
                "Gênero  -> " + genero + '\n' +
                "===============================";
    }
}
