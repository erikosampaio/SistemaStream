package Domain;

public class Filme {
    private String titulo;
    private int ano;
    private String diretor;
    private String ator;
    private String genero;

    public Filme(String titulo, int ano, String diretor, String ator, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.ator = ator;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getAtor() {
        return ator;
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

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "==========Filme==========\n" +
                "titulo  -> " + titulo + '\n' +
                "Ano     -> " + ano + '\n' +
                "Diretor -> " + diretor + '\n' +
                "Ator    -> " + ator + '\n' +
                "Genero  -> " + genero + '\n' +
                "=========================";
    }
}
