package Simples;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			this.saldoPoupanca += valor;
			return true;
		}
		return false;
	}

	public boolean saquePoupanca(double valor) {
		if (valor > 0 && valor <= saldoPoupanca) {
			this.saldoPoupanca -= valor;
			return true;
		}
		return false;
	}

	public ContaSimples(String banco, int agencia, int numeroconta) {
		super(banco, agencia, numeroconta);
		this.saldoPoupanca = 0.0;
	}

	public ContaSimples() {
		super();
	}

	@Override
	public String toString() {
		return "ContaSimples [saldoPoupanca=" + saldoPoupanca + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
