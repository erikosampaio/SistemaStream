package Service;

import javax.xml.crypto.Data;
import java.util.Date;

public class Pagamento {

    private String tipoPagamento;
    private String data;

    public Pagamento(String tipoPagamento, String data) {
        this.tipoPagamento = tipoPagamento;
        this.data = data;
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

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "==========Pagamento==========\n" +
                "Forma Pagamento -> " + tipoPagamento + '\n' +
                "Data            -> " + data + '\n' +
                "=========================";
    }
}
