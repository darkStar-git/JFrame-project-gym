package view;

import javax.swing.*;
import java.awt.*;

public class CadastrarTreino extends JFrame {

    private JTextField txtCpfAluno;
    private JTextArea txtDescricaoTreino;
    private JButton btnSalvar;
    private JButton btnLimpar;

    public CadastrarTreino() {
        setTitle("Cadastrar Treino");
        setSize(450, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel lblCpf = new JLabel("CPF do Aluno:");
        lblCpf.setBounds(40, 20, 350, 20);
        add(lblCpf);

        txtCpfAluno = new JTextField();
        txtCpfAluno.setBounds(40, 45, 350, 30);
        add(txtCpfAluno);

        JLabel lblTreino = new JLabel("Descrição do Treino:");
        lblTreino.setBounds(40, 85, 350, 20);
        add(lblTreino);

        txtDescricaoTreino = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtDescricaoTreino);
        scroll.setBounds(40, 110, 350, 180);
        add(scroll);

        btnSalvar = new JButton("CADASTRAR");
        btnSalvar.setBounds(40, 310, 165, 35);
        btnSalvar.setBackground(new Color(30, 30, 30));
        btnSalvar.setForeground(Color.WHITE);
        btnSalvar.setFocusPainted(false);
        add(btnSalvar);

        btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBounds(225, 310, 165, 35);
        btnLimpar.setFocusPainted(false);
        add(btnLimpar);
    }

    public String getCpfAluno() {
        return txtCpfAluno.getText().trim();
    }

    public String getDescricaoTreino() {
        return txtDescricaoTreino.getText().trim();
    }

    public void limparCampos() {
        txtCpfAluno.setText("");
        txtDescricaoTreino.setText("");
    }

    public JButton getBtnSalvar() {
        return btnSalvar;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }
}