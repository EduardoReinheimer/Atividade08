package Item;

public class Vhs extends Midia {

	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() > 0)
			this.titulo = titulo;
	}

	public Vhs(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		this.titulo = titulo;
	}

	public Vhs() {
		super();
	}

	@Override
	public String toString() {
		return "Vhs [titulo=" + titulo + ", toString()=" + super.toString() + "]";
	}
	
	

}
