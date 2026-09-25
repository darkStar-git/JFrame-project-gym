package view;

import javax.swing.*;
import java.awt.*;

public class EditarTreino extends JFrame {

    private JTextField txtCpfAluno;
    private JTextArea txtDescricaoTreino;
    private JButton btnBuscar;
    private JButton btnSalvar;

    public EditarTreino() {
        setTitle("Editar Treino");
        setSize(450, 430);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel lblCpf = new JLabel("CPF do Aluno:");
        lblCpf.setBounds(40, 20, 230, 20);
        add(lblCpf);

        txtCpfAluno = new JTextField();
        txtCpfAluno.setBounds(40, 45, 230, 30);
        add(txtCpfAluno);

        btnBuscar = new JButton("BUSCAR");
        btnBuscar.setBounds(280, 45, 110, 30);
        btnBuscar.setBackground(new Color(30, 30, 30));
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setFocusPainted(false);
        add(btnBuscar);

        JLabel lblTreino = new JLabel("Descrição do Treino:");
        lblTreino.setBounds(40, 85, 350, 20);
        add(lblTreino);

        txtDescricaoTreino = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtDescricaoTreino);
        scroll.setBounds(40, 110, 350, 180);
        add(scroll);

        btnSalvar = new JButton("ATUALIZAR TREINO");
        btnSalvar.setBounds(40, 310, 350, 35);
        btnSalvar.setBackground(new Color(30, 30, 30));
        btnSalvar.setForeground(Color.WHITE);
        btnSalvar.setFocusPainted(false);
        add(btnSalvar);
    }

    public String getCpfAluno() {
        return txtCpfAluno.getText().trim();
    }

    public String getDescricaoTreino() {
        return txtDescricaoTreino.getText().trim();
    }

    public void setDescricaoTreino(String texto) {
        txtDescricaoTreino.setText(texto);
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnSalvar() {
        return btnSalvar;
    }
}