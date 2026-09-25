package view;

import javax.swing.*;
import java.awt.*;

public class LiberarAcesso extends JFrame {

    private JLabel lblCpf;
    private JTextField txtCpf;
    private JButton btnLiberar;

    public LiberarAcesso() {
        setTitle("Liberar Acesso");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        lblCpf = new JLabel("CPF do aluno:");
        lblCpf.setBounds(50, 40, 150, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 65, 300, 30);
        add(txtCpf);

        btnLiberar = new JButton("LIBERAR ACESSO");
        btnLiberar.setBounds(50, 120, 300, 35);
        btnLiberar.setBackground(new Color(30, 30, 30));
        btnLiberar.setForeground(Color.WHITE);
        btnLiberar.setFocusPainted(false);
        add(btnLiberar);
    }

    // Getters e métodos auxiliares para a interface
    public String getCpf() {
        return txtCpf.getText().trim();
    }

    public JButton getBtnLiberar() {
        return btnLiberar;
    }

    public void exibirMensagemAviso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    public void exibirMensagemSucesso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Acesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public int exibirConfirmacao(String mensagem) {
        return JOptionPane.showConfirmDialog(this, mensagem, "Confirmação", JOptionPane.YES_NO_OPTION);
    }
}