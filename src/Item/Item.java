package Item;

public class Item {
	private int codigo;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo > 0)
			this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 0)
			this.descricao = descricao;
	}

	public Item(int codigo, String descricao) {
		super();
		setCodigo(codigo);
		setDescricao(descricao);
	}

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
	

}
