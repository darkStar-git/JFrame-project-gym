package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image image = logoIcon.getImage().getScaledInstance(160, 80, Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(image));
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

        // Botão Desenvolvedores (posicionado logo abaixo do botão Entrar)
        btnDesenvolvedores = new JButton("Créditos / Desenvolvedores");
        btnDesenvolvedores.setBounds(50, 305, 300, 30);
        btnDesenvolvedores.setFont(new Font("Arial", Font.PLAIN, 11));
        btnDesenvolvedores.setContentAreaFilled(false);
        btnDesenvolvedores.setBorderPainted(false);
        btnDesenvolvedores.setForeground(new Color(80, 80, 80));
        btnDesenvolvedores.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelCentral.add(btnDesenvolvedores);

        add(painelCentral);


        // AÇÕES


        // Validação
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText().trim();
                String senha = new String(txtSenha.getPassword()).trim();

                if (usuario.equalsIgnoreCase("professor") && senha.equalsIgnoreCase("prof123")) {
                    new JanelaProfessor().setVisible(true);
                    dispose();
                }// 3. Acesso do ALUNO
                else if (usuario.equalsIgnoreCase("aluno") && senha.equalsIgnoreCase("aluno123")) {
                    new JanelaAluno().setVisible(true);
                    dispose();
                }
                else if (usuario.equalsIgnoreCase("atendente") && senha.equalsIgnoreCase("atendente123")) {
                    new JanelaAtendente().setVisible(true);
                    dispose();
                }                
                else {
                    JOptionPane.showMessageDialog(
                            TelaLogin.this,
                            "Usuário ou senha incorretos!",
                            "Erro de Autenticação",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

                
            }
        });

        // Abre a JanelaDevs diretamente
        btnDesenvolvedores.addActionListener(e -> {
            new JanelaDevs(TelaLogin.this).setVisible(true);
        });
    }
}
