package espm.poo.aula08;

import java.util.ArrayList;
import java.util.List;

import espm.poo.aula06.main;

public class Main {
    public static void main(String[] args) {

        List<Pagamento> pagamentos = new ArrayList<Pagamento>();     

        Pagamento pag1 = new PagamentoCartao(400, 20);
        Pagamento pag2 = new PagamentoDolar(400, 5.8, 10);

        pagamentos.add(pag1);
        pagamentos.add(pag2);

        pagamentos.forEach(p -> {
            System.out.println(p.efetivar());
        });
    }
}
