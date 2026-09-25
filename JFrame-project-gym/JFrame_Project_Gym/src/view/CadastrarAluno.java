package view;

import javax.swing.*;
import java.awt.*;

public class CadastrarAluno extends JFrame {

    private JLabel lblNome;
    private JLabel lblCpf;
    private JLabel lblEmail;

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtEmail;

    private JButton btnCadastrar;
    private JButton btnLimpar;

    public CadastrarAluno() {

        setTitle("Cadastrar Aluno");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        // Nome
        lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNome.setBounds(50, 40, 100, 20);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(50, 60, 300, 30);
        add(txtNome);

        // CPF
        lblCpf = new JLabel("CPF:");
        lblCpf.setFont(new Font("Arial", Font.PLAIN, 12));
        lblCpf.setBounds(50, 100, 100, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 120, 300, 30);
        add(txtCpf);

        // Email
        lblEmail = new JLabel("E-mail:");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 12));
        lblEmail.setBounds(50, 160, 100, 20);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(50, 180, 300, 30);
        add(txtEmail);

        // Botão cadastrar
        btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setBounds(50, 230, 140, 35);
        btnCadastrar.setBackground(new Color(30, 30, 30));
        btnCadastrar.setForeground(Color.WHITE);
        btnCadastrar.setFocusPainted(false);
        add(btnCadastrar);

        // Botão limpar
        btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBounds(210, 230, 140, 35);
        btnLimpar.setFocusPainted(false);
        add(btnLimpar);
    }

    // Getters para permitir acesso aos campos e botões no Controller
    public JTextField getTxtNome() { return txtNome; }
    public JTextField getTxtCpf() { return txtCpf; }
    public JTextField getTxtEmail() { return txtEmail; }
    public JButton getBtnCadastrar() { return btnCadastrar; }
    public JButton getBtnLimpar() { return btnLimpar; }
}