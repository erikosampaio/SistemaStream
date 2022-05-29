package Tests;

import Domain.Documentario;
import Domain.Show;
import Repositories.DocumentarioRepository;
import Repositories.ShowRepository;

public class DocumentarioRepositoryTeste {
    public static void main(String[] args) {


        Documentario d1 = new Documentario("Breaking Bad", 2013, "Ação");
        Documentario d2 = new Documentario("Spartacus", 2015, "Guerra");
        Documentario d3 = new Documentario("Supernatural", 2006, "Fantasia");

        DocumentarioRepository documentarioDB = new DocumentarioRepository();

        documentarioDB.addDocumentario(d1);
        documentarioDB.addDocumentario(d2);
        documentarioDB.addDocumentario(d3);
        System.out.println();

        System.out.println("Busca por título: ");
        System.out.println(documentarioDB.buscaPorTitulo("Spartacus"));
        System.out.println();

        System.out.println("Busca por ano: ");
        documentarioDB.buscaPorAno(2006);
        System.out.println();

        System.out.println("Busca por gênero: ");
        documentarioDB.buscaPorGenero("guerra");
        System.out.println();
        System.out.println();

        System.out.println("Lista atual de documentário: ");
        documentarioDB.getListaDocumentario();

        documentarioDB.removePorTitulo("BREAKING BAD");
        System.out.println();

        Documentario d4 = new Documentario("Breaking Bad", 2014, "Ação");

        documentarioDB.updateDocumentario(d4, "breaking bad");
        System.out.println();

        System.out.println("Lista atual de documentário: ");
        documentarioDB.getListaDocumentario();
    }
}