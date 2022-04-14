package espm.poo.aula05;

import espm.poo.ex2.Cliente;
import espm.poo.ex2.Conta;
import espm.poo.ex2.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica selmini = new PessoaFisica();
        selmini.getConta().depositar(100);
        System.out.println(selmini.getConta().getSaldo());
    }
    
}
