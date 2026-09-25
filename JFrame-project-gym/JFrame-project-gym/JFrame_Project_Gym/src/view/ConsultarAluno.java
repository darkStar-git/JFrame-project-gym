package view;

import javax.swing.*;
import java.awt.*;

public class ConsultarAluno extends JFrame {

    private JLabel lblCpf;
    private JTextField txtCpf;
    private JButton btnConsultar;

    public ConsultarAluno() {

        setTitle("Consultar Aluno");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        lblCpf = new JLabel("Digite o CPF do aluno:");
        lblCpf.setFont(new Font("Arial", Font.PLAIN, 12));
        lblCpf.setBounds(50, 40, 200, 20);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(50, 65, 300, 30);
        add(txtCpf);

        btnConsultar = new JButton("CONSULTAR");
        btnConsultar.setBounds(50, 120, 300, 35);
        btnConsultar.setBackground(new Color(30, 30, 30));
        btnConsultar.setForeground(Color.WHITE);
        btnConsultar.setFocusPainted(false);
        add(btnConsultar);
    }

    // Getters para permitir acesso aos campos e botões no Controller
    
    public JTextField getTxtCpf() { return txtCpf; }
    public JButton getBtnConsultar() { return btnConsultar; }
}