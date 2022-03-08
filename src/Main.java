
public class Main {

	public static void main(String[] args) {
		Cliente francisco = new Cliente();
		francisco.setNome("Francisco");
		
		Conta cc = new ContaCorrente(francisco);
		Conta poupanca = new ContaPoupanca(francisco);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
