package Pessoa;

public class Pessoa {
	private String nome;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 0) {
			this.endereco = endereco;
		}
	}

	public Pessoa(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}

	public Pessoa() {

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}

}
