package entities;

import java.util.Date;

public class Usuario {
	protected String nomeCompleto;
	protected String email;
	protected String senha;
	protected String DtNascimento;
	protected int perfilDoUsuario;
	//1- usuario normal
	//2- admin
	
	
	public Usuario(String nomeCompleto, String email, String senha, String dtNascimento, int perfilDoUsuario) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
		DtNascimento = dtNascimento;
		this.perfilDoUsuario = perfilDoUsuario;
	}


	public Usuario() {
		
	}
	
	
	protected String getNomeCompleto() {
		return nomeCompleto;
	}
	protected void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getSenha() {
		return senha;
	}
	protected void setSenha(String senha) {
		this.senha = senha;
	}
	protected String getDtNascimento() {
		return DtNascimento;
	}
	protected void setDtNascimento(String dtNascimento) {
		DtNascimento = dtNascimento;
	}
	protected int getPerfilDoUsuario() {
		return perfilDoUsuario;
	}
	protected void setPerfilDoUsuario(int perfilDoUsuario) {
		this.perfilDoUsuario = perfilDoUsuario;
	}

	
	
}
