package Simples;

public class ContaEspecial extends Conta{
	private int diasSemJuros;
	private double limite;

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
			this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroconta);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}

	public ContaEspecial() {
		super();
	}

	@Override
	public String toString() {
		return "ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", toString()=" + super.toString()
				+ "]";
	}

}
