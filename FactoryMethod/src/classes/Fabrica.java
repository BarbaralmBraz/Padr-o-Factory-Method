package classes;

import java.util.ArrayList;

import interfaces.Pessoa;

public class Fabrica {
	
	private ArrayList<Pessoa> pessoas;
	
	public Fabrica() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public String criarPessoa(String nome, String genero) {
		
		String mensagem = " Bem-vindo ";
		Pessoa pessoa = new Indefinido(nome, genero);
		
		switch (genero){
		
		
		case "m":
			pessoa = new Homem(nome, genero);
			break;
			
		case "f":
			pessoa = new Mulher(nome, genero);
			break;
			
			
		default:
			break;
			
		
	}
		pessoas.add(pessoa);
		mensagem += pessoa.getPrefixo() + ".";
		return mensagem;
		
	}
	

}
