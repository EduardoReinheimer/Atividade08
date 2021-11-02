package Item;

public class Midia extends Item {
	private String gravadora;
	private float duracao;

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		if (gravadora.length() > 0)
			this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		if (duracao > 0)
			this.duracao = duracao;
	}

	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	public Midia() {
		super();
	}

	@Override
	public String toString() {
		return "Midia [gravadora=" + gravadora + ", duracao=" + duracao + ", toString()=" + super.toString() + "]";
	}

}
