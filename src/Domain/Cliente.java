package Domain;

import Service.Pagamento;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String documento;
    private String telefone;
    private Pagamento pagamento;
    private boolean situacao = false;

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
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

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String situacao() {
        if (Objects.isNull(this.pagamento))
            return "Inativo";
        return "Ativo";
    }

    public String verificaTelefone() {
        if (Objects.isNull(this.telefone))
            return "";
        return this.telefone;
    }

    @Override
    public String toString() {
        return "==========Cliente==========\n" +
                "Nome        -> " + nome + '\n' +
                "Documento   -> " + documento + '\n' +
                "Telefone    -> " + verificaTelefone() + '\n' +
                "Situação    -> " + situacao() + '\n' +
                "=========================";
    }
}
