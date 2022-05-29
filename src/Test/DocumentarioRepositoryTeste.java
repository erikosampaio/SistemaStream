package Test;

import Domain.Documentario;
import Repository.DocumentarioRepository;

public class DocumentarioRepositoryTeste {
    public static void main(String[] args) {


        Documentario d1 = new Documentario("Pelé", 2013, "Esporte");
        Documentario d2 = new Documentario("Animal", 2020, "Selvagem");
        Documentario d3 = new Documentario("Cidade de Deus", 2012, "Drama");

        DocumentarioRepository documentarioDB = new DocumentarioRepository();

        documentarioDB.addDocumentario(d1);
        documentarioDB.addDocumentario(d2);
        documentarioDB.addDocumentario(d3);
        System.out.println();

        System.out.println("Busca por título: ");
        System.out.println(documentarioDB.buscaPorTitulo("pelé"));
        System.out.println();

        System.out.println("Busca por ano: ");
        documentarioDB.buscaPorAno(2012);
        System.out.println();

        System.out.println("Busca por gênero: ");
        documentarioDB.buscaPorGenero("selvagem");
        System.out.println();
        System.out.println();

        System.out.println("Lista atual de documentário: ");
        documentarioDB.getListaDocumentario();

        documentarioDB.removePorTitulo("cidade de Deus");
        System.out.println();

        System.out.println("Lista atual de documentário: ");
        documentarioDB.getListaDocumentario();

        Documentario d4 = new Documentario("Pelé", 2019, "Esporte");

        documentarioDB.updateDocumentario(d4, "pelé");
        System.out.println();

        System.out.println("Lista atual de documentário: ");
        documentarioDB.getListaDocumentario();
    }
}