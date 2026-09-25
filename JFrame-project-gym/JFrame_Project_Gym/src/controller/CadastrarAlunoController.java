package controller;

import view.CadastrarAluno;
import javax.swing.*;

public class CadastrarAlunoController {

    private CadastrarAluno view;

    public CadastrarAlunoController(CadastrarAluno view) {
        this.view = view;

        // Associa os botões da tela aos métodos deste Controller
        this.view.getBtnCadastrar().addActionListener(e -> cadastrar());
        this.view.getBtnLimpar().addActionListener(e -> limpar());
    }

    private void cadastrar() {
        if (view.getTxtNome().getText().isEmpty()
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
    }

    private void limpar() {
        view.getTxtNome().setText("");
        view.getTxtCpf().setText("");
        view.getTxtEmail().setText("");

        view.getTxtNome().requestFocus();
    }
}