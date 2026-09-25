package view;

import javax.swing.*;
import java.awt.*;

public class MeusDados extends JFrame {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtEmail;
    private JButton btnFechar;

    public MeusDados() {
        setTitle("Meus Dados");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(40, 20, 300, 20);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(40, 45, 300, 30);
        txtNome.setEditable(false);
        add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(40, 85, 300, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(40, 110, 300, 30);
        txtCpf.setEditable(false);
        add(txtCpf);

        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setBounds(40, 150, 300, 20);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(40, 175, 300, 30);
        txtEmail.setEditable(false);
        add(txtEmail);

        btnFechar = new JButton("FECHAR");
        btnFechar.setBounds(40, 225, 300, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.setFocusPainted(false);
        add(btnFechar);
    }

    public void setDados(String nome, String cpf, String email) {
        txtNome.setText(nome);
        txtCpf.setText(cpf);
        txtEmail.setText(email);
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }
}