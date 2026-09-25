package DAO;
import java.sql.Connection;
import  DAO.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Aluno;
import model.Pessoa;

public class cadastrarAlunoDAO {

	private Connection connection;
	
	 public cadastrarAlunoDAO() {
	        this.connection = new ConnectionFactory().getConnection();
	    }

	    public void adicionar(Aluno aluno) {
	        String sql = "insert into tbAluno " +
	                "(nome,cpfAluno,emailAluno) " +
	                "values (?,?,?)";
	        

	        try {
	            PreparedStatement stmt = connection.prepareStatement(sql);
	            
	            stmt.setString(1, aluno.getNome());
	            stmt.setString(2, aluno.getCpf());
	            stmt.setString(3, aluno.getEmail());
	           
	           
	            stmt.execute();
	            stmt.close();

	        } catch (SQLException e) {
	            throw new RuntimeException("Erro ao adicionar treino: " + e.getMessage(), e);
	        }
	    }
	}
	

