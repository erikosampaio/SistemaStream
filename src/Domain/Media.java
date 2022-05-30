package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Media {
    private String titulo;
    private int ano;
    private String genero;
    private String categoria;

    private String diretor;
    private List<String> ator = new ArrayList<>();


    public Media(String titulo, int ano, String genero, String categoria, String diretor, List<String> ator) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.categoria = categoria;
        this.diretor = diretor;
        this.ator = ator;
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

    public void getAtor() {
        for ( String a: ator ) {
            System.out.println(ator);
        }
    }

    public void setAtor(String buscaAtor, String novoAtor) {
        buscaAtor = buscaAtor.toLowerCase();
        for (String s: ator) {
            if (s.equals(buscaAtor)) {
                s = novoAtor;
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

    @Override
    public String toString() {
        return "==========" + categoria + "==========\n" +
                "Título  -> " + titulo + '\n' +
                "Ano     -> " + ano + '\n' +
                "Diretor -> " + diretor + '\n' +
                "Genero  -> " + genero + '\n' +
                "Atores: " + '\n' +
                + getAtor() + '\n' +
                "=========================";
    }
}
