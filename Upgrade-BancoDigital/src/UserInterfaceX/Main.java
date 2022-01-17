
public class Main {

	public static void main(String[] args) {
		Cliente Roberto = new Cliente();
		Roberto.setNome("Roberto");
		
		Conta cc = new ContaCorrente(Roberto);
		Conta poupanca = new ContaPoupanca(Roberto);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
