package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atendente extends Pessoa{
	private String  cref;

	public Atendente(String nome, LocalDate dataNasc, String email, String cpf, String UF, String cep, String senha) {
		super(nome, dataNasc, email, cpf, UF, cep, senha);
		this.cref = cref;
		// TODO Auto-generated constructor stub
	}





}
