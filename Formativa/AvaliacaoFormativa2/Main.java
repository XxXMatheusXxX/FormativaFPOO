package AvaliacaoFormativa2;

public class Main {
	public static void main(String[] args) {
	Fisica pessoa = new Fisica("Matheus","388272883", "564882830-4");
	System.out.println("O nome é: "+ pessoa.getNome());
	System.out.println("O cpf é: "+ pessoa.getCpf());
	System.out.println("O rg é: " + pessoa.getRg());
	}
}
