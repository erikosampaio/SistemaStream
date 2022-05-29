package Repository;

import Domain.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SerieRepository {
    private List<Serie> series = new ArrayList<>();

    public void getListaSerie() {
        for (Serie serie : series) {
            System.out.println(serie);
            System.out.println();
        }
    }

    public void addSerie(Serie serie) {
        series.add(serie);
        System.out.println("Série - " + serie.getTitulo() + " - adicionada com sucesso!");
    }

    public Serie buscaPorTitulo(String buscaTitulo) {
        buscaTitulo = buscaTitulo.toLowerCase();
        for ( Serie serie : series) {
            if (serie.getTitulo().toLowerCase().equals(buscaTitulo)) {
                return serie;
            }
        }
        System.out.println("Não há série para o título desejado!");
        return null;
    }

    public void buscaPorAno(int buscaAno) {
        int cont = 0;
        for ( Serie serie : series) {
            if (buscaAno == serie.getAno()) {
                System.out.println(serie);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há série para o ano desejado!");
        }
    }

    public void buscaPorGenero(String buscaGenero) {
        int cont = 0;
        buscaGenero = buscaGenero.toLowerCase();
        for ( Serie serie : series) {
            if (serie.getGenero().toLowerCase().equals(buscaGenero)) {
                System.out.println(serie);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há série para o gênero desejado!");
        }
    }

    public boolean removePorTitulo(String apagaTitulo) {
        apagaTitulo = apagaTitulo.toLowerCase();
        for (Serie serie : series) {
            if (serie.getTitulo().toLowerCase().equals(apagaTitulo)) {
                series.remove(serie);
                System.out.println("Série - " + serie.getTitulo() + " - removida com sucesso!");
                return true;
            }
        }
        System.out.println("Não há série com esse título!");
        return false;
    }

    private boolean isValidString(String value) {
        return value != null && !value.isBlank();
    }

    //encontrar filme na base pelo título
    public boolean updateSerie(Serie serieAtualizada, String titulo) {
        Serie serie = buscaPorTitulo(titulo);
        if (Objects.isNull(serie)) {
            return false;
        }
        String novoTitulo = serieAtualizada.getTitulo();
        int novoAno = serieAtualizada.getAno();
        String novoGenero = serieAtualizada.getGenero();

        // Verifica quais campos é preciso atualizar
        if (isValidString(novoTitulo)) {
            serie.setTitulo(novoTitulo);
        }
        if (isValidString(novoGenero)) {
            serie.setGenero(novoGenero);
        }
        serie.setAno(novoAno);
        System.out.println("Série - " + serie.getTitulo() + " - atualizada com sucesso!");
        return  true;
    }
}
