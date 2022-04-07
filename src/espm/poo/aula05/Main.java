package espm.poo.aula05;

import espm.poo.ex2.Cliente;
import espm.poo.ex2.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente selmini = new Cliente();
        selmini.getConta().depositar(100);
        System.out.println(selmini.getConta().getSaldo());
    }
    
}
