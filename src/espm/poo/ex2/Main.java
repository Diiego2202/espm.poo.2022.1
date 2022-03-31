package espm.poo.ex2;

import java.util.Scanner;

public class Main{

    private static Banco banco = null;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        banco = new Banco("ESPM Bank");

        boolean exit = false;
        while(exit == false){
            try {
                System.out.print("ESPM> ");
                String input = ler.nextLine().trim().toLowerCase();
                if("".equals(input)){

                }else if("exit".equals(input)){
                    exit = true;
                }else if("help".equals(input)){
                    help();
                }else if("list".equals(input)){
                    listCostumers(banco);
                } else if("add".equals(input)){
                    addCostumer(banco);
                }else if("find".equals(input)){
                    throw new UnsupportedOperationException();
                } else{
                    System.err.println("Comando inválido");
                }
            } catch (UnsupportedOperationException e){
                e.printStackTrace();
            }
        }
        System.out.println("Bye bye");

        ler.close();
    }

    private static void help(){
        System.out.println("ESPM Sistema de clientes");
        System.out.println("----------------------");
        System.out.println("add -> Cadastra cliente");
        System.out.println("list -> Lista os clientes");
        System.out.println("del -> Exclui os clientes");
        System.out.println("find -> Localiza um cliente");
        System.out.println();
        System.out.println("exit -> Sair do sistema");
    }

    private static void listCostumers(Banco banco){
        banco.getClientes().forEach(c -> System.out.println(c.toString()));
    }

    private static void addCostumer(Banco banco){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = ler.nextLine();

        System.out.print("CPF: ");
        String cpf = ler.nextLine();

        Cliente c = new Cliente();
        c.setNome(nome);
        c.setCpf(cpf);

        banco.adicionaCliente(c);
    }

}
