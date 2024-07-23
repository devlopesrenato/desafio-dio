import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static int SEQUENCIAL = 1;

    private String nome;
    private int numero;

    private List<Conta> contas;

    public Banco(String nome) {
        this.numero = SEQUENCIAL++;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

}