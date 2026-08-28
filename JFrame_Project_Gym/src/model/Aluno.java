package model;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	private  String objetivo;
	
	public Aluno(String nome, LocalDate dataNasc, String email, String cpf, String UF, String cep, String senha) {
		super(nome, dataNasc, email, cpf, UF, cep, senha);
		this.objetivo = objetivo;
		
	}
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
}
