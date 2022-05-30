package Test;

import Domain.Cliente;
import Service.Pagamento;

public class ClienteRepositoryTeste {

    public static void main(String[] args) {

        Pagamento p1 = new Pagamento("PIX", "15/06/2022");
        Cliente c1 = new Cliente("Eriko", "201045");

        Cliente c2 = new Cliente("Pedro", "20291029");

        c1.setPagamento(p1);

        ClienteRepository clienteDB = new ClienteRepository();

        clienteDB.addCliente(c1);
        clienteDB.addCliente(c2);
        System.out.println();

        System.out.println("Busca por Nome: ");
        System.out.println(clienteDB.buscaPorNome("pedro"));
        System.out.println();

        System.out.println("Busca por documento: ");
        clienteDB.buscaPorDocumento("201045");
        System.out.println();

        System.out.println();

        System.out.println("Lista atual de clientes: ");
        clienteDB.getListaCliente();

        clienteDB.removePorNome("pedro");
        System.out.println();

        System.out.println("Lista atual de filmes: ");
        clienteDB.getListaCliente();

        Pagamento p3 = new Pagamento("PIX", ("2022-05-20"));
        Cliente c3 = new Cliente("Ériko", "20123123");

        clienteDB.updateCliente(c3, "eriko");
        System.out.println();

        System.out.println("Lista atual de filmes: ");
        clienteDB.getListaCliente();
    }
}
