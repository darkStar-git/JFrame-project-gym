package view;

import javax.swing.*;
import java.awt.*;

public class MinhaMatricula extends JFrame {

    private JLabel lblPlano;
    private JLabel lblStatus;
    private JLabel lblVencimento;
    private JButton btnFechar;

    public MinhaMatricula() {
        setTitle("Minha Matrícula");
        setSize(400, 280);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel lblTitulo = new JLabel("Status da Matrícula", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(40, 20, 300, 25);
        add(lblTitulo);

        lblPlano = new JLabel("Plano: Mensal Anual");
        lblPlano.setBounds(40, 65, 300, 25);
        lblPlano.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblPlano);

        lblStatus = new JLabel("Status: Ativa");
        lblStatus.setBounds(40, 100, 300, 25);
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblStatus);

        lblVencimento = new JLabel("Vencimento: 15/11/2026");
        lblVencimento.setBounds(40, 135, 300, 25);
        lblVencimento.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblVencimento);

        btnFechar = new JButton("FECHAR");
        btnFechar.setBounds(40, 180, 300, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.setFocusPainted(false);
        add(btnFechar);
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }
}