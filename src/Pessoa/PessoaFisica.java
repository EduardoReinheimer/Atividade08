package Pessoa;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String estadoCivil;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {

		if (cpf.length() > 0)
			this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
			this.estadoCivil = estadoCivil;
	}

	public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}

	public PessoaFisica() {
		super();
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", estadoCivil=" + estadoCivil + ", toString()=" + super.toString() + "]";
	}

}
