package espm.poo.ex2;

import java.util.Scanner;

import espm.poo.aula02.Pessoa;

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
        banco.getClientes().forEach(c -> {
            if(c instanceof PessoaFisica){
                PessoaFisica pf = (PessoaFisica) (c);
                System.out.println(pf);
            } else if(c instanceof PessoaJuridica){
                PessoaJuridica pj = (PessoaJuridica) (c);
                System.out.println(pj);
            }
        });
    }

    private static void addCostumer(Banco banco){
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = ler.nextLine();

        TipoPessoa tipoPessoa = inputTipoCliente(); 

        Cliente c = null;
        switch(tipoPessoa){
            case Fisica:
                System.out.print("CPF: ");
                String cpf = ler.nextLine();

                PessoaFisica pf = new PessoaFisica();
                pf.setCpf(cpf);
                c = pf;
                break;
            case Juridica:
                System.out.print("CNPJ: ");
                String cnpj = ler.nextLine();

                PessoaJuridica pj = new PessoaJuridica();
                pj.setCnpj(cnpj);
                c = pj;
        }

        c.setNome(nome);

        banco.adicionaCliente(c);
    }

    private static TipoPessoa inputTipoCliente(){

        Scanner ler = new Scanner(System.in);
        String tp="";

        while(!tp.equals("f") && !tp.equals("j")){
            System.out.print("Tipo de cliente: ");
            tp = ler.nextLine().toLowerCase();
            if(!tp.equals("f") && !tp.equals("j")){
                System.err.println("F: Física | J: Jurídica");
            }
        }

        return tp.equals("f") ? TipoPessoa.Fisica : TipoPessoa.Juridica;
    }

}