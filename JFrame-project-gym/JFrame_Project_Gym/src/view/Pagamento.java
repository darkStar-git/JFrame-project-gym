package view;

import javax.swing.*;
import java.awt.*;

public class Pagamento extends JFrame {

    private JLabel lblCpf;
    private JLabel lblValor;

    private JTextField txtCpf;
    private JTextField txtValor;

    private JButton btnRegistrar;

    public Pagamento() {

        setTitle("Registrar Pagamento");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        lblCpf = new JLabel("CPF do aluno:");
        lblCpf.setBounds(50, 40, 150, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 60, 300, 30);
        add(txtCpf);

        lblValor = new JLabel("Valor da mensalidade:");
        lblValor.setBounds(50, 110, 200, 20);
        add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(50, 130, 300, 30);
        add(txtValor);

        btnRegistrar = new JButton("REGISTRAR PAGAMENTO");
        btnRegistrar.setBounds(50, 190, 300, 35);
        btnRegistrar.setBackground(new Color(30, 30, 30));
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setFocusPainted(false);
        add(btnRegistrar);
    }

    // Getters de dados e componentes
    public String getCpf() {
        return txtCpf.getText().trim();
    }

    public String getValor() {
        return txtValor.getText().trim();
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    // Métodos utilitários de mensagem
    public void exibirMensagemAviso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    public void exibirMensagemSucesso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Pagamento", JOptionPane.INFORMATION_MESSAGE);
    }

    public void limparCampos() {
        txtCpf.setText("");
        txtValor.setText("");
    }
}