package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Gerente;

public class App{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindx ao nosso App");

		System.out.println("--------------------------");
		System.out.println("Comece fazendo o cadastro de um usuário Administrador");
		System.out.println("Nome Completo: ");
		
		String nomeCompleto = sc.nextLine();
		while (nomeCompleto.length() < 5) {
			System.out.println("Nome Completo: ");
			nomeCompleto = sc.nextLine();
		}
		
		System.out.println("Email:");
		String email = sc.next();
		while (validarEmail(email) == false){
			System.out.println("Email inválido, Digite novamente: ");
			email = sc.next();
		} 
		
	
		System.out.println("Data de Nascimento (DD/MM/AAAA):  ");
		String dataNascimento = sc.next();
		while (validarData(dataNascimento) == false) {
			System.out.println("A data deve ser digitada no formato (DD/MM/AAAA)");
			dataNascimento = sc.next();
		}
		
		System.out.println("Cadastre sua Senha Pessoal:");
		String senha = sc.next();
		Gerente g1 = new Gerente(nomeCompleto, email, senha, dataNascimento, 2);
		g1.resumoAdmin(g1);
		
		
		g1.menuAdministrativo();
		
		
	}
	
	//validarEmail(String email) - valida a presença de @
	public static boolean validarEmail(String email) {	
		List<Character> chars = new ArrayList<>();
		
		for (char ch : email.toCharArray()) {
			chars.add(ch);
		}
		for (int i =0; i < chars.size(); i++) {
			if(chars.get(i)=='@') {
				return true;
			}
		}
		return false;
	}
	
	//validarData(String dataNascimento) - Valida o formato da data
	public static boolean validarData(String dataNascimento) {	
		if (dataNascimento.charAt(2) == '/' && dataNascimento.charAt(5) == '/' ) {
			return true;
		}
		return false;
	}

}
