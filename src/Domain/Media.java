package Domain;

import java.util.ArrayList;
import java.util.List;

public class Media {
    private String titulo;
    private int ano;
    private String genero;
    private String categoria;
    private String diretor;
    private List<String> atores = new ArrayList<>();


    public Media(String titulo, int ano, String genero, String categoria, String diretor, List<String> atores) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.categoria = categoria;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<String> getAtor() {
        return this.atores;
    }
    public void setAtor(String buscaAtor, String novoAtor) {
        buscaAtor = buscaAtor.toLowerCase();
        for (String ator: this.atores) {
            if (ator.equals(buscaAtor)) {
                ator = novoAtor;
            }
        }
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "==========" + categoria + "==========\n" +
                "Título  -> " + titulo + '\n' +
                "Ano     -> " + ano + '\n' +
                "Diretor -> " + diretor + '\n' +
                "Genero  -> " + genero + '\n' +
                "Atores: -> " + atores +'\n' +
                "=========================";
    }
}
