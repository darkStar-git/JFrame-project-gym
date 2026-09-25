package view;

import javax.swing.*;
import java.awt.*;

public class VisualizarTreino extends JFrame {

    private JTextArea txtTreino;
    private JButton btnFechar;

    public VisualizarTreino() {
        setTitle("Visualizar Treino");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel lblTitulo = new JLabel("Ficha de Treino", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(50, 20, 335, 25);
        add(lblTitulo);

        txtTreino = new JTextArea();
        txtTreino.setEditable(false);
        txtTreino.setFont(new Font("Monospaced", Font.PLAIN, 13));

        JScrollPane scroll = new JScrollPane(txtTreino);
        scroll.setBounds(50, 55, 335, 180);
        add(scroll);

        btnFechar = new JButton("FECHAR");
        btnFechar.setBounds(50, 250, 335, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.setFocusPainted(false);
        add(btnFechar);
    }

    public void setTextoTreino(String texto) {
        txtTreino.setText(texto);
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }
}