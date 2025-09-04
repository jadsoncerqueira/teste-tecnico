class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String saudacao() {
        return "Olá, sou " + nome;
    }
}

class Cliente extends Pessoa {
    private int numeroFidelidade;

    public Cliente(String nome, int numeroFidelidade) {
        super(nome);
        this.numeroFidelidade = numeroFidelidade;
    }

    @Override
    public String saudacao() {
        return super.saudacao() + ", cliente número " + numeroFidelidade + ".";
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Clara", 1234);
        System.out.println(cliente.saudacao());
    }
}
