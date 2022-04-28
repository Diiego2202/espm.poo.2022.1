package espm.poo.aula08;

public class PagamentoDolar extends Pagamento{
    
    private final double taxa;
    private final double cambio;

    public PagamentoDolar(double valor, double cambio, double taxa){
        super(valor);
        this.taxa = taxa;
        this.cambio = cambio;
    }


    @Override
    protected double calculaTotal() {
        
        return super.getValor() * cambio + taxa;
    }
}
