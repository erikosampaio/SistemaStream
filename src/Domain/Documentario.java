package Domain;

public class Documentario {

    private String titulo;
    private int ano;
    private String artista;
    private String genero;

    public Documentario(String titulo, int ano, String artista, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getArtista() {
        return artista;
    }

    public String getEstilo() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setEstilo(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "==========Show==========\n" +
                "Título  -> " + titulo + '\n' +
                "Ano     -> " + ano + '\n' +
                "Artista    -> " + artista + '\n' +
                "Gênero  -> " + genero + '\n' +
                "=======================";
    }
}
