package espm.poo.ex2;

public class Ex1 {
    public static void main(String[] args) {

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Rodrigo");
        pj1.setCnpj("123.123.123/1230-00");

        Cliente pj2 = new PessoaJuridica();

        Banco maryBank = new Banco("Leonardo Bank");
        maryBank.adicionaCliente(pj1);
        maryBank.adicionaCliente(pj2);

        Cliente rodrigo = pj1;

        Cliente leon = new PessoaFisica();
        
    }    
}
