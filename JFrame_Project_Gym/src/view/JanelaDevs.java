package view;

import javax.swing.*;
import java.awt.*;

public class JanelaDevs extends JDialog {

    public JanelaDevs(Frame owner) {
        super(owner, "Desenvolvedores", true);
        setSize(580, 520); // Largura expandida para 580px e altura para 520px
        setLocationRelativeTo(owner);
        setLayout(null);
        setResizable(false);

        JLabel lblTitulo = new JLabel("Desenvolvedores", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(20, 15, 525, 25);
        add(lblTitulo);

        JPanel painelIntegrantes = new JPanel();
        painelIntegrantes.setLayout(new GridLayout(4, 1, 12, 12));

        // Dados dos 4 integrantes: {Nome, Caminho da Foto}
        String[][] integrantes = new String[][]{
                {"José Antônio", "/images/dev1.png"},
                {"Carlos Henrique", "/images/dev2.png"},
                {"Nicolly Leal", "/images/dev1.png"},
                {"Rafael Da hora", "/images/dev1.png"}
        };

        for (int i = 0; i < integrantes.length; i++) {
            JPanel pDev = new JPanel(null);
            pDev.setBackground(new Color(240, 240, 240));

            JLabel lblFoto = new JLabel();

            // Verifica se a foto existe para evitar erros
            java.net.URL imgUrl = getClass().getResource(integrantes[i][1]);
            if (imgUrl != null) {
                ImageIcon imgOriginal = new ImageIcon(imgUrl);
                // Foto aumentada para 80x80
                Image imgScale = imgOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(imgScale));
            } else {
                lblFoto.setText("[Foto]");
                lblFoto.setFont(new Font("Arial", Font.PLAIN, 10));
                lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
                lblFoto.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            }
            lblFoto.setBounds(10, 5, 80, 80); // Quadrado da foto expandido
            pDev.add(lblFoto);

            JLabel lblNome = new JLabel(integrantes[i][0]);
            lblNome.setFont(new Font("Arial", Font.BOLD, 15));
            lblNome.setBounds(110, 35, 390, 22); // Alinhado verticalmente com a nova imagem
            pDev.add(lblNome);

            painelIntegrantes.add(pDev);
        }

        painelIntegrantes.setBounds(20, 50, 525, 370);
        add(painelIntegrantes);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.setBounds(230, 435, 120, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(e -> dispose());
        add(btnFechar);
    }
}