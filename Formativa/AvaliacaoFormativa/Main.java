package AvaliacaoFormativa;

public class Main extends Usuario {
	public static void main(String[] args) {
	
		Usuario user = new Usuario(1,"Matheus",124774,"Adm","thuezin");
		System.out.println("O id é: " + user.getId());
		System.out.println("O nome é: " +user.getNome());
		System.out.println("A senha é " +user.getPassword());
		System.out.println("Permissão : " +user.getPermissao());
		System.out.println("Nome de usuário: " +user.getUsuario());
		
	}
}
