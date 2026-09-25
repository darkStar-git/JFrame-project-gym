package controller;

import view.JanelaAtendente;
import view.CadastrarAluno;
import view.EditarAluno;
import view.ConsultarAluno;
import view.TelaLogin;
import view.LiberarAcesso;

import javax.swing.*;
import java.awt.*;

public class JanelaAtendenteController {

    private JanelaAtendente view;

    public JanelaAtendenteController(JanelaAtendente view) {
        this.view = view;

        // Eventos dos botões do painel principal
        this.view.getBtnCadastrar().addActionListener(e -> abrirCadastrarAluno());
        this.view.getBtnConsultar().addActionListener(e -> abrirConsultarAluno());
        this.view.getBtnMatricula().addActionListener(e -> gerenciarMatricula());
        this.view.getBtnAcesso().addActionListener(e -> abrirLiberarAcesso());
        this.view.getBtnSair().addActionListener(e -> voltarLogin());

        // Eventos dos itens da barra de menu
        this.view.getItemCadastrar().addActionListener(e -> abrirCadastrarAluno());
        this.view.getItemEditar().addActionListener(e -> abrirEditarAluno());
        this.view.getItemConsultar().addActionListener(e -> abrirConsultarAluno());
        this.view.getItemMatricula().addActionListener(e -> gerenciarMatricula());
        this.view.getItemLiberarAcesso().addActionListener(e -> abrirLiberarAcesso());
        this.view.getItemSair().addActionListener(e -> voltarLogin());
    }

    // ==========================================================
    // ABRIR TELAS
    // ==========================================================

    private void abrirCadastrarAluno() {
        CadastrarAluno tela = new CadastrarAluno();
        new CadastrarAlunoController(tela);
        tela.setVisible(true);
    }

    private void abrirEditarAluno() {
        new EditarAluno().setVisible(true);
    }

    private void abrirConsultarAluno() {
        new ConsultarAluno().setVisible(true);
    }

    // No JanelaAtendenteController.java:

    private void abrirLiberarAcesso() {
        // Substitua o JOptionPane antigo por estas 3 linhas:
        LiberarAcesso tela = new LiberarAcesso();
        new LiberarAcessoController(tela);
        tela.setVisible(true);
    }

    // ==========================================================
    // GERENCIAR MATRÍCULA
    // ==========================================================

    private void gerenciarMatricula() {

        String[] operacoes = {
                "Nova matrícula",
                "Renovar matrícula"
        };

        JComboBox<String> comboOperacao = new JComboBox<>(operacoes);
        JTextField txtCpf = new JTextField();

        String[] planos = {
                "Plano Básico",
                "Plano Premium",
                "Plano Anual"
        };

        JComboBox<String> comboPlano = new JComboBox<>(planos);

        JPanel painel = new JPanel(new GridLayout(0, 1, 5, 5));

        painel.add(new JLabel("Operação:"));
        painel.add(comboOperacao);
        painel.add(new JLabel("CPF do aluno:"));
        painel.add(txtCpf);
        painel.add(new JLabel("Plano:"));
        painel.add(comboPlano);

        int resposta = JOptionPane.showConfirmDialog(
                view,
                painel,
                "Gerenciar Matrícula",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (resposta != JOptionPane.OK_OPTION) {
            return;
        }

        String cpf = txtCpf.getText().trim();

        // Validação
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(
                    view,
                    "Digite o CPF do aluno!",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String operacao = (String) comboOperacao.getSelectedItem();
        String plano = (String) comboPlano.getSelectedItem();

        JOptionPane.showMessageDialog(
                view,
                operacao
                        + " realizada com sucesso!\n"
                        + "CPF: "
                        + cpf
                        + "\n"
                        + "Plano: "
                        + plano,
                "Matrícula",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // ==========================================================
    // VOLTAR PARA LOGIN
    // ==========================================================

    private void voltarLogin() {
        view.dispose(); // Fecha a tela do atendente

        TelaLogin loginView = new TelaLogin();
        new LoginController(loginView);
        loginView.setVisible(true);
    }
}