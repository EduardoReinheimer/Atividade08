package Pessoa;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String tipoEmpresa;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() > 0)
			this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		if (tipoEmpresa.length() > 0)
			this.tipoEmpresa = tipoEmpresa;
	}

	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}

	public PessoaJuridica() {
		super();
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", tipoEmpresa=" + tipoEmpresa + ", toString()=" + super.toString()
				+ "]";
	}

}
