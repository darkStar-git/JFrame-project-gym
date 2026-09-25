package controller;

import view.JanelaAluno;
import view.VisualizarTreino;
import view.MeusDados;
import view.MinhaMatricula;
import view.TelaLogin;

import java.awt.event.ActionListener;

public class JanelaAlunoController {

    private JanelaAluno view;

    public JanelaAlunoController(JanelaAluno view) {
        this.view = view;

        // Limpa ouvintes antigos
        removerListeners(this.view.getBtnTreino());
        removerListeners(this.view.getBtnDados());
        removerListeners(this.view.getBtnMatricula());
        removerListeners(this.view.getBtnSair());

        // Associa os novos ouvintes
        this.view.getBtnTreino().addActionListener(e -> abrirVisualizarTreino());
        this.view.getBtnDados().addActionListener(e -> abrirMeusDados());
        this.view.getBtnMatricula().addActionListener(e -> abrirMinhaMatricula());
        this.view.getBtnSair().addActionListener(e -> sair());
    }

    private void removerListeners(javax.swing.JButton btn) {
        if (btn != null) {
            for (ActionListener al : btn.getActionListeners()) {
                btn.removeActionListener(al);
            }
        }
    }

    private void abrirVisualizarTreino() {
        VisualizarTreino tela = new VisualizarTreino();
        new VisualizarTreinoController(tela);
        tela.setVisible(true);
    }

    private void abrirMeusDados() {
        MeusDados tela = new MeusDados();
        new MeusDadosController(tela);
        tela.setVisible(true);
    }

    private void abrirMinhaMatricula() {
        MinhaMatricula tela = new MinhaMatricula();
        new MinhaMatriculaController(tela);
        tela.setVisible(true);
    }

    private void sair() {
        view.dispose();
        TelaLogin loginView = new TelaLogin();
        new LoginController(loginView);
        loginView.setVisible(true);
    }
}