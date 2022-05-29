package Repositories;

import Domain.Filme;
import Domain.Show;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShowRepository {
    private List<Show> shows = new ArrayList<>();

    public void addShow(Show show) {
        shows.add(show);
        System.out.println("Show adicionado com sucesso!");
    }

    public Show buscaPorTitulo(String buscaTitulo) {
        buscaTitulo = buscaTitulo.toLowerCase();
        for ( Show show : shows) {
            if (show.getTitulo().toLowerCase().equals(buscaTitulo)) {
                return show;
            }
        }
        System.out.println("Não há show para o título desejado!");
        return null;
    }

    public void buscaPorAno(int BuscAno) {
        int cont = 0;
        for ( Show show : shows) {
            if (BuscAno == show.getAno()) {
                System.out.println(show);
                System.out.println();
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há show para o ano desejado!");
        }
    }

    public void buscaPorArtista(String buscaArtista) {
        int cont = 0;
        buscaArtista = buscaArtista.toLowerCase();
        for ( Show show : shows) {
            if (show.getArtista().toLowerCase().equals(buscaArtista)) {
                System.out.println(show);
                System.out.println();
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há show para o ator desejado!");
        }
    }

    public void buscaPorEstilo(String BuscaEstilo) {
        int cont = 0;
        BuscaEstilo = BuscaEstilo.toLowerCase();
        for ( Show show : shows) {
            if (show.getEstilo().toLowerCase().equals(BuscaEstilo)) {
                System.out.println(show);
                System.out.println();
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há show para o gênero desejado!");
        }
    }

    public boolean removePorTitulo(String apagaTitulo) {
        for (Show show : shows) {
            if (show.getTitulo().toLowerCase().equals(apagaTitulo)) {
                shows.remove(show);
                System.out.println("Filme removido com sucesso!");
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
    public boolean updateFilme(Show showAtualizado, String titulo) {
        Show show = buscaPorTitulo(titulo);
        if (Objects.isNull(show)) {
            System.out.println("Show não encontrado para atualização!");
            return false;
        }
        String novoTitulo = show.getTitulo();
        int novoAno = showAtualizado.getAno();
        String novoArtista = showAtualizado.getArtista();
        String novoEstilo = showAtualizado.getEstilo();

        // Verifica quais campos é preciso atualizar
        if (isValidString(novoTitulo)) {
            show.setTitulo(novoTitulo);
        }
        if (isValidString(novoArtista)) {
            show.setArtista(novoArtista);
        }
        if (isValidString(novoEstilo)) {
            show.setEstilo(novoEstilo);
        }
        return  true;
    }
}
