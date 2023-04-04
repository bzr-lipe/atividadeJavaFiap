package entities;

import java.util.Scanner;

public class Gerente extends Usuario{
	Scanner sc = new Scanner (System.in);
	
	public int senhaAdministrativa = 1234;
	// 1234 = Senha administrativa
	 

	public Gerente(String nomeCompleto, String email, String senha, String dtNascimento, int perfilDoUsuario) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
		this.DtNascimento = dtNascimento;
		this.perfilDoUsuario = perfilDoUsuario;
	}
	
	public int menuAdministrativo() {
		System.out.println("Digite a senha administrativa para acessar: ");
		int senha = sc.nextInt();
		while (senha != senhaAdministrativa ) {
			System.out.println("Senha Incorreta, Tente novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("================================");
		String arr[] = this.nomeCompleto.split(" ", 2);
		System.out.println("Olá "+ arr[0]); 
		System.out.println();
		System.out.println("1. Cadastrar novo usuário");
		System.out.println("2. Exibir usuários");
		System.out.println("3. Alterar Dados usuários");
		int escolha = sc.nextInt();
		while (escolha > 3 || escolha<1) {
			System.out.println("Opção Inválida: ");
			escolha = sc.nextInt();
		}
		
		return escolha;
	}
	
	public void resumoAdmin(Gerente g1) {
		System.out.println("Nome Completo : " +g1.getNomeCompleto());
		System.out.println("Email : " +g1.getEmail());
		System.out.println("Data de Nascimento : " +g1.getDtNascimento());
	    System.out.println("Perfil do Usuário : Administrativo" );
		System.out.println("Senha : " +g1.getSenha());
		System.out.println("SENHA ADMINISTRATIVA: " +senhaAdministrativa);
	}
	
	
	
	public void resumoFuncionario(Usuario user) {
		System.out.println("Nome Completo : " +user.getNomeCompleto());
		System.out.println("Email : " +user.getEmail());
		System.out.println("Data de Nascimento : " +user.getDtNascimento());
		if(user.getPerfilDoUsuario() == 1) {
			System.out.println("Perfil do Usuário : Comum" );
		}else if (user.getPerfilDoUsuario() == 2) {
			System.out.println("Perfil do Usuário : Administrativo" );
		}
		System.out.println("Senha : " +user.getSenha());
	}

	
	
	

}
