import java.util.ArrayList;
import java.util.List;

public class MainContas {

	public static void main(String[] args) {
		
		Banco itau = new Banco("Itau");		
		Banco bb = new Banco("Banco do Brasil");		
		
		Cliente everton = new Cliente("Everton");
		Cliente maria = new Cliente("Maria");
		Cliente ntonio = new Cliente("Antonio");
		
		List<Conta> contasItau = new ArrayList<Conta>();
		List<Conta> contasBB = new ArrayList<Conta>();
		
		Conta corrente = new ContaCorrente(everton);		
		contasBB.add(corrente);
		
		Conta poupanca = new ContaPoupanca(everton);
		contasBB.add(poupanca);
		
		poupanca.depositar(300.00);	
		poupanca.depositar(2300.00);	
		poupanca.imprimirSaldo();
		
		corrente.depositar(650.00);
		corrente.imprimirSaldo();		
		
		poupanca.transferir(corrente, 200.00);
		poupanca.transferir(corrente, 500.00);
		poupanca.transferir(corrente, 300.00);
		
		corrente.transferir(poupanca, 500.00);
		poupanca.imprimirSaldo();
		corrente.imprimirSaldo();
		
		
		poupanca.imprimirExtrato();
	}

}
