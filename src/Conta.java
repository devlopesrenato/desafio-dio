public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected String tipo;
    protected double saldo;
    protected Cliente cliente;
    protected Agencia agencia;


    public Conta(Cliente cliente, Agencia agencia, String tipo) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.agencia = agencia;
        this.tipo = tipo;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("### Comprovante de Saque ###");
            System.out.println(String.format("Cliente: %d - %s", this.cliente.getNumero(), this.cliente.getNome()));
            System.out.println(String.format("Banco: %d - %s", this.agencia.getBanco().getNumero(), this.agencia.getBanco().getNome()));
            System.out.println(String.format("Agencia: %d - %s", this.agencia.getNumero(), this.agencia.getNome()));
            System.out.println(String.format("Conta: %d - Conta %s", this.numero, this.tipo));
            System.out.println(String.format("Valor do saque: %.2f", valor));
            System.out.println("############################");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("### Comprovante de Deposito ###");
        System.out.println(String.format("Cliente: %d - %s", this.cliente.getNumero(), this.cliente.getNome()));
        System.out.println(String.format("Banco: %d - %s", this.agencia.getBanco().getNumero(), this.agencia.getBanco().getNome()));
        System.out.println(String.format("Agencia: %d - %s", this.agencia.getNumero(), this.agencia.getNome()));
        System.out.println(String.format("Conta: %d - Conta %s", this.numero, this.tipo));
        System.out.println(String.format("Valor do deposito: %.2f", valor));
        System.out.println("############################");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (contaDestino.getNumero() == this.getNumero()) {
            System.out.println("A conta de destino não pode ser a mesma de origem.");
            return;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("### Comprovante de Transfenrica ###");
            System.out.println("## Conta de Origem");
            System.out.println(String.format("Cliente: %d - %s", this.cliente.getNumero(), this.cliente.getNome()));
            System.out.println(String.format("Banco: %d - %s", this.agencia.getBanco().getNumero(), this.agencia.getBanco().getNome()));
            System.out.println(String.format("Agencia: %d - %s", this.agencia.getNumero(), this.agencia.getNome()));
            System.out.println(String.format("Conta: %d - Conta %s", this.numero, this.tipo));
            System.out.println("## Conta de Destino");
            System.out.println(String.format("Cliente: %d - %s", contaDestino.cliente.getNumero(), contaDestino.cliente.getNome()));
            System.out.println(String.format("Banco: %d - %s", contaDestino.agencia.getBanco().getNumero(), contaDestino.agencia.getBanco().getNome()));
            System.out.println(String.format("Agencia: %d - %s", contaDestino.agencia.getNumero(), contaDestino.agencia.getNome()));
            System.out.println(String.format("Conta: %d - Conta %s", contaDestino.numero, contaDestino.tipo));
            System.out.println(String.format("## Valor da transferência: %.2f", valor));
            System.out.println("############################");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Numero Conta: %d", this.numero));
        System.out.println(String.format("Titular: %d - %s", this.cliente.getNumero(), this.cliente.getNome()));
        System.out.println(String.format("Banco: %d - %s", this.agencia.getBanco().getNumero(), this.agencia.getBanco().getNome()));
        System.out.println(String.format("Agencia: %d - %s", this.agencia.getNumero(), this.agencia.getNome()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return String.format("{ NumeroConta: %d, TipoConta: %s, Agencia: %d, Cliente: %s, Saldo: %.2f }", this.numero, this.tipo, this.agencia.getNumero(), this.cliente.getNome(), this.saldo);
    }
}