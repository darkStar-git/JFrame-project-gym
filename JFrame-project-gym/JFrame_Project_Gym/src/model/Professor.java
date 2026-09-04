package model;

import java.time.LocalDate;

public class Professor extends Pessoa {
	private String cref;
	private String especialidades;

	// Construtor completo com todos os atributos da Pessoa + Professor
	public Professor(String nome, LocalDate dataNasc, String email, String cpf, String UF, String cep, String senha, String cref, String especialidades) {
		super(nome, dataNasc, email, cpf, UF, cep, senha);
		this.cref = cref;
		this.especialidades = especialidades;
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public String toString() {
		return getNome() + " (CREF: " + cref + ")";
	}
}