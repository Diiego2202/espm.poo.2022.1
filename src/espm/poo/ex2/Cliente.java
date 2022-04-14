package espm.poo.ex2;

public abstract class Cliente {
    private String nome;
    private String sobrenome;
    private Conta conta;

    public Cliente(){
        this.conta = new Conta(this);
    }

    public void setNome(String nome) {
        String[] nomes = nome.split(" ");
        this.nome = nomes[0];
        this.sobrenome = nomes[nomes.length - 1];
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public Conta getConta() {
        return this.conta;
    }

    @Override
    public String toString() {
        return "{nome: " + nome +
            ", conta: " + conta + "}";
    }
}
