
public class Operacao {
	
	private int ondem;
	private String tipo;
	private double valor;
	private double saldo;
	
	public Operacao(int ondem, String tipo, double valor, double saldo) {
		super();
		this.ondem = ondem;
		this.tipo = tipo;
		this.valor = valor;
		this.saldo = saldo;
	}

	public int getOndem() {
		return ondem;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

}
