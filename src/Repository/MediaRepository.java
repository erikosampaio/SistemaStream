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

    public void addMedia(Media media) {
        medias.add(media);
        System.out.println(media.getCategoria() + " - " + media.getTitulo() + " - adicionado com sucesso!");
    }

    public Media buscaPorTitulo(String buscaTitulo) {
        int cont = 0;
        buscaTitulo = buscaTitulo.toLowerCase();
        for ( Media media : medias) {
            if (media.getTitulo().toLowerCase().equals(buscaTitulo)) {
                return media;
            }
        }
        System.out.println("Não há media para o título desejado!");
        return null;
    }

    public void buscaPorAno(int buscaAno) {
        int cont = 0;
        for ( Media media : medias) {
            if (buscaAno == media.getAno()) {
                System.out.println(media);
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
        for ( Media media : medias) {
            if (media.getDiretor().toLowerCase().equals(BuscaDiretor)) {
                System.out.println(media);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há media com o diretor desejado!");
        }
    }

    public void buscaPorAtor(String buscaAtor) {
        int cont = 0;
        // buscaAtor = buscaAtor.toLowerCase();
        for ( Media media : medias) {
            if (media.getAtor().contains(buscaAtor)) {
                System.out.println(media);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há media para o ator desejado!");
        }
    }

    public void buscaPorGenero(String buscaGenero) {
        int cont = 0;
        buscaGenero = buscaGenero.toLowerCase();
        for ( Media media : medias) {
            if (media.getGenero().toLowerCase().equals(buscaGenero)) {
                System.out.println(media);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há media para o gênero desejado!");
        }
    }

    public boolean removePorTitulo(String apagaTitulo) {
        apagaTitulo = apagaTitulo.toLowerCase();
        for (Media media : medias) {
            if (media.getTitulo().toLowerCase().equals(apagaTitulo)) {
                medias.remove(media);
                System.out.println(media.getCategoria() + " - " + media.getTitulo() + " - removido com sucesso!");
                return true;
            }
        }
        System.out.println("Não há media com esse título!");
        return false;
    }

    private boolean isValidString(String value) {
        return value != null && !value.isBlank();
    }

    public boolean updateMedia(Media mediaAtualizada, String titulo) {
        Media media = buscaPorTitulo(titulo);
        if (Objects.isNull(media)) {
            return false;
        }
        String novoTitulo = mediaAtualizada.getTitulo();
        int novoAno = mediaAtualizada.getAno();
        String novoDiretor = mediaAtualizada.getDiretor();
        String novaCategoria = mediaAtualizada.getCategoria();
        List<String> novosAtores = mediaAtualizada.getAtor();
        String novoGenero = mediaAtualizada.getGenero();

        if (isValidString(novoTitulo)) {
            media.setTitulo(novoTitulo);
        }
        if (isValidString(novoDiretor)) {
            media.setDiretor(novoDiretor);
        }
        if (isValidString(novaCategoria)) {
            media.setCategoria(novaCategoria);
        }
        if (isValidString(novoGenero)) {
            media.setGenero(novoGenero);
        }
        media.setAno(novoAno);
        System.out.println(media.getCategoria() + " - " + media.getTitulo() + " - atualizado com sucesso!");
        return  true;
    }
}
