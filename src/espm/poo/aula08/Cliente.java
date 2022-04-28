package espm.poo.aula08;

public class Cliente implements Usuario{

    String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public String getUsername() {
        return "cli." + nome.toLowerCase();
    }

    @Override
    public boolean autenticar(String password) {
        return (this.nome.charAt(0) + this.nome.charAt(nome.length()-1) + "").toLowerCase().equals(password);
    }
}
