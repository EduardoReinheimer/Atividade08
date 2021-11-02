package Item;

public class Livro extends Item {
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length() > 0)
			this.autor = autor;
	}

	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		setAutor(autor);
	}

	public Livro() {
		super();
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", toString()=" + super.toString() + "]";
	}
	
	

}
