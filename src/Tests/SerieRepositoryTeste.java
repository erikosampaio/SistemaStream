package Tests;

import Domain.Documentario;
import Repositories.DocumentarioRepository;

public class SerieRepositoryTeste {
    public static void main(String[] args) {


        /***
        FilmeRepository filme1 = new FilmeRepository();

        filme1.addFilme(new Filme("Amor", 2020, "Patrick", "Erick", "Humor"));

        filme1.buscaPorTitulo("Amor");
        filme1.buscaPorTitulo("Amora");

        filme1.buscaPorDiretor("Patrick");
        filme1.buscaPorDiretor("Eric");

        filme1.buscaPorAtor("Erick");
        filme1.buscaPorAtor("Eric");

        filme1.buscaPorGenero("Humor");
        filme1.buscaPorGenero("comédia");
         **/

        /***

         Show sh = new Show("Homem litúrgico", 2020, "Guilherme", "folk");

         ShowRepository show1 = new ShowRepository();

         show1.addShow(sh);

         show1.buscaPorTitulo("homem litúrgico");
         show1.buscaPorTitulo("homem");

         show1.buscaPorAno(2020);
         show1.buscaPorAno(2022);

         show1.buscaPorArtista("guilherme");
         show1.buscaPorArtista("guilher");

         show1.buscaPorEstilo("folk");
         show1.buscaPorEstilo("axé");

         System.out.println();
         show1.removePorTitulo("homem litúrgico");
         show1.buscaPorEstilo("folk");
         **/

        Documentario d = new Documentario("Netflix", 2010, "Comedia");

        DocumentarioRepository doc1 = new DocumentarioRepository();

        doc1.addDocumentario(d);

        System.out.println(1);
        doc1.buscaPorTitulo("Netflix");
        System.out.println(2);
        doc1.buscaPorTitulo("homem");

        System.out.println(3);
        doc1.buscaPorAno(2012);
        System.out.println(4);
        doc1.buscaPorAno(2010);

        System.out.println();
        doc1.buscaPorGenero("Netflix");
        System.out.println(1);
        doc1.buscaPorGenero("axé");

        System.out.println();
        System.out.println(1);
        doc1.removePorTitulo("Netfli");
        System.out.println(1);
        doc1.buscaPorGenero("folk");
    }
}