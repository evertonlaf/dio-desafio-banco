
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("-------EXTRATO CONTA PUPANÇA-------");
	    super.corpoExtrato();	
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("-------SALDO CONTA CORRENTE-------");
		super.topoSaldo();	
	}


	
}
