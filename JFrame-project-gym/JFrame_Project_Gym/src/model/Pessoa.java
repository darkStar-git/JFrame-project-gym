package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private LocalDate dataNasc;
	private String email;
	private String cpf;
	private String UF;
	private String cep;
	private String senha;
	
	public Pessoa(String nome, LocalDate dataNasc, String email, String cpf, String UF, String cep, String senha) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.email = email;
		this.cpf = cpf;
		this.UF = UF;
		this.cep = cep;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getIdade() {
		return dataNasc;
	}

	public void setIdade(LocalDate idade) {
		this.dataNasc = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
