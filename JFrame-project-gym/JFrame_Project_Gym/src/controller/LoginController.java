package controller;

import view.TelaLogin;
import view.JanelaAluno;
import view.JanelaAtendente;
import view.JanelaProfessor;
import view.JanelaDevs;

import javax.swing.JOptionPane;

public class LoginController {

    private TelaLogin view;

    public LoginController(TelaLogin view) {
        this.view = view;

        // Remove ouvintes antigos (evita múltiplos disparos)
        for (java.awt.event.ActionListener al : this.view.getBtnEntrar().getActionListeners()) {
            this.view.getBtnEntrar().removeActionListener(al);
        }
        for (java.awt.event.ActionListener al : this.view.getBtnDevs().getActionListeners()) {
            this.view.getBtnDevs().removeActionListener(al);
        }

        // Registra os novos ouvintes
        this.view.getBtnEntrar().addActionListener(e -> realizarLogin());
        this.view.getBtnDevs().addActionListener(e -> abrirJanelaDevs());
    }

    private void realizarLogin() {
        String usuario = view.getUsuario().toLowerCase().trim();

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Digite o usuário!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Esconde a tela de login imediatamente antes de instanciar a próxima
        view.setVisible(false);

        if (usuario.equals("aluno")) {
            view.dispose(); // Libera memória da tela de login
            JanelaAluno janela = new JanelaAluno();
            new JanelaAlunoController(janela);
            janela.setVisible(true);

        } else if (usuario.equals("atendente")) {
            view.dispose();
            JanelaAtendente janela = new JanelaAtendente();
            new JanelaAtendenteController(janela);
            janela.setVisible(true);

        } else if (usuario.equals("professor")) {
            view.dispose();
            JanelaProfessor janela = new JanelaProfessor();
            new JanelaProfessorController(janela);
            janela.setVisible(true);

        } else {
            // Se o usuário não for válido, reexibe o login
            view.setVisible(true);
            JOptionPane.showMessageDialog(
                    view,
                    "Usuário inválido! Digite 'aluno', 'atendente' ou 'professor'.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void abrirJanelaDevs() {
        JanelaDevs janela = new JanelaDevs(view);
        new JanelaDevController(janela);
        janela.setVisible(true);
    }
}