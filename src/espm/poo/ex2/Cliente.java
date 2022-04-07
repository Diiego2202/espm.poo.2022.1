package espm.poo.ex2;

public class Cliente {
    private String nome, cpf;
    private Conta conta;

    public Cliente(){
        this.conta = new Conta(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Conta getConta() {
        return this.conta;
    }

    @Override
    public String toString() {
        return "{nome: " + nome +
            ", cpf: " + cpf +
            ", conta: " + conta + "}";
    }
}
