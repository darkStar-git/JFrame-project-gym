package model;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	private String objetivo;

	public Aluno(String nome, LocalDate dataNasc, String email, String cpf, String UF, String cep, String senha, String objetivo) {
		super(nome, dataNasc, email, cpf, UF, cep, senha);
		this.objetivo = objetivo;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	// Sobrescrevemos o toString para exibir o nome do aluno no JComboBox e JList facilmente
	@Override
	public String toString() {
		return getNome() + " (CPF: " + getCpf() + ")";
	}
}