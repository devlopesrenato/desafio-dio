
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Agencia agencia) {
        super(cliente, agencia, "Poupança");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("+++++ Extrato Conta Poupança +++++");
        super.imprimirInfosComuns();
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}