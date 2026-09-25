package controller;

import view.JanelaProfessor;
import view.CadastrarTreino;
import view.EditarTreino;
import view.ConsultarAluno;
import view.TelaLogin;

import java.awt.event.ActionListener;

public class JanelaProfessorController {

    private JanelaProfessor view;

    public JanelaProfessorController(JanelaProfessor view) {
        this.view = view;

        // Limpa ouvintes antigos
        removerListeners(this.view.getBtnCadastrar());
        removerListeners(this.view.getBtnEditar());
        removerListeners(this.view.getBtnConsultar());
        removerListeners(this.view.getBtnSair());

        // Associa os ouvintes aos botões
        if (this.view.getBtnCadastrar() != null) {
            this.view.getBtnCadastrar().addActionListener(e -> abrirCadastrarTreino());
        }

        if (this.view.getBtnEditar() != null) {
            this.view.getBtnEditar().addActionListener(e -> abrirEditarTreino());
        }

        if (this.view.getBtnConsultar() != null) {
            this.view.getBtnConsultar().addActionListener(e -> abrirConsultarAluno());
        }

        if (this.view.getBtnSair() != null) {
            this.view.getBtnSair().addActionListener(e -> sair());
        }
    }

    private void removerListeners(javax.swing.JButton btn) {
        if (btn != null) {
            for (ActionListener al : btn.getActionListeners()) {
                btn.removeActionListener(al);
            }
        }
    }

    private void abrirCadastrarTreino() {
        CadastrarTreino tela = new CadastrarTreino();
        new CadastrarTreinoController(tela);
        tela.setVisible(true);
    }

    private void abrirEditarTreino() {
        EditarTreino tela = new EditarTreino();
        new EditarTreinoController(tela);
        tela.setVisible(true);
    }

    private void abrirConsultarAluno() {
        ConsultarAluno tela = new ConsultarAluno();
        new ConsultarAlunoController(tela);
        tela.setVisible(true);
    }

    private void sair() {
        view.dispose();
        TelaLogin loginView = new TelaLogin();
        new LoginController(loginView);
        loginView.setVisible(true);
    }
}