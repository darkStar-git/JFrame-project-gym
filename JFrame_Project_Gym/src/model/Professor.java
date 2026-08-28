package model;

import java.time.LocalDate;

public class Professor extends Pessoa {
	private String  cref;
	private String especialidades;
	
	public Professor(String nome, LocalDate dataNasc, String email, String cpf, String UF, String cep, String senha) {
		super(nome, dataNasc, email, cpf, UF, cep, senha);
		// TODO Auto-generated constructor stub
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


	
	
	
}
