package espm.poo.ex2;

public class Conta {
    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Valor inválido!");
        }else{
            this.saldo -= valor;
        }
    }

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Valor inválido!");
        }else{
            this.saldo += valor;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }


    
}
