package Test;

import Domain.Cliente;
import Repository.ClienteRepository;
import Service.Pagamento;

public class ClienteRepositoryTeste {

    public static void main(String[] args) {

        ClienteRepository clienteDB = new ClienteRepository();
        Cliente c = new Cliente("Eriko", "201045", "3223-3514");
        Pagamento p = new Pagamento("PIX", "15/06/2022", c);
        c.setPagamento(p);
        c.atualizaSituacao();

        Cliente c1 = new Cliente("Arroz", "123", "5632-2533");
        Pagamento p1 = new Pagamento("Dinheiro", "20/07/2022", c1);
        c1.setPagamento(p1);
        c1.atualizaSituacao();

        Cliente c2 = new Cliente("Pedro", "20291029", "4423-4321");

        System.out.println();
        clienteDB.addCliente(c);
        System.out.println();

        System.out.println(c);
        System.out.println();

        clienteDB.addCliente(c1);
        System.out.println();

        System.out.println(c1);
        System.out.println();

        clienteDB.addCliente(c2);
        System.out.println();

        System.out.println(c2);
        System.out.println();

        System.out.println("Busca por Nome: Pedro");
        System.out.println(clienteDB.buscaPorNome("pedro"));
        System.out.println();

        System.out.println("Busca por documento: 201045");
        clienteDB.buscaPorDocumento("201045");
        System.out.println();

        System.out.println();

        System.out.println("Lista atual de clientes: ");
        clienteDB.getListaCliente();


        System.out.println("Removendo cliente Pedro...");
        clienteDB.removePorNome("pedro");
        System.out.println();

        System.out.println("Lista atual de Clientes: ");
        clienteDB.getListaCliente();

        Cliente c3 = new Cliente("Eriko", "15513515125", "123123-123123123");

        System.out.println("Atualizando cliente Eriko...");
        clienteDB.updateCliente(c3, "eriko");
        System.out.println();

        System.out.println("Lista atual de Clientes: ");
        clienteDB.getListaCliente();

        System.out.println(c.Assistir(c));
        System.out.println(c1.Assistir(c1));
    }
}
