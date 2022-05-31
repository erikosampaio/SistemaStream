package Domain;

import Service.Pagamento;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String documento;
    private String telefone;
    private Pagamento pagamento;
    private String situacao;

    public Cliente(String nome, String documento, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getSituacao() {
        if (Objects.isNull(this.getPagamento())) {
            return "Inativo";
        }
        return "Ativo";
    }

    public String verificaTelefone() {
        if (Objects.isNull(this.telefone))
            return "";
        return this.telefone;
    }

    public String Assistir(Cliente cliente) {
        if (cliente.getSituacao().equals("Ativo")){
            return "Assistindo filme...";
        }
        return "Cliente inativo. Efetue o pagamento para liberar o serviço!";
    }
    @Override
    public String toString() {
        return "==========Cliente==========\n" +
                "Nome        -> " + nome + '\n' +
                "Documento   -> " + documento + '\n' +
                "Telefone    -> " + verificaTelefone() + '\n' +
                "Situação    -> " + getSituacao() + '\n' +
                "=========================";
    }
}
