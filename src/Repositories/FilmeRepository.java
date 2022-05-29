package Repositories;

import Domain.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilmeRepository {
    private List<Filme> filmes = new ArrayList<>();

    public void getListaFilme() {
        for (Filme filme : filmes) {
            System.out.println(filme);
            System.out.println();
        }
    }

    public void addFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme - " + filme.getTitulo() + " - adicionado com sucesso!");
    }

    public Filme buscaPorTitulo(String buscaTitulo) {
        int cont = 0;
        buscaTitulo = buscaTitulo.toLowerCase();
        for ( Filme filme : filmes) {
            if (filme.getTitulo().toLowerCase().equals(buscaTitulo)) {
                return filme;
            }
        }
        System.out.println("Não há filme para o título desejado!");
        return null;
    }

    public void buscaPorAno(int buscaAno) {
        int cont = 0;
        for ( Filme filme : filmes) {
            if (buscaAno == filme.getAno()) {
                System.out.println(filme);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há filme para o ano desejado!");
        }
    }

    public void buscaPorDiretor(String BuscaDiretor) {
        int cont = 0;
        BuscaDiretor = BuscaDiretor.toLowerCase();
        for ( Filme filme : filmes) {
            if (filme.getDiretor().toLowerCase().equals(BuscaDiretor)) {
                System.out.println(filme);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há filme para o diretor desejado!");
        }
    }

    public void buscaPorAtor(String BuscaAtor) {
        int cont = 0;
        BuscaAtor = BuscaAtor.toLowerCase();
        for ( Filme filme : filmes) {
            if (filme.getAtor().toLowerCase().equals(BuscaAtor)) {
                System.out.println(filme);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há filme para o ator desejado!");
        }
    }

    public void buscaPorGenero(String BuscaGenero) {
        int cont = 0;
        BuscaGenero = BuscaGenero.toLowerCase();
        for ( Filme filme : filmes) {
            if (filme.getGenero().toLowerCase().equals(BuscaGenero)) {
                System.out.println(filme);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há filme para o gênero desejado!");
        }
    }

    public boolean removePorTitulo(String apagaTitulo) {
        apagaTitulo = apagaTitulo.toLowerCase();
        for (Filme filme : filmes) {
            if (filme.getTitulo().toLowerCase().equals(apagaTitulo)) {
                filmes.remove(filme);
                System.out.println("Filme - " + filme.getTitulo() + " - removido com sucesso!");
                return true;
            }
        }
        System.out.println("Não há filme com esse título!");
        return false;
    }

    private boolean isValidString(String value) {
        return value != null && !value.isBlank();
    }

    //encontrar filme na base pelo título
    public boolean updateFilme(Filme filmeAtualizado, String titulo) {
        Filme filme = buscaPorTitulo(titulo);
        if (Objects.isNull(filme)) {
            System.out.println("Filme não encontrado para atualização!");
            return false;
        }
        String novoTitulo = filmeAtualizado.getTitulo();
        int novoAno = filmeAtualizado.getAno();
        String novoDiretor = filmeAtualizado.getDiretor();
        String novoAtor = filmeAtualizado.getAtor();
        String novoGenero = filmeAtualizado.getGenero();

        // Verifica quais campos é preciso atualizar
        if (isValidString(novoTitulo)) {
            filme.setTitulo(novoTitulo);
        }
        if (isValidString(novoDiretor)) {
            filme.setDiretor(novoDiretor);
        }
        if (isValidString(novoAtor)) {
            filme.setAtor(novoAtor);
        }
        if (isValidString(novoGenero)) {
            filme.setGenero(novoGenero);
        }
        filme.setAno(novoAno);
        System.out.println("Filme - " + filme.getTitulo() + " - atualizado com sucesso!");
        return  true;
    }
}
