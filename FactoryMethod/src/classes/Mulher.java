package classes;



import interfaces.Pessoa;

public class Mulher implements Pessoa {
	
	private String nome;
	private String genero;
	private String prefixo;
	
	
	public Mulher(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
		this.prefixo = "Srª ";
		
	}
	
public String getPrefixo() {
		
		String retorno = this.prefixo + this.nome;
		return retorno;
	}

	@Override
	public String getNome() {
		
		return this.nome;
	}

	@Override
	public String getGenero() {
		
		return this.genero;
	}

	@Override
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
		
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public void setGenero(String genero) {
		this.genero = genero;
		
	}
}
