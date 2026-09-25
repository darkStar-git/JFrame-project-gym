package view;

import javax.swing.*;
import java.awt.*;

public class EditarAluno extends JFrame {

    private JLabel lblCpf;
    private JLabel lblNome;

    private JTextField txtCpf;
    private JTextField txtNome;

    private JButton btnEditar;

    public EditarAluno() {

        setTitle("Editar Aluno");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        // CPF
        lblCpf = new JLabel("CPF do aluno:");
        lblCpf.setBounds(50, 40, 150, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 60, 300, 30);
        add(txtCpf);

        // Novo nome
        lblNome = new JLabel("Novo nome:");
        lblNome.setBounds(50, 110, 150, 20);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(50, 130, 300, 30);
        add(txtNome);

        // Botão
        btnEditar = new JButton("SALVAR ALTERAÇÃO");
        btnEditar.setBounds(50, 190, 300, 35);
        btnEditar.setBackground(new Color(30, 30, 30));
        btnEditar.setForeground(Color.WHITE);
        btnEditar.setFocusPainted(false);
        add(btnEditar);
    }

    // Getters para permitir acesso aos campos e ao botão no Controller
    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }
}