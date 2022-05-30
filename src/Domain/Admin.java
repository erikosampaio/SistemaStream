package Domain;

import java.util.Objects;

public class Admin {
    private String nome = "eriko";
    private String senha = "123";

    public Admin(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    private boolean validaAcesso(String nome, String senha) {
        if (this.nome == nome && this.senha == senha) {
            System.out.println("Logado!");
            return true;
        }
        System.out.println("Login ou senha inválidos!");
        return false;
    }

    public String getNome() {
        return nome;
    }
}
