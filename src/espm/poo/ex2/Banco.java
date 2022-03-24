package espm.poo.ex2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes(){
        return clientes;
    }

    public void adicionaCliente(Cliente c){
        this.clientes.add(c);
    }
    

}
