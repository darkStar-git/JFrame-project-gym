package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Treino;

public class TreinoDAO {
    private Connection connection;

    public TreinoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Treino treino) {
        String sql = "insert into tbTreino " +
                "(cpfAluno, descricaoTreino) " +
                "values (?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, treino.getCpfAluno());
            stmt.setString(2, treino.getDescricao());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar treino: " + e.getMessage(), e);
        }
    }
}