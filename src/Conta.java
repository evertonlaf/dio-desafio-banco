import java.util.ArrayList;
import java.util.List;

public abstract class  Conta implements IConta{
	private static final int AGENCIA=1;
	private static  int SEQUENCIAL = 1;	
	private static  int TRANSACAO = 1;	
	private List<Operacao> transacoes;
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cli;

	public Conta(Cliente cliente) {
		this.setNumero(SEQUENCIAL++);
		this.setAgencia(AGENCIA);
		this.setSaldo(0.00);
		this.setCli(cliente);
		this.transacoes = new ArrayList<Operacao>();
		
	}	
	
	
	public void corpoExtrato() {		

		System.out.println(String.format("Titular: %s",getCli().getNome()));
		System.out.println(String.format("Agencia: %d",getAgencia()));
		System.out.println(String.format("Numero: %d",getNumero()));
		for (Operacao operacao : transacoes) {

			System.out.println(String.format("-->: %s",operacao.getOndem()+"....."+operacao.getTipo()+operacao.getValor()+" :: "+operacao.getSaldo()));
			
			
		}	
		
		System.out.println(String.format("Saldo: %.2f",getSaldo()));
	}

	
	
	public void topoSaldo() {
		System.out.println(String.format("Titular: %s",getCli().getNome()));
		System.out.println(String.format("Agencia: %d",getAgencia()));
		System.out.println(String.format("Numero: %d",getNumero()));
		System.out.println(String.format("Saldo: %.2f",getSaldo()));
	}

	public Cliente getCli() {
		return cli;
	}

	private void setCli(Cliente cli) {
		this.cli = cli;
	}
	
	public int getAgencia() {
		return agencia;
	}




	private void setAgencia(int agencia) {
		this.agencia = agencia;
	}




	public int getNumero() {
		return numero;
	}




	private void setNumero(int numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return saldo;
	}




	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	@Override
	public void sacar(double valor) {		
		this.saldo -= valor;
		transacoes.add(new Operacao(TRANSACAO++, "Saque    -", valor, this.saldo));
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		transacoes.add(new Operacao(TRANSACAO++, "Deposito +", valor, this.saldo));
		
	}
	@Override
	public void transferir(Conta destino, double valor) {
		 this.sacar(valor);
		 destino.depositar(valor);
		
	}


}
