package Repository;

import Domain.Cliente;
import Domain.Filme;
import Service.Pagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public void getListaCliente() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println();
        }
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente - " + cliente.getNome() + " - adicionado com sucesso!");
    }

    public Cliente buscaPorNome(String buscaNome) {
        int cont = 0;
        buscaNome = buscaNome.toLowerCase();
        for ( Cliente cliente : clientes) {
            if (cliente.getNome().toLowerCase().equals(buscaNome)) {
                return cliente;
            }
        }
        System.out.println("Não há cliente para o nome desejado!");
        return null;
    }

    public void buscaPorDocumento(String buscaDocumento) {
        int cont = 0;
        buscaDocumento = buscaDocumento.toLowerCase();
        for ( Cliente cliente : clientes) {
            if (cliente.getDocumento().toLowerCase().equals(buscaDocumento)) {
                System.out.println(cliente);
                cont = 1;
            }
        }
        if (cont == 0) {
            System.out.println("Não há cliente para o documento desejado!");
        }
    }
    public boolean removePorNome(String apagaNome) {
        apagaNome = apagaNome.toLowerCase();
        for (Cliente cliente : clientes) {
            if (cliente.getNome().toLowerCase().equals(apagaNome)) {
                clientes.remove(cliente);
                System.out.println("Cliente - " + cliente.getNome() + " - removido com sucesso!");
                return true;
            }
        }
        System.out.println("Não há cliente para o nome desejado!");
        return false;
    }

    private boolean isValidString(String value) {
        return value != null && !value.isBlank();
    }

    //encontrar filme na base pelo título
    public boolean updateCliente(Cliente clienteAtualizado, String titulo) {
        Cliente cliente = buscaPorNome(titulo);
        if (Objects.isNull(cliente)) {
            return false;
        }
        String novoNome = clienteAtualizado.getNome();
        String novoDocumento = clienteAtualizado.getDocumento();
        String novoTelefone = clienteAtualizado.getTelefone();

        // Verifica quais campos é preciso atualizar
        if (isValidString(novoNome)) {
            cliente.setNome(novoNome);
        }
        if (isValidString(novoDocumento)) {
            cliente.setDocumento(novoDocumento);
        }
        if (isValidString(novoTelefone)) {
            cliente.setTelefone(novoTelefone);
        }

        System.out.println("Cliente - " + cliente.getNome() + " - atualizado com sucesso!");
        return  true;
    }
}
