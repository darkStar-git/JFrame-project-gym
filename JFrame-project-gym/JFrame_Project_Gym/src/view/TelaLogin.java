package view;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private JButton btnDesenvolvedores;

    public TelaLogin() {
        setTitle("Academia PNF - Login");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(null);
        painelCentral.setPreferredSize(new Dimension(400, 430));
        painelCentral.setBackground(new Color(245, 245, 245));

        // Logo
        JLabel lblLogo = new JLabel();
        java.net.URL imgURL = getClass().getResource("/images/logo.png");
        if (imgURL != null) {
            ImageIcon logoIcon = new ImageIcon(imgURL);
            Image image = logoIcon.getImage().getScaledInstance(160, 80, Image.SCALE_SMOOTH);
            lblLogo.setIcon(new ImageIcon(image));
        }
        lblLogo.setBounds(120, 15, 160, 80);
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        painelCentral.add(lblLogo);

        // Usuário
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(50, 110, 300, 20);
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 12));
        painelCentral.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(50, 130, 300, 35);
        painelCentral.add(txtUsuario);

        // Senha
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(50, 175, 300, 20);
        lblSenha.setFont(new Font("Arial", Font.BOLD, 12));
        painelCentral.add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(50, 195, 300, 35);
        painelCentral.add(txtSenha);

        // Botão Entrar
        btnEntrar = new JButton("ENTRAR");
        btnEntrar.setBounds(50, 250, 300, 40);
        btnEntrar.setBackground(new Color(30, 30, 30));
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFont(new Font("Arial", Font.BOLD, 13));
        painelCentral.add(btnEntrar);

        // Botão Desenvolvedores
        btnDesenvolvedores = new JButton("Créditos / Desenvolvedores");
        btnDesenvolvedores.setBounds(50, 305, 300, 30);
        btnDesenvolvedores.setFont(new Font("Arial", Font.PLAIN, 11));
        btnDesenvolvedores.setContentAreaFilled(false);
        btnDesenvolvedores.setBorderPainted(false);
        btnDesenvolvedores.setForeground(new Color(80, 80, 80));
        btnDesenvolvedores.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelCentral.add(btnDesenvolvedores);

        add(painelCentral);
    }

    // Getters para uso do Controller
    public String getUsuario() {
        return txtUsuario.getText();
    }

    public String getSenha() {
        return new String(txtSenha.getPassword());
    }

    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public JButton getBtnDevs() {
        return btnDesenvolvedores;
    }
}