package controller;

import view.CadastrarAluno;

import javax.swing.*;

import DAO.cadastrarAlunoDAO;
import model.Treino;
import model.Aluno;
public class CadastrarAlunoController {

    private CadastrarAluno view;

    public CadastrarAlunoController(CadastrarAluno view) {
        this.view = view;

        // Associa os botões da tela aos métodos deste Controller
        this.view.getBtnCadastrar().addActionListener(e -> cadastrar());
        this.view.getBtnLimpar().addActionListener(e -> limpar());
    }

    private void cadastrar() {
    	String nome =view.getNome();
    	String cpf = view.getCpf();
    	String email = view.getEmail();
        
        if (view.getTxtNome().getText().isEmpty()
        		|| view.getTxtNome().getText().isEmpty()
                || view.getTxtCpf().getText().isEmpty()
                || view.getTxtEmail().getText().isEmpty()) {
        	

            JOptionPane.showMessageDialog(
                    view,
                    "Preencha todos os campos!",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    view,
                    "Aluno cadastrado com sucesso!",
                    "Cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        Aluno aluno = new Aluno(nome,cpf, email);

        // Executa a persistência via DAO
        cadastrarAlunoDAO dao = new cadastrarAlunoDAO();
        dao.adicionar(aluno);

        JOptionPane.showMessageDialog(view, "Aluno cadastrado com sucesso!");
        view.getBtnLimpar();
        view.dispose();
    }

    private void limpar() {
        view.getTxtNome().setText("");
        view.getTxtCpf().setText("");
        view.getTxtEmail().setText("");

        view.getTxtNome().requestFocus();
    }
}