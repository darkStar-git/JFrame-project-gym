package view;

import javax.swing.*;
import java.awt.*;

public class JanelaDevs extends JDialog {

    public JanelaDevs(Frame owner) {
        super(owner, "Desenvolvedores", true);
        setSize(400, 360);
        setLocationRelativeTo(owner);
        setLayout(null);
        setResizable(false);

        JLabel lblTitulo = new JLabel("Desenvolvedores", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setBounds(20, 15, 345, 25);
        add(lblTitulo);

        JPanel painelIntegrantes = new JPanel();
        painelIntegrantes.setLayout(new GridLayout(4, 1, 8, 8));

        // Dados dos 4 integrantes: {Nome, Caminho da Foto}
        String[][] integrantes = new String[][]{
                {"Integrante 1", "/images/dev1.jpg"},
                {"Integrante 2", "/images/dev2.jpg"},
                {"Integrante 3", "/images/dev3.jpg"},
                {"Integrante 4", "/images/dev4.jpg"}
        };

        for (int i = 0; i < integrantes.length; i++) {
            JPanel pDev = new JPanel(null);
            pDev.setBackground(new Color(240, 240, 240));

            JLabel lblFoto = new JLabel();

            // Verifica se a foto existe para evitar erros
            java.net.URL imgUrl = getClass().getResource(integrantes[i][1]);
            if (imgUrl != null) {
                ImageIcon imgOriginal = new ImageIcon(imgUrl);
                Image imgScale = imgOriginal.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(imgScale));
            } else {
                lblFoto.setText("[Foto]");
                lblFoto.setFont(new Font("Arial", Font.PLAIN, 10));
                lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
                lblFoto.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            }
            lblFoto.setBounds(10, 5, 45, 45);
            pDev.add(lblFoto);

            JLabel lblNome = new JLabel(integrantes[i][0]);
            lblNome.setFont(new Font("Arial", Font.BOLD, 13));
            lblNome.setBounds(65, 17, 250, 20);
            pDev.add(lblNome);

            painelIntegrantes.add(pDev);
        }

        painelIntegrantes.setBounds(20, 50, 345, 220);
        add(painelIntegrantes);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.setBounds(140, 280, 105, 30);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.addActionListener(e -> dispose());
        add(btnFechar);
    }
}