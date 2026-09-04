package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // Eventos
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtNome.getText().isEmpty()
                        || txtCpf.getText().isEmpty()
                        || txtEmail.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            CadastrarAluno.this,
                            "Preencha todos os campos!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            CadastrarAluno.this,
                            "Aluno cadastrado com sucesso!",
                            "Cadastro",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtNome.setText("");
                txtCpf.setText("");
                txtEmail.setText("");

                txtNome.requestFocus();
            }
        });
    }
}
