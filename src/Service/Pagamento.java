package Service;

import Domain.Cliente;

public class Pagamento {

    private String tipoPagamento;
    private String data;

    private Cliente cliente;

    public Pagamento(String tipoPagamento, String data, Cliente cliente) {
        this.tipoPagamento = tipoPagamento;
        this.data = data;
        this.cliente = cliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getData() {
        return data;
    }
    public String getCliente() {
        return cliente.getNome();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "==========Pagamento==========\n" +
                "Pagador         -> " + cliente.getNome() + '\n' +
                "Forma Pagamento -> " + tipoPagamento + '\n' +
                "Data            -> " + data + '\n' +
                "=========================";
    }
}
