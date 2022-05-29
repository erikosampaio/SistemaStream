package Repository;

import Domain.Documentario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DocumentarioRepository {
    private List<Documentario> documentarios = new ArrayList<>();

    public void getListaDocumentario() {
        for (Documentario documentario : documentarios) {
            System.out.println(documentario);
            System.out.println();
        }
    }

    public void addDocumentario(Documentario documentario) {
        documentarios.add(documentario);
        System.out.println("Documentário - " + documentario.getTitulo() + " - adicionado com sucesso!");
    }

    public Documentario buscaPorTitulo(String buscaTitulo) {
        buscaTitulo = buscaTitulo.toLowerCase();
        for ( Documentario documentario : documentarios) {
            if (documentario.getTitulo().toLowerCase().equals(buscaTitulo)) {
                return documentario;
            }
        }
        System.out.println("Não há documentário para o título desejado!");
        return null;
    }

    public void buscaPorAno(int buscaAno) {
        int cont = 0;
        for ( Documentario documentario : documentarios) {
            if (buscaAno == documentario.getAno()) {
                System.out.println(documentario);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há documentário para o ano desejado!");
        }
    }

    public void buscaPorGenero(String buscaGenero) {
        int cont = 0;
        buscaGenero = buscaGenero.toLowerCase();
        for ( Documentario documentario : documentarios) {
            if (documentario.getGenero().toLowerCase().equals(buscaGenero)) {
                System.out.println(documentario);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há documentário para o gênero desejado!");
        }
    }

    public boolean removePorTitulo(String apagaTitulo) {
        apagaTitulo = apagaTitulo.toLowerCase();
        for (Documentario documentario : documentarios) {
            if (documentario.getTitulo().toLowerCase().equals(apagaTitulo)) {
                documentarios.remove(documentario);
                System.out.println("Documentário - " + documentario.getTitulo() + " - removido com sucesso!");
                return true;
            }
        }
        System.out.println("Não há documentário com esse título!");
        return false;
    }

    private boolean isValidString(String value) {
        return value != null && !value.isBlank();
    }

    //encontrar filme na base pelo título
    public boolean updateDocumentario(Documentario documentarioAtualizado, String titulo) {
        Documentario documentario = buscaPorTitulo(titulo);
        if (Objects.isNull(documentario)) {
            return false;
        }
        String novoTitulo = documentarioAtualizado.getTitulo();
        int novoAno = documentarioAtualizado.getAno();
        String novoGenero = documentarioAtualizado.getGenero();

        // Verifica quais campos é preciso atualizar
        if (isValidString(novoTitulo)) {
            documentario.setTitulo(novoTitulo);
        }
        if (isValidString(novoGenero)) {
            documentario.setGenero(novoGenero);
        }
        documentario.setAno(novoAno);
        System.out.println("Documentário - " + documentario.getTitulo() + " - atualizado com sucesso!");
        return  true;
    }
}
