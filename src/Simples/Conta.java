package Simples;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;

	
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta(String banco, int agencia, int numeroconta) {
		this.banco = banco;
		this.agencia = agencia;
		this.numeroconta = numeroconta;
		this.saldo = 0.0;
	}
	
	public Conta() {
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean saque(double valor) {
		if(valor > 0 && valor <=saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conta [banco=" + banco + ", agencia=" + agencia + ", numeroconta=" + numeroconta + ", saldo=" + saldo
				+ "]";
	}
	
	
		
}
