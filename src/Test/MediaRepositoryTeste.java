package Test;

import Domain.Media;
import Repository.MediaRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaRepositoryTeste {

    public static void main(String[] args) {


        Media m1 = new Media("Os vingadores", 2012, "Ação", "Filme", "Kevin Feige", new ArrayList<>(List.of("Paulo", "Alex", "Azul", "Arroz Mágico")));

        Media m2 = new Media("A vida é bela", 2015, "Drama", "Filme", "Robert", new ArrayList<>(List.of("Robert", "Alex", "Dois", "Feijão Tropeiro")));

        Media m3 = new Media("Troia", 2015, "Guerra", "Série", "Siclano", new ArrayList<>(List.of("Aquiles", "Helz", "Troin", "Quatro")));

        MediaRepository mediaDB = new MediaRepository();

        mediaDB.addMedia(m1);
        mediaDB.addMedia(m2);
        mediaDB.addMedia(m3);
        System.out.println();

        System.out.println("Busca por título: Os vingadores");
        System.out.println(mediaDB.buscaPorTitulo("Os Vingadores"));
        System.out.println();

        System.out.println("Busca por ano: 2014");
        mediaDB.buscaPorAno(2014);
        System.out.println();

        System.out.println("Busca por diretor: Robert");
        mediaDB.buscaPorDiretor("Robert");
        System.out.println();

        System.out.println("Busca por ator: Quatro");
        mediaDB.buscaPorAtor("Quatro");
        System.out.println();

        System.out.println("Busca por gênero: ");
        mediaDB.buscaPorGenero("Ação");
        System.out.println();

        System.out.println();
        System.out.println();

        System.out.println("Lista atual de medias: ");
        mediaDB.getListaMedia();

        mediaDB.removePorTitulo("a vida é bela");
        System.out.println();

        System.out.println("Lista atual de medias: ");
        mediaDB.getListaMedia();


        Media m4 = new Media("Vingadores - Era de Ultron", 2018, "Ação", "Filme", "Kevin", new ArrayList<>(List.of("Aquiles", "Helz", "Troin", "Quatro")));

        mediaDB.updateMedia(m4, "os vingadores");
        System.out.println();

        System.out.println("Lista atual de medias: ");
        mediaDB.getListaMedia();
    }
}