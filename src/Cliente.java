
public class Cliente {
    private static int SEQUENCIAL = 1;

    private String nome;
    private int numero;

    public Cliente(String nome) {
        this.nome = nome;
        this.numero = SEQUENCIAL++;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}