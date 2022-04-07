package espm.poo.ex2;

public class Ex1 {
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica();
        Cliente pj2 = new PessoaJuridica();

        Banco maryBank = new Banco("Maryanne Bank");
        maryBank.adicionaCliente(pj1);
        maryBank.adicionaCliente(pj2);
    }    
}
