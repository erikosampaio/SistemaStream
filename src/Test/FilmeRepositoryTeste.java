package Test;

import Domain.Filme;
import Repository.FilmeRepository;

public class FilmeRepositoryTeste {

    public static void main(String[] args) {

        Filme f1 = new Filme("Os vingadores", 2012, "Kevin Feige", "Chris Evans", "Ação");
        Filme f2 = new Filme("A vida é bela", 1997, "Roberto Benigni", "Roberto Benigni", "Drama/Guerra");
        Filme f3 = new Filme("Interestelar", 2014, "Christopher Nolan", "Matthew McConaughey", "Ficção");

        FilmeRepository filmeDB = new FilmeRepository();

        filmeDB.addFilme(f1);
        filmeDB.addFilme(f2);
        filmeDB.addFilme(f3);
        System.out.println();

        System.out.println("Busca por título: ");
        System.out.println(filmeDB.buscaPorTitulo("Os Vingadores"));
        System.out.println();

        System.out.println("Busca por ano: ");
        filmeDB.buscaPorAno(2014);
        System.out.println();

        System.out.println("Busca por diretor: ");
        filmeDB.buscaPorDiretor("Roberto");
        System.out.println();

        System.out.println("Busca por ator: ");
        filmeDB.buscaPorAtor("Chris Evans");
        System.out.println();

        System.out.println("Busca por gênero: ");
        filmeDB.buscaPorGenero("Ação");
        System.out.println();

        System.out.println();
        System.out.println();

        System.out.println("Lista atual de filmes: ");
        filmeDB.getListaFilme();

        filmeDB.removePorTitulo("a vida é bela");
        System.out.println();

        System.out.println("Lista atual de filmes: ");
        filmeDB.getListaFilme();

        Filme f4 = new Filme("Os vingadores", 2012, "Kevin Feige", "Robert Downey Jr.", "Ação");

        filmeDB.updateFilme(f4, "os vingadores");
        System.out.println();

        System.out.println("Lista atual de filmes: ");
        filmeDB.getListaFilme();
    }
}