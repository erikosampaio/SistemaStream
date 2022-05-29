package Test;

import Domain.Serie;
import Repository.SerieRepository;

public class SerieRepositoryTeste {
    public static void main(String[] args) {


        Serie se1 = new Serie("Breaking Bad", 2014, "Drama");
        Serie se2 = new Serie("Spartacus", 2015, "Guerra");
        Serie se3 = new Serie("Supernatural", 2006, "Fantasia");

        SerieRepository serieDB = new SerieRepository();

        serieDB.addSerie(se1);
        serieDB.addSerie(se2);
        serieDB.addSerie(se3);
        System.out.println();

        System.out.println("Busca por título: ");
        System.out.println(serieDB.buscaPorTitulo("Spartacus"));
        System.out.println();

        System.out.println("Busca por ano: ");
        serieDB.buscaPorAno(2006);
        System.out.println();

        System.out.println("Busca por gênero: ");
        serieDB.buscaPorGenero("guerra");
        System.out.println();
        System.out.println();

        System.out.println("Lista atual de série: ");
        serieDB.getListaSerie();

        serieDB.removePorTitulo("spartacus");
        System.out.println();

        System.out.println("Lista atual de série: ");
        serieDB.getListaSerie();

        Serie se4 = new Serie("Breaking Bad", 2014, "Ação");

        serieDB.updateSerie(se4, "breaking bad");
        System.out.println();

        System.out.println("Lista atual de série: ");
        serieDB.getListaSerie();
    }
}