package view;

import javax.swing.*;
import java.awt.*;

public class JanelaDevs extends JDialog {

    private JButton btnFechar;
    private JPanel painelIntegrantes;

    public JanelaDevs(Frame owner) {
        super(owner, "Desenvolvedores", true);
        setSize(580, 520);
        setLocationRelativeTo(owner);
        setLayout(null);
        setResizable(false);

        JLabel lblTitulo = new JLabel("Desenvolvedores", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBounds(20, 15, 525, 25);
        add(lblTitulo);

        painelIntegrantes = new JPanel();
        painelIntegrantes.setLayout(new GridLayout(4, 1, 12, 12));
        painelIntegrantes.setBounds(20, 50, 525, 370);
        add(painelIntegrantes);

        btnFechar = new JButton("Fechar");
        btnFechar.setBounds(230, 435, 120, 35);
        btnFechar.setBackground(new Color(30, 30, 30));
        btnFechar.setForeground(Color.WHITE);
        btnFechar.setFocusPainted(false);
        add(btnFechar);
    }

    public void carregarDesenvolvedores(String[][] integrantes) {
        painelIntegrantes.removeAll();

        for (String[] integrante : integrantes) {
            JPanel pDev = new JPanel(null);
            pDev.setBackground(new Color(240, 240, 240));

            JLabel lblFoto = new JLabel();

            java.net.URL imgUrl = getClass().getResource(integrante[1]);
            if (imgUrl != null) {
                ImageIcon imgOriginal = new ImageIcon(imgUrl);
                Image imgScale = imgOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(imgScale));
            } else {
                lblFoto.setText("[Foto]");
                lblFoto.setFont(new Font("Arial", Font.PLAIN, 10));
                lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
                lblFoto.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            }
            lblFoto.setBounds(10, 5, 80, 80);
            pDev.add(lblFoto);

            JLabel lblNome = new JLabel(integrante[0]);
            lblNome.setFont(new Font("Arial", Font.BOLD, 15));
            lblNome.setBounds(110, 35, 390, 22);
            pDev.add(lblNome);

            painelIntegrantes.add(pDev);
        }

        painelIntegrantes.revalidate();
        painelIntegrantes.repaint();
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }
}