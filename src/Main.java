import Domain.Filme;
import Domain.Show;
import Repositories.FilmeRepository;
import Repositories.ShowRepository;

public class Main {
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

        ShowRepository show1 = new ShowRepository();

        Show sh = new Show("Homem litúrgico", 2020, "Guilherme", "folk");

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
        show1.addShow(sh);
        show1.getShows();
        show1.removePorTitulo("homem litúrgico");
        show1.getShows();
    }
}