package espm.poo.ex2;

public class PessoaFisica extends Cliente{

    public PessoaFisica(){
        super();
    }

    private String cpf;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{nome:" + getNome() + ", cpf:" + getCpf() + "}";
    }
}
