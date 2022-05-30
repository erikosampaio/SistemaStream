package Repository;

import Domain.Media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MediaRepository {
    private List<Media> medias = new ArrayList<>();

    public void getListaMedia() {
        for (Media media : medias) {
            System.out.println(media);
            System.out.println();
        }
    }

    public void addFilme(Media filme) {
        medias.add(filme);
        System.out.println("Filme - " + filme.getTitulo() + " - adicionado com sucesso!");
    }

    public Media buscaPorTitulo(String buscaTitulo) {
        int cont = 0;
        buscaTitulo = buscaTitulo.toLowerCase();
        for ( Media filme : medias) {
            if (filme.getTitulo().toLowerCase().equals(buscaTitulo)) {
                return filme;
            }
        }
        System.out.println("Não há filme para o título desejado!");
        return null;
    }

    public void buscaPorAno(int buscaAno) {
        int cont = 0;
        for ( Media filme : medias) {
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
        for ( Media filme : medias) {
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
        for ( Media filme : medias) {
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
        for ( Media filme : medias) {
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
        for (Media filme : medias) {
            if (filme.getTitulo().toLowerCase().equals(apagaTitulo)) {
                medias.remove(filme);
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
    public boolean updateFilme(Media filmeAtualizado, String titulo) {
        Media filme = buscaPorTitulo(titulo);
        if (Objects.isNull(filme)) {
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
