//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco dioBanco = new Banco("DIO");
        Agencia agenciaDioDigital = new Agencia("DIO DIGITAL", dioBanco);
        Agencia agenciaDioFisico = new Agencia("DIO FISICO", dioBanco);
        Banco bancoJava = new Banco("BANCO JAVA");
        Agencia bancoJavaDigital = new Agencia("BANCO JAVA DIGITAL", bancoJava);
        Agencia bancoJavaFisico = new Agencia("BANCO JAVA FISICO", bancoJava);
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        Conta cliente1ContaCorrente = new ContaCorrente(cliente1, agenciaDioDigital);
        Conta cliente1ContaPoupanca = new ContaPoupanca(cliente1, agenciaDioFisico);
        dioBanco.addConta(cliente1ContaCorrente);
        dioBanco.addConta(cliente1ContaPoupanca);

        Conta cliente2ContaCorrente = new ContaCorrente(cliente2, bancoJavaDigital);
        Conta cliente2ContaPoupanca = new ContaPoupanca(cliente2, bancoJavaFisico);
        bancoJava.addConta(cliente2ContaCorrente);
        bancoJava.addConta(cliente2ContaPoupanca);

        cliente1ContaCorrente.depositar(150);
        cliente1ContaPoupanca.depositar(50);
        cliente1ContaCorrente.imprimirExtrato();
        cliente1ContaPoupanca.imprimirExtrato();

        cliente2ContaCorrente.depositar(150);
        cliente2ContaPoupanca.depositar(50);
        cliente1ContaCorrente.imprimirExtrato();
        cliente2ContaPoupanca.imprimirExtrato();

        cliente1ContaCorrente.transferir(50, cliente2ContaPoupanca);
        cliente2ContaCorrente.transferir(150, cliente1ContaPoupanca);

        cliente1ContaCorrente.imprimirExtrato();
        cliente1ContaPoupanca.imprimirExtrato();

        cliente1ContaCorrente.imprimirExtrato();
        cliente2ContaPoupanca.imprimirExtrato();

        System.out.println(bancoJava.getContas());
        System.out.println(dioBanco.getContas());
    }
}