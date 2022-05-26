
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("-------EXTRATO CONTA CORRENTE-------");
		super.topoSaldo();	
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("-------SALDO CONTA CORRENTE-------");
		super.topoSaldo();	
	}

}
