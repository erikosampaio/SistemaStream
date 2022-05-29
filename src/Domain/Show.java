package Domain;

public class Show {

    private String titulo;
    private int ano;
    private String artista;
    private String estilo;

    public Show(String titulo, int ano, String artista, String estilo) {
        this.titulo = titulo;
        this.ano = ano;
        this.artista = artista;
        this.estilo = estilo;
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
        return estilo;
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

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "==========Show==========\n" +
                "Título  -> " + titulo + '\n' +
                "Ano     -> " + ano + '\n' +
                "Artista -> " + artista + '\n' +
                "Estilo  -> " + estilo + '\n' +
                "=======================";
    }
}
