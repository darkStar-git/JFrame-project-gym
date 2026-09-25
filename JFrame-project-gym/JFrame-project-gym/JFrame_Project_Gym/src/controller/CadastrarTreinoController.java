package controller;

import view.CadastrarTreino;
import model.Treino;
import DAO.TreinoDAO;
import javax.swing.JOptionPane;

public class CadastrarTreinoController {

    private CadastrarTreino view;

    public CadastrarTreinoController(CadastrarTreino view) {
        this.view = view;

        this.view.getBtnSalvar().addActionListener(e -> cadastrar());
        this.view.getBtnLimpar().addActionListener(e -> this.view.limparCampos());
    }

    private void cadastrar() {
        String cpf = view.getCpfAluno();
        String descricao = view.getDescricaoTreino();

        if (cpf.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Instancia a Model com os dados da View
        Treino treino = new Treino(cpf, descricao);

        // Executa a persistência via DAO
        TreinoDAO dao = new TreinoDAO();
        dao.adicionar(treino);

        JOptionPane.showMessageDialog(view, "Treino cadastrado com sucesso!");
        view.limparCampos();
        view.dispose();
    }
}