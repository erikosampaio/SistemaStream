package Tests;

import Domain.Documentario;
import Domain.Filme;
import Domain.Show;
import Repositories.DocumentarioRepository;
import Repositories.FilmeRepository;
import Repositories.ShowRepository;

public class ShowRepositoryTeste {
    public static void main(String[] args) {


        Show s1 = new Show("Timbalada", 2000, "Gueto", "Axé");
        Show s2 = new Show("Amigos", 1995, "Zezé de Camargo", "Sertanejo");
        Show s3 = new Show("Projeto Sola", 2021, "Guilherme", "Folk");

        ShowRepository showDb = new ShowRepository();

        showDb.addShow(s1);
        showDb.addShow(s2);
        showDb.addShow(s3);
        System.out.println();

        System.out.println("Busca por título: ");
        System.out.println(showDb.buscaPorTitulo("Amigos"));
        System.out.println();

        System.out.println("Busca por ano: ");
        showDb.buscaPorAno(2010);
        System.out.println();


        System.out.println("Busca por artista: ");
        showDb.buscaPorArtista("Guilherme");
        System.out.println();

        System.out.println("Busca por estilo: ");
        showDb.buscaPorEstilo("Folque");
        System.out.println();

        System.out.println();

        System.out.println("Lista atual de show: ");
        showDb.getListaShow();

        showDb.removePorTitulo("Timbalada");
        System.out.println();

        System.out.println("Lista atual de show: ");
        showDb.getListaShow();

        Show s4 = new Show("Amigos", 1995, "Chitãozinho", "Sertanejo");

        showDb.updateFilme(s4, "Amigos");
        System.out.println();

        System.out.println("Lista atual de show: ");
        showDb.getListaShow();
    }
}