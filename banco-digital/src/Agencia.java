public class Agencia {
    private static int SEQUENCIAL = 1;

    private int numero;
    private String nome;
    private Banco banco;

    public Agencia(String nome, Banco banco) {
        this.numero = SEQUENCIAL++;
        this.nome = nome;
        this.banco = banco;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public Banco getBanco() {
        return this.banco;
    }

}
