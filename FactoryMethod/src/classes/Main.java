package classes;

import java.util.Scanner;

public class Main {
	
	private static Scanner ler = new Scanner(System.in);
	private static String nome;
	private static String genero;
	
	public static void main(String[] args) {
		
		String mensagem;
		Fabrica fabrica;
		
		System.out.printf("Informe seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Informe seu genero: \n");
		System.out.printf("Masculino (M)\n");
		System.out.printf("Feminino (F)\n");
		System.out.printf("Indefinido (I)\n");
		System.out.printf(">>> ");
		
		genero = ler.nextLine();
		
		genero = genero.toLowerCase();
		
		
		if(!genero.equals("m") && !genero.equals("f") && !genero.equals("i")) {
			mensagem = "Opção inválida!";
		}
		
		else {
			fabrica = new Fabrica();
			mensagem = fabrica.criarPessoa(nome, genero);
			
		}
		
		System.out.printf(mensagem);
		
	}

}
